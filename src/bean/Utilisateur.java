/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author soufiane
 */
public class Utilisateur {
    private String cin ;
    private String nom;
    private String prenom;
    private String ville;
    private String  id;
    private String pwd;

    public Utilisateur(String cin, String nom, String prenom, String ville, String id, String pwd) {
        this.cin = cin;
        this.nom = nom;
        this.prenom = prenom;
        this.ville = ville;
        this.id = id;
        this.pwd = pwd;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
    
    @Override
    public String toString() {
        return "Utilisateur{" + "cin=" + cin + ", nom=" + nom + ", prenom=" + prenom + ", ville=" + ville + ", id=" + id + '}';
    }

   

    public Utilisateur(String cin, String nom, String prenom, String ville, String id) {
        this.cin = cin;
        this.nom = nom;
        this.prenom = prenom;
        this.ville = ville;
        this.id = id;
    }

    public Utilisateur(String cin, String nom, String prenom, String ville) {
        this.cin = cin;
        this.nom = nom;
        this.prenom = prenom;
        this.ville = ville;
    }

    public Utilisateur(String cin, String nom, String prenom) {
        this.cin = cin;
        this.nom = nom;
        this.prenom = prenom;
    }

    public Utilisateur() {
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
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

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    

   
    
}
