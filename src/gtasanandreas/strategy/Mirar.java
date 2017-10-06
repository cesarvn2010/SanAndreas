/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gtasanandreas.strategy;

import gtasanandreas.Personagem;

/**
 *
 * @author Cesar Murilo
 */
public class Mirar implements Acao{
    
    Personagem p = new Personagem();

    @Override
    public void acao() {
        System.out.println("mirando");
    }

    @Override
    public void direcao() {
        System.out.println("mirando de dentro do carro.");
    }
}
