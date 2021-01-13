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
public class Ametier {
    private String cinDemandeur;
    private String cinAccepteur;
    private double dateDeDemande;
    private  double dateAcceptation;

    @Override
    public String toString() {
        return "Ametier{" + "cinDemandeur=" + cinDemandeur + ", cinAccepteur=" + cinAccepteur + ", dateDeDemande=" + dateDeDemande + ", dateAcceptation=" + dateAcceptation + '}';
    }


    public Ametier(String cinDemandeur, String cinAccepteur, double dateDeDemande, double dateAcceptation) {
        this.cinDemandeur = cinDemandeur;
        this.cinAccepteur = cinAccepteur;
        this.dateDeDemande = dateDeDemande;
        this.dateAcceptation = dateAcceptation;
    }

    public Ametier(String cinDemandeur, String cinAccepteur, double dateDeDemande) {
        this.cinDemandeur = cinDemandeur;
        this.cinAccepteur = cinAccepteur;
        this.dateDeDemande = dateDeDemande;
    }

    public Ametier(String cinDemandeur, String cinAccepteur) {
        this.cinDemandeur = cinDemandeur;
        this.cinAccepteur = cinAccepteur;
    }

    public Ametier() {
    }

    public String getCinDemandeur() {
        return cinDemandeur;
    }

    public void setCinDemandeur(String cinDemandeur) {
        this.cinDemandeur = cinDemandeur;
    }

    public String getCinAccepteur() {
        return cinAccepteur;
    }

    public void setCinAccepteur(String cinAccepteur) {
        this.cinAccepteur = cinAccepteur;
    }

    public double getDateDeDemande() {
        return dateDeDemande;
    }

    public void setDateDeDemande(double dateDeDemande) {
        this.dateDeDemande = dateDeDemande;
    }

    public double getDateAcceptation() {
        return dateAcceptation;
    }

    public void setDateAcceptation(double dateAcceptation) {
        this.dateAcceptation = dateAcceptation;
    }
    

   
}
