/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.garanhuns.infraestrutura.comportamentos;

import br.edu.ifpe.garanhuns.infraestrutura.dao.DaoManagerHiber;
import br.edu.ifpe.garanhuns.negocio.Postagem;
import java.util.List;

/**
 *
 * @author pc
 */
public class RepositorioPostagemImplDB implements RepositorioGenerico <Postagem>{

    @Override
    public void inserir(Postagem t) {
        DaoManagerHiber.getInstance().persist(t);
    }

    @Override
    public void alterar(Postagem t) {
        DaoManagerHiber.getInstance().update(t);
    }

    @Override
    public Postagem recuperar(int codigo) {
        return (Postagem)DaoManagerHiber.getInstance().recover("from Postagem where codigo="+codigo).get(0);
    }

    @Override
    public void excluir(Postagem t) {
        DaoManagerHiber.getInstance().delete(t);
    }

    @Override
    public List<Postagem> recuperarTodos() {
        return DaoManagerHiber.getInstance().recover("from Postagem");
    }
    
}
