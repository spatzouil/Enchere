/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enchere;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author baudson3u
 */

@Named(value = "encheres")
@RequestScoped
public class Encheres {
    
    public String encheresPerso(){
        return "encheresPerso";
    }
    
    public String enchere(){
        return "enchere";
    }
    
}
