/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gtasanandreas.observer;

import java.util.ArrayList;
import java.util.List;


public class Vida { 
    private int vidaDoPersonagem = 100;


    public void setVida(int vida) {
        this.vidaDoPersonagem = vida;
    }

    public int retornarVida() {
        return vidaDoPersonagem;
    }

    public void diminuirVida(int dano){
        this.vidaDoPersonagem = vidaDoPersonagem - dano;
    }
    
    public void aumentarVida(int aspirina){
        this.vidaDoPersonagem = vidaDoPersonagem + aspirina;
    }
    
    //private List<Observador> observadores = new ArrayList<>();
    
    
    //public void addObservador(Observador observador) {
    //    this.observadores.add(observador);
    //}
    //private void notificarTodos(){
    //   for(Observador observador:observadores){
    //        observador.notifica();
    //   }
    //}
}
