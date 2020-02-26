/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enchere;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named(value = "enchere")
@RequestScoped
public class Enchere {
    
    private int montant;
    
    public String enchereAjouter(){
        return "enchereAjouter";
    }

    public int getMontant() {
        return montant;
    }

    public void setMontant(int montant) {
        this.montant = montant;
    }
    
    public String nouvelleEnchere(){
        if(montant>=0){
            return "enchere";
        }else{
            return "enchereAjouter";
        }
    }
    
    
    
}
