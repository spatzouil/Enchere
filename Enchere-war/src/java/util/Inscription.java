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
@Named(value = "inscription")
@RequestScoped
public class Inscription {
    
    @NotEmpty
    private String pseudo;
    
    @NotEmpty
    private String mdp;
    
    @NotEmpty
    private String nom;
    
    @NotEmpty
    private String prenom;
    
    @NotEmpty
    private String adresse;
    
    @NotEmpty
    private String numeroBanquaire;

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

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getNumeroBanquaire() {
        return numeroBanquaire;
    }

    public void setNumeroBanquaire(String numeroBanquaire) {
        this.numeroBanquaire = numeroBanquaire;
    }
    
    
    
    public String inscription(){
        return "inscription";
    }
    
    public String inscriptionOK(){
        boolean inscriptionValide = true;
        if(inscriptionValide){
            return "accueil";
        }else{
            return "inscription";
        }
    }
    
}
