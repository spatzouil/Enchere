/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package articles;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;


@Named(value = "article")
@RequestScoped
public class Article {
    
    private String nom;
    private String description;
    private String prix;
    private String dateFin;
    
    public String ajouterArticle(){
        if(nom.length()>0 && description.length()>0 && prix.length()>0 && dateFin.length()>0)
            return "article";
        else{
            return "articleAjouter";
        }
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrix() {
        return prix;
    }

    public void setPrix(String prix) {
        this.prix = prix;
    }

    public String getDateFin() {
        return dateFin;
    }

    public void setDateFin(String dateFin) {
        this.dateFin = dateFin;
    }
    
    
    
    
    
}
