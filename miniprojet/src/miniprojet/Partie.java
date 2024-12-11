/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miniprojet;

import java.util.ArrayList;

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
    public void lancerPartie(){
        System.out.println(plateau);
    }
}
