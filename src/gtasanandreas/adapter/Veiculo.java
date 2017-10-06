/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gtasanandreas.adapter;

import gtasanandreas.strategy.Acao;

/**
 *
 * @author Cesar Murilo
 */
public class Veiculo {
    
    protected Acao dirigindo;

    public Acao getModo() {
        return dirigindo;
    }

    public void setModo(Acao modo) {
        this.dirigindo = modo;
    }
    
    public void movimentar(){
        dirigindo.direcao();
    }
   
}
