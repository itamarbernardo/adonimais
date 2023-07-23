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
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author 20131D12GR0338
 */

@Table(name="ong")
@Entity
public class Ong {
    
    @Id
    @GeneratedValue
    private int codigo;
    
    @Column(length = 30)
    private String nome;
    
    @OneToOne
    private Endereco endereco;
   
    @Column(length = 15)
    private String telefone1;
    
    @Column(length = 15)
    private String telefone2;
    
    @Column(length = 60)
    private String login;
    
    @Column(length = 70)
    private String senha;
    
    @Column(length = 70)
    private String confirmarSenha;
    
        
    @Column(length = 60)
    private String email;
    
    public Ong(int codigo, String nome, Endereco endereco, String telefone1, String telefone2, String login, String senha, String confirmarSenha, String email){
        this.codigo = codigo;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone1 = telefone1;
        this.telefone2 = telefone2;
        this.login = login;
        this.senha = senha;
        this.confirmarSenha = confirmarSenha;
        this.email = email;
        
        
    }

    @Deprecated
    public Ong(){
        
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    public String getTelefone1() {
        return telefone1;
    }

    public void setTelefone1(String telefone1) {
        this.telefone1 = telefone1;
    }

    public String getTelefone2() {
        return telefone2;
    }

    public void setTelefone2(String telefone2) {
        this.telefone2 = telefone2;
    }

   public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getConfirmarSenha() {
        return confirmarSenha;
    }

    public void setConfirmarSenha(String confirmarSenha) {
        this.confirmarSenha = confirmarSenha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
