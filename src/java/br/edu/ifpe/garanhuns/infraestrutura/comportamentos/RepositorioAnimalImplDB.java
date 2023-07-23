/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.garanhuns.infraestrutura.comportamentos;

import br.edu.ifpe.garanhuns.infraestrutura.dao.DaoManagerHiber;
import br.edu.ifpe.garanhuns.negocio.Animal;
import java.util.List;

/**
 *
 * @author pc
 */
public class RepositorioAnimalImplDB implements RepositorioGenerico <Animal>{

    @Override
    public void inserir(Animal t) {
        DaoManagerHiber.getInstance().persist(t);
    }

    @Override
    public void alterar(Animal t) {
        DaoManagerHiber.getInstance().update(t);
    }

    @Override
    public Animal recuperar(int codigo) {
        return (Animal)DaoManagerHiber.getInstance().recover("from Animal where codigo="+codigo).get(0);
    }

    @Override
    public void excluir(Animal t) {
        DaoManagerHiber.getInstance().delete(t);
    }

    @Override
    public List<Animal> recuperarTodos() {
        return DaoManagerHiber.getInstance().recover("from Animal");
    }
    
}
