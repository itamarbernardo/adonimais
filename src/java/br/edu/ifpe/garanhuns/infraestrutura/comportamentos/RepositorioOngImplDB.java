/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.garanhuns.infraestrutura.comportamentos;

import br.edu.ifpe.garanhuns.infraestrutura.dao.DaoManagerHiber;
import br.edu.ifpe.garanhuns.negocio.Ong;
import java.util.List;

/**
 *
 * @author pc
 */
public class RepositorioOngImplDB implements RepositorioGenerico <Ong>{

    @Override
    public void inserir(Ong t) {
        DaoManagerHiber.getInstance().persist(t);
    }

    @Override
    public void alterar(Ong t) {
        DaoManagerHiber.getInstance().update(t);
    }

    @Override
    public Ong recuperar(int codigo) {
        return (Ong)DaoManagerHiber.getInstance().recover("from Ong where codigo="+codigo).get(0);
    }

    @Override
    public void excluir(Ong t) {
        DaoManagerHiber.getInstance().delete(t);
    }
    
     public Ong recuperarPorLogin(String login){
        try{
            return (Ong)DaoManagerHiber.getInstance().recoverSQL("from Ong where login='"+login+"'").get(0);
        }catch(IndexOutOfBoundsException in){
            return null;
        }
    }

    @Override
    public List<Ong> recuperarTodos() {
        return DaoManagerHiber.getInstance().recover("from Ong");
    }
    
}
