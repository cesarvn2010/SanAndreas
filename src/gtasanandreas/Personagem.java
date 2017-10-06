/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gtasanandreas;

import gtasanandreas.lugares.Ammu_Nation;
import gtasanandreas.observer.Vida;
import gtasanandreas.strategy.Acao;

/**
 *
 * @author Cesar Murilo
 */
public class Personagem {
    
    private Acao modo;
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Vida getVida() {
        return vida;
    }

    public void setVida(Vida vida) {
        this.vida = vida;
    }
    private Vida vida = new Vida();

    public void mostraVida() {
        System.out.println(vida.retornarVida() + "% de vida");
        //return vida.retornarVida();
    }
    
    public void diminuirVida(int dano) {
        this.vida.diminuirVida(dano);
    }
    
    public void aumentarVida(int aspirina){
        this.vida.aumentarVida(aspirina);
    }
    
    public void imprimeEstadoAtual(){
            System.out.println("Estado atual: Pedestre");
    }
    
    public void executarAcao(){
        modo.acao();
    }
    
    public Acao getModo(){
        return modo;
    }
    
    public void setModo(Acao modo){
        this.modo = modo;
    }
    
    public Ammu_Nation EntrarNoAmmuNation(){
        Ammu_Nation arma = new Ammu_Nation();
        return arma;
    }
}
