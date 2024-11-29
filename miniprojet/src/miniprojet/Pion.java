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

public Pion(char Couleur) {
        couleur = Couleur;
    }
public char getCouleur() {
        return couleur;
    }

    /**
     *
     * @return
     */
    @Override
public String toString() {
    return String.valueOf(couleur);
}

}
