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
import javax.persistence.Table;



@Table(name="animal")
@Entity
public class Animal {
    @Id
    @GeneratedValue
    private int codigo;
    
    @Column(length = 30)
    private String tipoDeAnimal;
    
    @Column(length = 1000)
    private String descricao;
    
    @Column(length = 150)
    private String URLImagem;
    
 
    public Animal(int codigo, String tipoDeAnimal, String descricao, String URLImagem){
        
        this.codigo = codigo;
        this.URLImagem = URLImagem;
        this.descricao = descricao;
        this.tipoDeAnimal = tipoDeAnimal;
    }

    @Deprecated
    public Animal(){
  
    }

    public String getTipoDeAnimal() {
        return tipoDeAnimal;
    }

    public void setTipoDeAnimal(String tipoDeAnimal) {
        this.tipoDeAnimal = tipoDeAnimal;
    }
    

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getURLImagem() {
        return URLImagem;
    }

    public void setURLImagem(String URLImagem) {
        this.URLImagem = URLImagem;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    
    
}
