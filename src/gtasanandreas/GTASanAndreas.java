/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gtasanandreas;

import gtasanandreas.personagens.CarlJohnson;
import gtasanandreas.adapter.RoubarVeiculo;
import gtasanandreas.strategy.Andar;
import gtasanandreas.strategy.Acao;
import gtasanandreas.strategy.Atirar;
import gtasanandreas.strategy.Correr;
import static java.lang.Thread.sleep;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cesar Murilo
 */
public class GTASanAndreas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException  {
        // TODO code application logic here
        List<Save.Memento> savedStates = new ArrayList<>();
        Save save = new Save();
        System.out.println("");
        System.out.println("*****  Strategy  *******");
        CarlJohnson cj = new CarlJohnson();
        cj.imprimeEstadoAtual();
        Acao andar = new Andar();
        cj.setModo(andar);
        System.out.print(cj.getNome()+" está ");
        cj.executarAcao();
        Acao correr = new Correr();
        cj.setModo(correr);
        System.out.print(cj.getNome()+" está ");
        cj.executarAcao();
        save.setState("Missão 1 completada");
        savedStates.add(save.saveState());
        //travo o tempo de execução propositalmente para 
        //poder mostrar a diferença de segundos do estado do Save
        sleep(3000);
        System.out.println("");
        
        System.out.println("*****  Adapter  *******");
        System.out.println("  ");
        cj = new RoubarVeiculo();
        cj.imprimeEstadoAtual();
        Acao correrDeCarro = new Correr();
        cj.setModo(correrDeCarro);
        System.out.print(cj.getNome()+" está ");
        cj.executarAcao();
        Acao atirarDeCarro = new Atirar();
        cj.setModo(atirarDeCarro);
        System.out.print(cj.getNome()+" está ");
        cj.executarAcao();
        save.setState("Missão 2 completada");
        savedStates.add(save.saveState());
        sleep(3000);
        System.out.println("");
        
        //Decorator
        System.out.println("******  Decorator  *********");
        System.out.println(" ");
        System.out.print(cj.getNome()+" está com uma ");
        cj.EntrarNoAmmuNation().ComprarTaurus();
        System.out.println("");
        System.out.print(cj.getNome()+" está com uma ");
        cj.EntrarNoAmmuNation().EquiparTaurusComSilenciador();
        save.setState("Missão 3 completada");
        System.out.println("");
        System.out.println("********  Memento  ********");
        System.out.println("¨¨¨¨¨¨¨¨Contextualizando¨¨¨¨¨¨¨¨");
        System.out.println("------------------------------------");
        System.out.println("_ Ixa, o muleque esbarrou na tomada e desligou o video-game!");
        System.out.println("_ Vou ter que carregar meu último save...");
        System.out.println("------------------------------------");
        System.out.println("Carregando jogo...");
        sleep(3000);
        save.restoreState(savedStates.get(1));
       
        
        //Misturando Strategy com Observer
        //BigSmoke bs = new BigSmoke();
        //System.out.print(bs.getNome() + " está com "); 
        //bs.mostraVida();
        //Acao atirar = new Atirar();
        //bs.setModo(atirar);
        //System.out.print(bs.getNome()+" está ");
        //bs.executarAcao();
   
    }
    
}
