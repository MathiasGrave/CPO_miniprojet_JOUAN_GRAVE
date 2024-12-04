/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miniprojet;

/**
 *
 * @author felix
 */
import java.util.ArrayList;

public class PlateauDeJeu {

    private Combinaison combinaisonSecrete;
    private ArrayList<Combinaison> tentatives;
    private ArrayList<String> reponses;
    private int nbToursMax;

    public PlateauDeJeu(Combinaison combinaisonSecrete, int nbToursMax) {
        this.combinaisonSecrete = combinaisonSecrete;
        this.nbToursMax = nbToursMax;
        this.tentatives = new ArrayList<>();
        this.reponses = new ArrayList<>();
    }

    public [] proposerCombinaison(Combinaison tentative) {
        tentatives.add(tentative);
        return tentatives

    

    public void afficherPlateau() {
        System.out.println("Plateau de jeu:");
        for (int i = 0; i < tentatives.size(); i++) {
            System.out.println("Tentative " + (i + 1) + ": " + tentatives.get(i) + " -> " + reponses.get(i));
        }
    }

    public boolean estVictoire() {
        if (!tentatives.isEmpty()) {
            Combinaison derniereTentative = tentatives.get(tentatives.size() - 1);
            return derniereTentative.equals(combinaisonSecrete);
        }
        return false;
    }

    public boolean estDefaite() {
        return tentatives.size() >= nbToursMax;
    }

    private String genererIndices(Combinaison tentative) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
  
}
