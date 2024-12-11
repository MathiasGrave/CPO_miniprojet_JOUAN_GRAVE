/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miniprojet;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Grave
 */
public class Combinaison {
    Pion[] element=new Pion[4];
    int taille;

    public Combinaison(Pion[] element) {
        this.element = element;
    }
    public Character[] genereAleatoirement(int taille, ArrayList<Character> couleursDisponibles) {
        Character[] CombinaisonSecrete = new Character[taille];
        for (int i=0; i<taille; i++){
            int taille2=couleursDisponibles.size();
            Random rand = new Random();
            int nombreAleatoire = rand.nextInt(taille2);
            CombinaisonSecrete[i]=couleursDisponibles.get(nombreAleatoire);
            }
        
        return CombinaisonSecrete;
    }
    public int[] comparer(Character[] autre, Character[] CombinaisonSecrete){
        int[] indice = new int[2];
        int bienPlace=0;
        int malPlace=0;
        for (int i=0;i<taille;i++){
            for (int j=0;j<taille;j++){
                if (autre[i]==CombinaisonSecrete[i]){
                    bienPlace+=1;
                    break;
                }
                if (autre[i]==CombinaisonSecrete[j]) {
                    malPlace+=1;
                    break;
                }
            }
             
        }
        indice[0]=bienPlace;
        indice[1]=malPlace;
        return indice;
    }

    @Override
    public String toString() {
        char Couleur;
        char [] Couleurs = new char[taille];
        for (int i=0;i<taille;i++){
            Couleur = element[i].getCouleur();
            Couleurs[i]=Couleur;
        }
            return "Combinaison{" +Couleurs +'}';
    }
    
    
}
