/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miniprojet;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Grave
 */
public class Partie {
    PlateauDeJeu plateau;
    ArrayList<Character> couleursDisponibles;

    public Partie(PlateauDeJeu plateau, ArrayList<Character> couleursDisponibles) {
        this.plateau = plateau;
        this.couleursDisponibles = couleursDisponibles;
    }
    public void lancerPartie(PlateauDeJeu plateau, Pion[] pion_entre, Pion pion_choisi, int taille, boolean valider){
        for(int i=0; i<taille;i++){
        System.out.println("Entrez votre"+i+" pion");
        Scanner var = new Scanner(System.in);
        String couleur = var.nextLine();
        pion_entre[i].couleur=couleur;
        }
        System.out.println(plateau);
        int taille_entree=pion_entre.length;
        for (int i=0;i<taille;i++){
            pion_entre[i]=pion_choisi;
        }        
        if (taille_entree==taille){
            valider=true;
        }
        for (int i=0;i<taille;i++){
            pion_entre[i]=pion_choisi;
        }

        

        
    }
}
