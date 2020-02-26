/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package articles;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;


@Named(value = "articles")
@RequestScoped
public class Articles {
    
    private String nom;
    private String categorie;
    
    public String articles(){
        return "articles";
    }
    
    public String article(){
        return "article";
    }
    
    public String articleAjouter(){
        return "articleAjouter";
    }
    
    public String articlesPerso(){
        return "articlesPerso";
    }
    
    public String searchByName(){
        return "articlesByName";
    }
    
    public String searchByCategory(){
        return "articlesByCategory";
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }
    
}
