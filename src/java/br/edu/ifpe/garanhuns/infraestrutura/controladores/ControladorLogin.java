/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifpe.garanhuns.infraestrutura.controladores;

import br.edu.ifpe.garanhuns.infraestrutura.comportamentos.RepositorioGenerico;
import br.edu.ifpe.garanhuns.infraestrutura.comportamentos.RepositorioOngImplDB;
import br.edu.ifpe.garanhuns.negocio.Ong;
import br.edu.ifpe.web.construtores.OngBuilder;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

/**
 *
 * @author pc
 */
@ManagedBean( name="controleLogin")
@SessionScoped
public class ControladorLogin {
    
    private Ong ongLogada;
    private RepositorioGenerico<Ong> repositorioOng = new RepositorioOngImplDB();
    
    public String realizaLogin(OngBuilder ong){
        
        Ong uAux = ((RepositorioOngImplDB)this.repositorioOng).recuperarPorLogin(ong.getLogin());
        
        if(uAux == null){
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("A Senha ou o Login estão incorretos!"));
            return null;
        }
        
        if(!uAux.getSenha().equals(ong.getSenha())){
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("A Senha ou o Login estão incorretos!"));
            return null;
        }
        
        this.ongLogada = uAux;
        
        ((HttpSession)FacesContext.getCurrentInstance().getExternalContext().getSession(true)).setAttribute("logado", uAux);
        
        return "indexUser.xhtml";
    }
    
    public Ong getOngLogada(){
        return ongLogada;
    }
    
    public void setOngLogada(Ong ongLogada){
        this.ongLogada = ongLogada;
    }
    
}
