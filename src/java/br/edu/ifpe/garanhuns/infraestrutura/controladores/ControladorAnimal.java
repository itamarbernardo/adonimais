/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.garanhuns.infraestrutura.controladores;

import br.edu.ifpe.garanhuns.infraestrutura.comportamentos.RepositorioAnimalImplDB;
import br.edu.ifpe.garanhuns.infraestrutura.comportamentos.RepositorioGenerico;
import br.edu.ifpe.garanhuns.negocio.Animal;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name= "controleAnimal")
@SessionScoped
public class ControladorAnimal {
    
    private RepositorioGenerico<Animal> repositorioAnimal = null;
    private Animal selectedAnimal;

    public ControladorAnimal() {
        this.repositorioAnimal = new RepositorioAnimalImplDB();
    
    }
    
    public String inserir(Animal animal){
        this.repositorioAnimal.inserir(animal);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Parabéns!", "O Animal foi cadastrado com sucesso!"));

        return "apresentaAnimal.xhtml";
    }
    
    public String alterar(Animal animal){
        this.repositorioAnimal.alterar(animal);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Parabéns!", "O Animal foi alterado com sucesso!"));
        
        return "apresentaAnimal.xhtml";
    }
    
    public Animal recuperar(int codigo){
        return this.repositorioAnimal.recuperar(codigo);
    }
    
    public void excluir(Animal animal){
        this.repositorioAnimal.excluir(animal);
    }
    
    public List<Animal> recuperarTodos(){
        return this.repositorioAnimal.recuperarTodos();
    }

    public RepositorioGenerico<Animal> getRepositorioAnimal() {
        return repositorioAnimal;
    }

    public void setRepositorioAnimal(RepositorioGenerico<Animal> repositorioAnimal) {
        this.repositorioAnimal = repositorioAnimal;
    }

    public Animal getSelectedAnimal() {
        return selectedAnimal;
    }

    public void setSelectedAnimal(Animal selectedAnimal) {
        this.selectedAnimal = selectedAnimal;
    }
    
    
    
}
