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
public class ArmaDecorator implements Arma {
    
    
    public Arma arma;
    
    public ArmaDecorator(Arma arma){
        this.arma = arma;
    }
    
    @Override
    public void montar(){
        this.arma.montar();
    }
}
