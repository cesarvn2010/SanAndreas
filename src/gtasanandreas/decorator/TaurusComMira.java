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
public class TaurusComMira extends ArmaDecorator {
    
    public TaurusComMira(Arma arma){
        /* Quando temos objetos e fazemos que uma classe herde
        as características de outra, usando "extends", é
        necessário criarmos os construtores, porém muitos 
        deles por questão de elegância se definem com o mesmo
        nome da classe pai ou superclasse, então para podermos
        diferenciar ao que nos referimos, usamos "this" para 
        a subclasse e "super" para a superclasse. */
        super(arma);
    }
    
    @Override
    public void montar(){
        super.montar();
        System.out.print(" agora com mira");
    }
}
