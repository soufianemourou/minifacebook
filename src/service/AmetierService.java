/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Ametier;
import bean.Utilisateur;
import java.util.ArrayList;

/**
 *
 * @author soufiane
 */
public class AmetierService {
 public Ametier finByCinDemandeur(String CinDemandeur ,ArrayList<Ametier> ameties){
     for (int i = 0; i < ameties.size(); i++) {
         Ametier a = ameties.get(i);
         if(a.getCinDemandeur().equals(CinDemandeur)){
             return a;
         } 
     }
     return null;
 }
  public Ametier finByCinAccepteur(String CinAccepteur ,ArrayList<Ametier> ameties){
     for (int i = 0; i < ameties.size(); i++) {
         Ametier a = ameties.get(i);
         if(a.getCinAccepteur().equals(CinAccepteur)){
             return a;
         } 
     }
     return null;
 }
 
}
