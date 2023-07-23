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

/**
 *
 * @author 20131D12GR0338
 */
@Table(name="endereco")
@Entity
public class Endereco {
    
    @Id
    @GeneratedValue
    private int codigo;
    
    @Column(length= 50)
    private String cep;
   
    @Column(length = 40)
    private String estado;
    
    @Column(length = 70)
    private String rua;
    
    @Column(length = 70)
    private String cidade;
    
    @Column(length = 50)
    private String logradouro;
    
    @Column(length = 7)
    private String numero;

    public Endereco(int codigo, String cep, String estado, String rua, String cidade, String logradouro, String numero){
        this.codigo = codigo;
        this.cep = cep;
        this.estado = estado;
        this.rua = rua;
        this.cidade = cidade;
        this.logradouro = logradouro;
        this.numero = numero;

        
    }
    
    @Deprecated        
    public Endereco(){
        
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    
     public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
    
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

   

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    
    
}
