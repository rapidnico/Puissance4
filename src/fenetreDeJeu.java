/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marci
 */
public class fenetreDeJeu extends javax.swing.JFrame {

    Joueur ListeJoueurs[] = new Joueur[2];//on crée 2 joueurs
    Grille laGrille = new Grille();//pareil pour la grille de jeu
    Joueur joueurCourant;
    /**
     * Creates new form fenetreDeJeu
     */
    public fenetreDeJeu() {
        initComponents();
        panneau_info_jeu.setVisible(false);
        panneau_info_joueurs.setVisible(false);
        
        for(int i=5; i>=0; i--) {
            for (int j=0; j<7; j++) {
                CelluleGraphique cellGraph = new CelluleGraphique(laGrille.Cellules[i][j]);
                panneau_grille.add(cellGraph);
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

        panneau_grille = new javax.swing.JPanel();
        panneau_creation_jeu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nom_joueur_2 = new javax.swing.JTextField();
        nom_joueur_1 = new javax.swing.JTextField();
        btn_start = new javax.swing.JButton();
        panneau_info_joueurs = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lbl_j1_desint = new javax.swing.JLabel();
        lbl_j1_nom = new javax.swing.JLabel();
        lbl_j1_couleur = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        panneau_info_partie1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lbl_j1_desint1 = new javax.swing.JLabel();
        lbl_j1_nom1 = new javax.swing.JLabel();
        lbl_j1_couleur1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        lbl_j2_desint = new javax.swing.JLabel();
        lbl_j2_nom = new javax.swing.JLabel();
        lbl_j2_couleur = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        panneau_info_jeu = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lbl_jcourant = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        message = new javax.swing.JTextArea();
        btn_col_6 = new javax.swing.JButton();
        btn_col_0 = new javax.swing.JButton();
        btn_col_1 = new javax.swing.JButton();
        btn_col_2 = new javax.swing.JButton();
        btn_col_3 = new javax.swing.JButton();
        btn_col_4 = new javax.swing.JButton();
        btn_col_5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panneau_grille.setBackground(new java.awt.Color(0, 0, 0));
        panneau_grille.setLayout(new java.awt.GridLayout(6, 7));
        getContentPane().add(panneau_grille, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 670, 560));

        panneau_creation_jeu.setBackground(new java.awt.Color(153, 255, 204));
        panneau_creation_jeu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nom Joueur 2 :");
        panneau_creation_jeu.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 100, 20));

        jLabel2.setText("Nom Joueur 1 :");
        panneau_creation_jeu.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, 20));
        panneau_creation_jeu.add(nom_joueur_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 110, -1));
        panneau_creation_jeu.add(nom_joueur_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 110, -1));

        btn_start.setText("Démarrer partie");
        btn_start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_startActionPerformed(evt);
            }
        });
        panneau_creation_jeu.add(btn_start, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, -1));

        getContentPane().add(panneau_creation_jeu, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 40, 290, 110));

        panneau_info_joueurs.setBackground(new java.awt.Color(153, 255, 204));
        panneau_info_joueurs.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        jLabel3.setText("infos joueurs");
        panneau_info_joueurs.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        lbl_j1_desint.setText("nbDesintJoueur1");
        panneau_info_joueurs.add(lbl_j1_desint, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, -1, -1));

        lbl_j1_nom.setText("nomJoueur 1  ");
        panneau_info_joueurs.add(lbl_j1_nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, -1, -1));

        lbl_j1_couleur.setText("Couleurjoueur1  ");
        panneau_info_joueurs.add(lbl_j1_couleur, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, -1, -1));

        jLabel7.setText("Joueur 1 : ");
        panneau_info_joueurs.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabel8.setText("Couleur :  ");
        panneau_info_joueurs.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jLabel9.setText("Desintegrateurs : ");
        panneau_info_joueurs.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));
        panneau_info_joueurs.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 270, 10));

        panneau_info_partie1.setBackground(new java.awt.Color(153, 255, 204));
        panneau_info_partie1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        jLabel4.setText("infos joueurs");
        panneau_info_partie1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        lbl_j1_desint1.setText("nbDesintJoueur1");
        panneau_info_partie1.add(lbl_j1_desint1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, -1, -1));

        lbl_j1_nom1.setText("nomJoueur 1  ");
        panneau_info_partie1.add(lbl_j1_nom1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, -1, -1));

        lbl_j1_couleur1.setText("Couleurjoueur1  ");
        panneau_info_partie1.add(lbl_j1_couleur1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, -1, -1));

        jLabel10.setText("Joueur 1 : ");
        panneau_info_partie1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabel11.setText("Couleur :  ");
        panneau_info_partie1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jLabel12.setText("Desintegrateurs : ");
        panneau_info_partie1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));
        panneau_info_partie1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 270, 20));

        panneau_info_joueurs.add(panneau_info_partie1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 190, 290, 250));

        lbl_j2_desint.setText("nbDesintJoueur2");
        panneau_info_joueurs.add(lbl_j2_desint, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, -1, -1));

        lbl_j2_nom.setText("nomJoueur 2  ");
        panneau_info_joueurs.add(lbl_j2_nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, -1, -1));

        lbl_j2_couleur.setText("Couleurjoueur2  ");
        panneau_info_joueurs.add(lbl_j2_couleur, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, -1, -1));

        jLabel13.setText("Joueur 2 : ");
        panneau_info_joueurs.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLabel14.setText("Couleur :  ");
        panneau_info_joueurs.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jLabel15.setText("Desintegrateurs : ");
        panneau_info_joueurs.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        getContentPane().add(panneau_info_joueurs, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 170, 290, 250));

        panneau_info_jeu.setBackground(new java.awt.Color(153, 255, 204));
        panneau_info_jeu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        jLabel5.setText("infos jeu");
        panneau_info_jeu.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel16.setText("Joueur courant : ");
        panneau_info_jeu.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        lbl_jcourant.setText("nomJoueur   ");
        panneau_info_jeu.add(lbl_jcourant, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, -1, -1));

        message.setColumns(20);
        message.setRows(5);
        jScrollPane1.setViewportView(message);

        panneau_info_jeu.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 280, 60));

        getContentPane().add(panneau_info_jeu, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 440, 290, 150));

        btn_col_6.setText("7");
        getContentPane().add(btn_col_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(626, 60, -1, -1));

        btn_col_0.setText("1");
        getContentPane().add(btn_col_0, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        btn_col_1.setText("2");
        getContentPane().add(btn_col_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 60, -1, -1));

        btn_col_2.setText("3");
        btn_col_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 60, -1, -1));

        btn_col_3.setText("4");
        btn_col_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_3ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 60, -1, -1));

        btn_col_4.setText("5");
        btn_col_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_4ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(434, 60, -1, -1));

        btn_col_5.setText("6");
        getContentPane().add(btn_col_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 60, -1, -1));

        setBounds(0, 0, 1048, 712);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_col_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_col_2ActionPerformed

    private void btn_col_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_col_3ActionPerformed

    private void btn_col_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_col_4ActionPerformed

    private void btn_startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_startActionPerformed
        panneau_info_jeu.setVisible(true);
        panneau_info_joueurs.setVisible(true);
    }//GEN-LAST:event_btn_startActionPerformed

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
            java.util.logging.Logger.getLogger(fenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fenetreDeJeu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_col_0;
    private javax.swing.JButton btn_col_1;
    private javax.swing.JButton btn_col_2;
    private javax.swing.JButton btn_col_3;
    private javax.swing.JButton btn_col_4;
    private javax.swing.JButton btn_col_5;
    private javax.swing.JButton btn_col_6;
    private javax.swing.JButton btn_start;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbl_j1_couleur;
    private javax.swing.JLabel lbl_j1_couleur1;
    private javax.swing.JLabel lbl_j1_desint;
    private javax.swing.JLabel lbl_j1_desint1;
    private javax.swing.JLabel lbl_j1_nom;
    private javax.swing.JLabel lbl_j1_nom1;
    private javax.swing.JLabel lbl_j2_couleur;
    private javax.swing.JLabel lbl_j2_desint;
    private javax.swing.JLabel lbl_j2_nom;
    private javax.swing.JLabel lbl_jcourant;
    private javax.swing.JTextArea message;
    private javax.swing.JTextField nom_joueur_1;
    private javax.swing.JTextField nom_joueur_2;
    private javax.swing.JPanel panneau_creation_jeu;
    private javax.swing.JPanel panneau_grille;
    private javax.swing.JPanel panneau_info_jeu;
    private javax.swing.JPanel panneau_info_joueurs;
    private javax.swing.JPanel panneau_info_partie1;
    // End of variables declaration//GEN-END:variables
}