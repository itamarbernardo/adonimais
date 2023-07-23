/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.garanhuns.infraestrutura.controladores;

import br.edu.ifpe.garanhuns.infraestrutura.comportamentos.RepositorioEnderecoImplDB;
import br.edu.ifpe.garanhuns.infraestrutura.comportamentos.RepositorioGenerico;
import br.edu.ifpe.garanhuns.negocio.Endereco;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name = "controleEndereco")
@SessionScoped
public class ControladorEndereco {
    
    private RepositorioGenerico <Endereco> repositorioEndereco = null;
    private Endereco selectedEndereco;
    
    public ControladorEndereco(){
        this.repositorioEndereco = new RepositorioEnderecoImplDB();
    }
    
    
    public String inserir(Endereco endereco){
        this.repositorioEndereco.inserir(endereco);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Parabéns!", "O Endereço foi cadastrado com sucesso!"));

        return "apresentaEndereco.xhtml";
    }
    
    public String alterar(Endereco endereco){
        this.repositorioEndereco.alterar(endereco);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Parabéns!", "O Endereço foi alterado com sucesso!"));
        
        return "apresentaEndereco.xhtml";
    }
    
    public Endereco recuperar(int codigo){
        return this.repositorioEndereco.recuperar(codigo);    
    }
    
    public void excluir(Endereco endereco){
        this.repositorioEndereco.excluir(endereco);
    }
    
    public List<Endereco> recuperarTodos(){
        return this.repositorioEndereco.recuperarTodos();
    }

    public RepositorioGenerico<Endereco> getRepositorioEndereco() {
        return repositorioEndereco;
    }

    public void setRepositorioEndereco(RepositorioGenerico<Endereco> repositorioEndereco) {
        this.repositorioEndereco = repositorioEndereco;
    }

    public Endereco getSelectedEndereco() {
        return selectedEndereco;
    }

    public void setSelectedEndereco(Endereco selectedEndereco) {
        this.selectedEndereco = selectedEndereco;
    }
    
    
}
