/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gtasanandreas.lugares;

import gtasanandreas.decorator.Arma;
import gtasanandreas.decorator.PistolaTaurus;
import gtasanandreas.decorator.MiraLaser;
import gtasanandreas.decorator.Silenciador;

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
      a = new Silenciador(a);
      a.montar();
    }
    
    public void EquiparTauruscomMira() {
      a = new MiraLaser(a);
      a.montar(); 
    }
}
