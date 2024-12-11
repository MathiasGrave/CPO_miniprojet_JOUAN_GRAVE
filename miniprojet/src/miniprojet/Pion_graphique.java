/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miniprojet;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JButton;

/**
 *
 * @author Grave
 */
public class Pion_graphique extends JButton{
    Pion pion_associe;
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); 
        Graphics2D g2d = (Graphics2D) g;
        Color couleur;
        switch (pion_associe.getValeur()){
            case 1 ->
                couleur = Color.RED;
            case 2 ->
                couleur = Color.GREEN;
            case 3 ->
                couleur = Color.YELLOW;
            case 4 ->
                couleur = Color.ORANGE;
            case 5 ->
                couleur = Color.CYAN;
            case 6 ->
                couleur = Color.PINK;
            case 7 ->
                couleur = Color.WHITE;
            case 8 -> 
                couleur = Color.BLACK;    
        } 
    }
    
}
