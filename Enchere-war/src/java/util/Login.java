/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.validation.constraints.NotEmpty;

/**
 *
 * @author baudson3u
 */
@Named(value = "login")
@RequestScoped
public class Login {
    
    @NotEmpty
    private String pseudo;
    
    @NotEmpty
    private String mdp;

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }
    
    public String login(){
        return "login";
    }
    
    public String loginOK(){
        boolean verifLogin = true;
        if(verifLogin){
            return "accueil";
        }else{
            return "login";
        }
    }
}
