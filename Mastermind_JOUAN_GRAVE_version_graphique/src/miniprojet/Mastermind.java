package miniprojet;

import java.awt.GridLayout;
import javax.swing.JButton;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Grave
 */
public class Mastermind extends javax.swing.JFrame {

    /**
     * Creates new form Mastermind
     */
    public Mastermind() {
        initComponents();
        int nbLignes = 10;
        int nbColonnes = 4;
        PanneauCombinaison.setLayout(new GridLayout(nbLignes, nbColonnes));
        for (int i=0; i < nbLignes; i++) {
            for (int j=0; j < nbColonnes; j++ ) {
                JButton bouton_cellule = new JButton(); // création d'un bouton
                PanneauCombinaison.add(bouton_cellule); // ajout au Jpanel PanneauGrille   
        int nbcolonnes = 8;   
        int nbligne = 1;
        BoutonsChoix.setLayout(new GridLayout(nbligne, nbcolonnes));
        for (int k=0; k < nbcolonnes; k++ ){
            for(int l=0; l <= nbligne; l++ ){
            JButton bouton_Cellule = new JButton(); // création d'un bouton
            BoutonsChoix.add(bouton_Cellule); // ajout au Jpanel PanneauGrille
            }
        }
 }
}
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BoutonsChoix = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        PanneauCombinaison = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(100, 700));
        setPreferredSize(new java.awt.Dimension(612, 700));
        setSize(new java.awt.Dimension(612, 700));

        BoutonsChoix.setBackground(new java.awt.Color(204, 0, 204));
        BoutonsChoix.setMinimumSize(new java.awt.Dimension(100, 100));
        BoutonsChoix.setPreferredSize(new java.awt.Dimension(612, 100));

        javax.swing.GroupLayout BoutonsChoixLayout = new javax.swing.GroupLayout(BoutonsChoix);
        BoutonsChoix.setLayout(BoutonsChoixLayout);
        BoutonsChoixLayout.setHorizontalGroup(
            BoutonsChoixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 612, Short.MAX_VALUE)
        );
        BoutonsChoixLayout.setVerticalGroup(
            BoutonsChoixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        getContentPane().add(BoutonsChoix, java.awt.BorderLayout.PAGE_END);

        jPanel3.setBackground(new java.awt.Color(0, 255, 204));
        jPanel3.setPreferredSize(new java.awt.Dimension(100, 300));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 272, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, java.awt.BorderLayout.LINE_END);

        jPanel4.setBackground(new java.awt.Color(0, 102, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(100, 300));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 272, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel4, java.awt.BorderLayout.LINE_START);

        PanneauCombinaison.setBackground(new java.awt.Color(255, 153, 0));
        PanneauCombinaison.setMaximumSize(new java.awt.Dimension(32767, 3000));
        PanneauCombinaison.setPreferredSize(new java.awt.Dimension(412, 300));

        javax.swing.GroupLayout PanneauCombinaisonLayout = new javax.swing.GroupLayout(PanneauCombinaison);
        PanneauCombinaison.setLayout(PanneauCombinaisonLayout);
        PanneauCombinaisonLayout.setHorizontalGroup(
            PanneauCombinaisonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 412, Short.MAX_VALUE)
        );
        PanneauCombinaisonLayout.setVerticalGroup(
            PanneauCombinaisonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 272, Short.MAX_VALUE)
        );

        getContentPane().add(PanneauCombinaison, java.awt.BorderLayout.CENTER);
        PanneauCombinaison.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Mastermind.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mastermind.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mastermind.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mastermind.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mastermind().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BoutonsChoix;
    private javax.swing.JPanel PanneauCombinaison;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
