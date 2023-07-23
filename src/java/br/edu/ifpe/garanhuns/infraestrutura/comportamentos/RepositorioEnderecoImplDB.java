/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.garanhuns.infraestrutura.comportamentos;

import br.edu.ifpe.garanhuns.infraestrutura.dao.DaoManagerHiber;
import br.edu.ifpe.garanhuns.negocio.Endereco;
import java.util.List;

/**
 *
 * @author pc
 */
public class RepositorioEnderecoImplDB implements RepositorioGenerico <Endereco>{

    @Override
    public void inserir(Endereco t) {
        DaoManagerHiber.getInstance().persist(t);
    }

    @Override
    public void alterar(Endereco t) {
        DaoManagerHiber.getInstance().update(t);
    }

    @Override
    public Endereco recuperar(int codigo) { 
        return (Endereco)DaoManagerHiber.getInstance().recover("from Endereco where codigo="+codigo).get(0);
    }

    @Override
    public void excluir(Endereco t) {
        DaoManagerHiber.getInstance().delete(t);
    }

    @Override
    public List<Endereco> recuperarTodos() {
        return DaoManagerHiber.getInstance().recover("from Endereco");
    }
    
}
