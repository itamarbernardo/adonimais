/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.web.construtores;

import br.edu.ifpe.garanhuns.negocio.Animal;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;
/**
 *
 * @author 20131D12GR0338
 */
@ManagedBean(name = "bAnimal")
@ViewScoped
public class AnimalBuilder {
    
    private int codigo;
    private String tipoDeAnimal;
    private String descricao;
    private String URLImagem;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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
    
 
   public Animal construir(){
       return new Animal(this.codigo, this.tipoDeAnimal, this.descricao, this.URLImagem);
   }
    
}
