/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gtasanandreas;

/**
 *
 * @author Cesar Murilo
 */
public class Save {
    private String state;
 
    public void setState(String state) {
        System.out.println("Mudando estado para após: " + state);
        this.state = state;
    }
 
    public Memento saveState() {
        System.out.println("Salvando o jogo...");
        return new Memento(this.state);
    }
 
    public void restoreState(Memento memento) {
        this.state = memento.getSavedState();
        System.out.println("Jogo carregado com sucesso para após: " + state);
    }
 
    public static class Memento {
        private final String state;

        public Memento(String stateToSave) {
            this.state = stateToSave;
        }
 
        private String getSavedState() {
            return this.state;
        }
    }
}
