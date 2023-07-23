/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.garanhuns.infraestrutura.controladores;

import br.edu.ifpe.garanhuns.infraestrutura.comportamentos.RepositorioGenerico;
import br.edu.ifpe.garanhuns.infraestrutura.comportamentos.RepositorioOngImplDB;
import br.edu.ifpe.garanhuns.negocio.Ong;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;


@ManagedBean(name = "controleOng")
@SessionScoped
public class ControladorOng {
    
    private RepositorioGenerico<Ong> repositorioOng = null;
    private Ong selectedOng;
    
    public ControladorOng(){
        this.repositorioOng = new RepositorioOngImplDB();
    }
    
    public String inserir(Ong ong){
        this.repositorioOng.inserir(ong);
        
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Parabéns!", "A Ong" + ong.getNome() + " foi cadastrada com sucesso!"));
        
        return "apresentaOng.xhtml";
    }
    
    public String alterar(Ong ong){
        this.repositorioOng.alterar(ong);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Parabéns!", "A Ong" + ong.getNome() + " foi alterada com sucesso!"));

        
        return "apresentaOng.xhtml";
    }
    
    public Ong recuperar(int codigo){
        return this.repositorioOng.recuperar(codigo);
    }
    
    public void excluir(Ong ong){
        this.repositorioOng.excluir(ong);
    }
    
    public List<Ong> recuperarTodos(){
        return this.repositorioOng.recuperarTodos();
    }

    public RepositorioGenerico<Ong> getRepositorioOng() {
        return repositorioOng;
    }

    public void setRepositorioOng(RepositorioGenerico<Ong> repositorioOng) {
        this.repositorioOng = repositorioOng;
    }

    public Ong getSelectedOng() {
        return selectedOng;
    }

    public void setSelectedOng(Ong selectedOng) {
        this.selectedOng = selectedOng;
    }
    
    
    
}
