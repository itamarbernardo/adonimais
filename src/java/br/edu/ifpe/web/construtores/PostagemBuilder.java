/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.web.construtores;

import br.edu.ifpe.garanhuns.negocio.Animal;
import br.edu.ifpe.garanhuns.negocio.Ong;
import br.edu.ifpe.garanhuns.negocio.Postagem;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author 20131D12GR0338
 */
@ManagedBean(name = "bPostagem")
@ViewScoped
public class PostagemBuilder {
    
    private int codigo;
    private Animal animal;
    private Ong ong;
    private String mensagem;

    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Ong getOng() {
        return ong;
    }

    public void setOng(Ong ong) {
        this.ong = ong;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
    
    
    public Postagem construir(){
        return new Postagem(this.codigo, this.animal, this.ong, this.mensagem);
    }
    
}
