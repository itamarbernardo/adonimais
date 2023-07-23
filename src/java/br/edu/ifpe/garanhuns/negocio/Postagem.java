/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.garanhuns.negocio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author 20131D12GR0338
 */

@Table(name="postagem")
@Entity
public class Postagem {
    //Pode haver uma classe sem ID?
    @Id
    @GeneratedValue
    private int codigo;
    @ManyToOne
    private Animal animal;
    @ManyToOne
    private Ong ong;
    @Column(length = 1000)
    private String mensagem;
    
    
    public Postagem(int codigo, Animal animal, Ong ong, String mensagem){
        this.codigo = codigo;
        this.animal = animal;
        this.ong = ong;
        this.mensagem = mensagem;
    }
    
    @Deprecated
    public Postagem(){
        
    }
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
  
}
