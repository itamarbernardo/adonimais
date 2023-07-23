/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.garanhuns.infraestrutura.controladores;

import br.edu.ifpe.garanhuns.infraestrutura.comportamentos.RepositorioGenerico;
import br.edu.ifpe.garanhuns.infraestrutura.comportamentos.RepositorioPostagemImplDB;
import br.edu.ifpe.garanhuns.negocio.Postagem;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author pc
 */
@ManagedBean(name = "controlePostagem")
@SessionScoped
public class ControladorPostagem {
    
    RepositorioGenerico<Postagem> repositorioPostagem = null;
    private Postagem selectedPostagem;
    
    public ControladorPostagem(){
        this.repositorioPostagem = new RepositorioPostagemImplDB();
    }
    
    public String inserir(Postagem postagem){
        this.repositorioPostagem.inserir(postagem);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Parabéns!", "A Postagem foi cadastrada com sucesso!"));
        
        
        return "apresentaPostagem.xhtml";
    }
    
    public String alterar(Postagem postagem){
        this.repositorioPostagem.alterar(postagem);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Parabéns!", "A Postagem foi alterada com sucesso!"));
        
        return "apresentaPostagem.xhtml";
    }
    
    public Postagem recuperar(int codigo){
        return this.repositorioPostagem.recuperar(codigo);
    }
    
    public void excluir(Postagem postagem){
        this.repositorioPostagem.excluir(postagem);
    }
    
    public List<Postagem> recuperarTodos(){
        return this.repositorioPostagem.recuperarTodos();
    }

    public RepositorioGenerico<Postagem> getRepositorioPostagem() {
        return repositorioPostagem;
    }

    public void setRepositorioPostagem(RepositorioGenerico<Postagem> repositorioPostagem) {
        this.repositorioPostagem = repositorioPostagem;
    }

    public Postagem getSelectedPostagem() {
        return selectedPostagem;
    }

    public void setSelectedPostagem(Postagem selectedPostagem) {
        this.selectedPostagem = selectedPostagem;
    }
    
    
    
}
