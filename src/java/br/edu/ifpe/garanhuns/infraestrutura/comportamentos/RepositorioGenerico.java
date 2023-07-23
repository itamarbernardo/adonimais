/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.garanhuns.infraestrutura.comportamentos;

import java.util.List;

/**
 *
 * @author 20131D12GR0338
 */
public interface RepositorioGenerico <T>{
    
    public void inserir(T t);
    public void alterar(T t);
    public T recuperar(int codigo);
    public void excluir(T t);
    public List<T> recuperarTodos();
    
}
