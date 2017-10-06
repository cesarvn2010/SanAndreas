
package gtasanandreas.observer;

/**
 *
 * @author SCROEDINGER
 */
public class Celular implements Observador{
    @Override
    public void notifica(){
        System.out.println("sou celular e Fui notificado");
    }
}
