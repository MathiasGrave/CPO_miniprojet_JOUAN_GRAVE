/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miniprojet;


/**
 *Jouan
 * @author felix
 */
public class Pion {
private char couleur;
int x;
int y;

public int getValeur(){
    int Valeur;
    if (x<80){
        Valeur=1;
    }
    else if (x<160){
        Valeur=2;
    }
    else if (x<240){
        Valeur=3;
    }
    else if (x<320){
        Valeur=4;
    }
        else if (x<400){
        Valeur=5;
    }
    else if (x<480){
        Valeur=6;
    }
    else if (x<560){
        Valeur=7;
    }
    else{
        Valeur=8;
    }
    return Valeur;
}

public Pion(char Couleur) {
        couleur = Couleur;
    }
public char getCouleur() {
        return couleur;
    }
    

    @Override
public String toString() {
    return String.valueOf(couleur);
}

}
