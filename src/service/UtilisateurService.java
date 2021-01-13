/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Utilisateur;
import java.util.ArrayList;

/**
 *
 * @author soufiane
 */
public class UtilisateurService {

    public Utilisateur findByCin(String cin, ArrayList<Utilisateur> utilisateurs) {
        for (int i = 0; i < utilisateurs.size(); i++) {
            Utilisateur u = utilisateurs.get(i);
            if (u.getCin().equals(cin)) {
                return u;
            }
        }
        return null;
    }

    public ArrayList<Utilisateur> findByNom(String nom, ArrayList<Utilisateur> utilisateurs) {
        ArrayList<Utilisateur> resultat = new ArrayList<>();
        for (int i = 0; i < resultat.size(); i++) {
            Utilisateur u = resultat.get(i);
            if (u.getNom().equals(nom)) {
                resultat.add(u);
            }
        }
        return resultat;
    }

    public ArrayList<Utilisateur> findById(String id, ArrayList<Utilisateur> utilisateurs) {
        ArrayList<Utilisateur> resultat = new ArrayList<>();
        for (int i = 0; i < resultat.size(); i++) {
            Utilisateur u = resultat.get(i);
            if (u.getId().equals(id));
            resultat.add(u);
        }
        return resultat;
    }

    public ArrayList<Utilisateur> findByVille(String ville, ArrayList<Utilisateur> utilisateurs) {
        ArrayList<Utilisateur> resultat = new ArrayList<>();
        for (int i = 0; i < resultat.size(); i++) {
            Utilisateur u = resultat.get(i);
            if (u.getVille().equals(ville));
            resultat.add(u);
        }
        return resultat;
    }

    public int save(Utilisateur utilisateur, ArrayList<Utilisateur> utilisateurs) {
        Utilisateur loadedUtilisateur = findByCin(utilisateur.getCin(), utilisateurs);
        if (loadedUtilisateur != null) {
            return -1;
        } else {
            utilisateurs.add(utilisateur);
            return 1;
        }
    }

    public int seConnecter(String cin, String pwd, ArrayList<Utilisateur> utilisateurs) {
        Utilisateur utilisateur = findByCin(cin, utilisateurs);
        if (utilisateur == null) {
            return -1;
        } else if (!utilisateur.getPwd().equals(pwd)) {
            return -2;
        } else {
            return 1;
        }

    }

}
