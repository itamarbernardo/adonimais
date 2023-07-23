/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifpe.garanhuns.excessoes;

/**
 *
 * @author pc
 */
public class SenhaNaoConfirmadaException extends Exception{
    private String mensagem;
    
    
    public SenhaNaoConfirmadaException(String mensagem){
        this.mensagem = mensagem;
    }
    
    public String getMensagem(){
        return mensagem;
    }
    
}
