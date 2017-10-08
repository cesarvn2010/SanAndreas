/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gtasanandreas.decorator;

/**
 *
 * @author a15038480
 */
public class Silenciador extends ArmaDecorator {

    public Silenciador(Arma arma){
        super(arma);
    }
    
    @Override
    public void montar(){
        super.montar();
        System.out.println("agora com silenciador.");
    }
}
