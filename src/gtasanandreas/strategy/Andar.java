/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gtasanandreas.strategy;

/**
 *
 * @author Cesar Murilo
 */
public class Andar implements Acao {
    
    @Override
    public void acao(){
        System.out.println("andando.");
    }

    @Override
    public void direcao() {
        System.out.println("dirigindo normalmente.");
    }

   
}
