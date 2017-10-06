/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gtasanandreas.lugares;

import gtasanandreas.decorator.Arma;
import gtasanandreas.decorator.PistolaTaurus;
import gtasanandreas.decorator.TaurusComMira;
import gtasanandreas.decorator.TaurusComSilenciador;

/**
 *
 * @author Cesar Murilo
 */
public class Ammu_Nation {
    
    Arma a = new PistolaTaurus();

    public void ComprarTaurus() {
      a.montar();
    }

    public void EquiparTaurusComSilenciador() {
      a = new TaurusComSilenciador(a);
      a.montar();
    }
    
    public void EquiparTauruscomMira() {
      a = new TaurusComMira(a);
      a.montar(); 
    }
}
