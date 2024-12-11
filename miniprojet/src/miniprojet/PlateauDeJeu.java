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



    

    public void afficherPlateau() {
        System.out.println("Plateau de jeu:");
        for (int i = 0; i < tentatives.size(); i++) {
            System.out.println("Tentative " + (i + 1) + ": " + tentatives.get(i) + " -> " + reponses.get(i));
        }
    }
    public boolean estVictoire(ArrayList<Combinaison> tentatives, Combinaison combinaisonSecrete){
        boolean Victoire=false;
        int Tour_actuelle=tentatives.size();
        for (int i=0; i<Tour_actuelle; i++){
            Combinaison tentative=tentatives.get(i);
            if(tentative==combinaisonSecrete){
                Victoire=true;
        }
        }
        return Victoire;
    }

    public boolean estDefaite(ArrayList<Combinaison> tentatives, int nbToursMax) {
        boolean Defaite=false;
        if (tentatives.size() >= nbToursMax){
            Defaite=true;
        }
        return Defaite;
    }
}
