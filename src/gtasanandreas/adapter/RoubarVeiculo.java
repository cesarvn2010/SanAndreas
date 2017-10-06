/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gtasanandreas.adapter;

import gtasanandreas.personagens.CarlJohnson;
import gtasanandreas.strategy.Acao;

/**
 *
 * @author Cesar Murilo
 */
public class RoubarVeiculo extends CarlJohnson {
    
    private final Veiculo v = new Veiculo();
    
    @Override
    public void imprimeEstadoAtual(){
            System.out.println("Estado atual: Motorista");
    }
    
    @Override
    public void executarAcao(){
        v.movimentar();
    }

    @Override
    public Acao getModo() {
        return v.getModo();
    }

    @Override
    public void setModo(Acao modo) {
        v.dirigindo = modo;
    }
    
}
