/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marci
 */
import java.util.Random;//on importe les bibliotheques necessaires
import java.util.Scanner;

public class fenetreDeJeu extends javax.swing.JFrame {

    Random rand = new Random();

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

        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j < 7; j++) {
                CelluleGraphique cellGraph = new CelluleGraphique(laGrille.Cellules[i][j]);

                cellGraph.addActionListener(new java.awt.event.ActionListener() {

                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        Cellule c = cellGraph.celluleAssociee;
                        if (c.jetonCourant == null) {
                            return;
                        }

                        if (c.jetonCourant.Couleur.equals(joueurCourant.Couleur)) {
                            message.setText("Le joueur " + joueurCourant.Nom + " récupere un de ses jetons");
                            Jeton jrecup = c.recuperJeton();
                            joueurCourant.ajouterJeton(jrecup);
                            joueurSuivant();
                        } else {
                            if (joueurCourant.nombreDesintegrateurs > 0) {
                                message.setText("Le joueur " + joueurCourant.Nom + " desintegre un jeton");
                                c.supprimerJeton();
                                joueurCourant.utiliserDesintegrateur();
                                joueurSuivant();

                            } else {
                                return;
                            }
                        }
                        laGrille.tasserGrille();
                        panneau_grille.repaint();
                        lbl_j1_desint.setText(ListeJoueurs[0].nombreDesintegrateurs + "");
                        lbl_j2_desint.setText(ListeJoueurs[1].nombreDesintegrateurs + "");

                        boolean vict_Joueur1 = laGrille.etreGagnantPourJoueur(ListeJoueurs[0]);
                        boolean vict_Joueur2 = laGrille.etreGagnantPourJoueur(ListeJoueurs[1]);

                        if (vict_Joueur1 && !vict_Joueur2) {
                            message.setText("Victoire de " + ListeJoueurs[0].Nom);
                        }
                        if (vict_Joueur2 && !vict_Joueur1) {
                            message.setText("Victoire de " + ListeJoueurs[1].Nom);
                        }

                        if (vict_Joueur1 && !vict_Joueur2) {
                            if (joueurCourant == ListeJoueurs[0]) {
                                message.setText("Victoire de " + ListeJoueurs[0].Nom + " faute de jeu de l'autre joueur");
                            } else {
                                message.setText("Victoire de " + ListeJoueurs[1].Nom + " faute de jeu de l'autre joueur");
                            }
                        }

                    }
                });

                panneau_grille.add(cellGraph);
            }
        }
        //Partie uneNouvellePartie = new Partie();//une fois les noms enregistrés, on lance la partie
        //uneNouvellePartie.debuterPartie();
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
        message = new java.awt.TextArea();
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

        panneau_creation_jeu.setBackground(new java.awt.Color(255, 51, 51));
        panneau_creation_jeu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nom Joueur 2 :");
        panneau_creation_jeu.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 100, 20));

        jLabel2.setText("Nom Joueur 1 :");
        panneau_creation_jeu.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, 20));

        nom_joueur_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nom_joueur_2ActionPerformed(evt);
            }
        });
        panneau_creation_jeu.add(nom_joueur_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 110, -1));

        nom_joueur_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nom_joueur_1ActionPerformed(evt);
            }
        });
        panneau_creation_jeu.add(nom_joueur_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 110, -1));

        btn_start.setText("Démarrer partie");
        btn_start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_startActionPerformed(evt);
            }
        });
        panneau_creation_jeu.add(btn_start, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, -1));

        getContentPane().add(panneau_creation_jeu, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 40, 290, 110));

        panneau_info_joueurs.setBackground(new java.awt.Color(0, 0, 255));
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

        panneau_info_jeu.setBackground(new java.awt.Color(255, 0, 0));
        panneau_info_jeu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        jLabel5.setText("infos jeu");
        panneau_info_jeu.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel16.setText("Joueur courant : ");
        panneau_info_jeu.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        lbl_jcourant.setText("nomJoueur   ");
        panneau_info_jeu.add(lbl_jcourant, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, -1, -1));
        panneau_info_jeu.add(message, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 260, 60));

        getContentPane().add(panneau_info_jeu, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 440, 290, 150));

        btn_col_6.setBackground(new java.awt.Color(0, 0, 0));
        btn_col_6.setForeground(new java.awt.Color(255, 255, 255));
        btn_col_6.setText("7");
        btn_col_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_6ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(626, 60, -1, -1));

        btn_col_0.setBackground(new java.awt.Color(0, 0, 0));
        btn_col_0.setForeground(new java.awt.Color(255, 255, 255));
        btn_col_0.setText("1");
        btn_col_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_0ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_0, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        btn_col_1.setBackground(new java.awt.Color(0, 0, 0));
        btn_col_1.setForeground(new java.awt.Color(255, 255, 255));
        btn_col_1.setText("2");
        btn_col_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 60, -1, -1));

        btn_col_2.setBackground(new java.awt.Color(0, 0, 0));
        btn_col_2.setForeground(new java.awt.Color(255, 255, 255));
        btn_col_2.setText("3");
        btn_col_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 60, -1, -1));

        btn_col_3.setBackground(new java.awt.Color(0, 0, 0));
        btn_col_3.setForeground(new java.awt.Color(255, 255, 255));
        btn_col_3.setText("4");
        btn_col_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_3ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 60, -1, -1));

        btn_col_4.setBackground(new java.awt.Color(0, 0, 0));
        btn_col_4.setForeground(new java.awt.Color(255, 255, 255));
        btn_col_4.setText("5");
        btn_col_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_4ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(434, 60, -1, -1));

        btn_col_5.setBackground(new java.awt.Color(0, 0, 0));
        btn_col_5.setForeground(new java.awt.Color(255, 255, 255));
        btn_col_5.setText("6");
        btn_col_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_5ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 60, -1, -1));

        setBounds(0, 0, 1048, 712);
    }// </editor-fold>//GEN-END:initComponents

    public void initialiserPartie() {
        laGrille.viderGrille();//on commence par vider la grille pour supprimer tous les jetons et pieges

        String nomJoueur1 = nom_joueur_1.getText();
        Joueur Joueur1 = new Joueur(nomJoueur1);

        String nomJoueur2 = nom_joueur_2.getText();
        Joueur Joueur2 = new Joueur(nomJoueur2);

        ListeJoueurs[0] = Joueur1;
        ListeJoueurs[1] = Joueur2;

        attribuerCouleursAuxJoueurs();

        System.out.println(Joueur1.Nom + "est de couleur" + Joueur1.Couleur);
        System.out.println(Joueur2.Nom + "est de couleur" + Joueur2.Couleur);
        lbl_j1_nom.setText(nomJoueur1);
        lbl_j2_nom.setText(nomJoueur2);
        lbl_j1_couleur.setText(Joueur1.Couleur);
        lbl_j2_couleur.setText(Joueur2.Couleur);
        lbl_j1_desint.setText(Joueur1.nombreDesintegrateurs + "");
        lbl_j2_desint.setText(Joueur2.nombreDesintegrateurs + "");

        int d = 0;
        int x;
        int y;

        for (int i = 0; i < 5; i++) {//on fait 5 tours de boucle pour poser 5 desintegrateurs

            x = rand.nextInt(6);
            y = rand.nextInt(7);

            while (!laGrille.placerTrouNoir(x, y)) {//on vérifie que aux coordonnées x,y, il n'y ai pas de trou noir avec le"!" qui signifie
                x = rand.nextInt(6);//                l'opposé
                y = rand.nextInt(7);
            }
            if (d < 2) {
                laGrille.placerDesintegrateur(x, y);//pour pouvoir y mettre un désintégrateur
                d++;
            }

        }

        for (int i = 0; i < 3; i++) {

            x = rand.nextInt(6);
            y = rand.nextInt(7);

            while (laGrille.Cellules[x][y].presenceTrouNoir() || !laGrille.placerDesintegrateur(x, y)) {
                x = rand.nextInt(6);
                y = rand.nextInt(7);
            }

        }

        lbl_jcourant.setText(joueurCourant.Nom);
    }

    public void attribuerCouleursAuxJoueurs() {
        int r = rand.nextInt(2);//on donne à r une valeur entière aléatoire 0 ou 1
        if (r == 1) {

            ListeJoueurs[0].affecterCouleur("Rouge");//le premier joueur aura la couleur rouge

            ListeJoueurs[1].affecterCouleur("Jaune");//le deuxieme joueur aura la couleur jaune
            joueurCourant = ListeJoueurs[0];//le joueur courant, donc le premier a jouer, est le joueur 1
            for (int i = 0; i < 21; i++) {//ici on donne à chaque joueur ses 21 jetons de la bonne couleur
                ListeJoueurs[0].ajouterJeton(new Jeton("Rouge"));
                ListeJoueurs[1].ajouterJeton(new Jeton("Jaune"));
            }

        } else {// meme chose qu'avant mais en inversant les couleurs

            ListeJoueurs[0].affecterCouleur("Jaune");

            ListeJoueurs[1].affecterCouleur("Rouge");
            joueurCourant = ListeJoueurs[0];
            for (int i = 0; i < 21; i++) {
                ListeJoueurs[0].ajouterJeton(new Jeton("Jaune"));
                ListeJoueurs[1].ajouterJeton(new Jeton("Rouge"));
            }
        }
    }


    private void btn_col_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_2ActionPerformed
        // TODO add your handling code here:
        jouerDansColonne(2);
        if (laGrille.colonneRemplie(2) == true) {
            btn_col_2.setEnabled(false);
        }
        joueurSuivant();
    }//GEN-LAST:event_btn_col_2ActionPerformed

    private void btn_col_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_3ActionPerformed
        // TODO add your handling code here:
        jouerDansColonne(3);
        if (laGrille.colonneRemplie(3) == true) {
            btn_col_3.setEnabled(false);
        }
        joueurSuivant();
    }//GEN-LAST:event_btn_col_3ActionPerformed

    private void btn_col_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_4ActionPerformed
        // TODO add your handling code here:
        jouerDansColonne(4);
        if (laGrille.colonneRemplie(4) == true) {
            btn_col_4.setEnabled(false);
        }
        joueurSuivant();
    }//GEN-LAST:event_btn_col_4ActionPerformed

    private void btn_startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_startActionPerformed
        panneau_info_jeu.setVisible(true);
        panneau_info_joueurs.setVisible(true);
        initialiserPartie();
        panneau_grille.repaint();
     
        btn_start.setEnabled(true);


    }//GEN-LAST:event_btn_startActionPerformed

    private void nom_joueur_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nom_joueur_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nom_joueur_1ActionPerformed

    private void nom_joueur_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nom_joueur_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nom_joueur_2ActionPerformed

    private void btn_col_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_0ActionPerformed
        // TODO add your handling code here:
        jouerDansColonne(0);
        if (laGrille.colonneRemplie(0) == true) {
            btn_col_0.setEnabled(false);
        }
        joueurSuivant();

    }//GEN-LAST:event_btn_col_0ActionPerformed

    private void btn_col_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_1ActionPerformed
        // TODO add your handling code here:
        jouerDansColonne(1);
        if (laGrille.colonneRemplie(1) == true) {
            btn_col_1.setEnabled(false);
        }
        joueurSuivant();
    }//GEN-LAST:event_btn_col_1ActionPerformed

    private void btn_col_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_5ActionPerformed
        // TODO add your handling code here:
        jouerDansColonne(5);
        if (laGrille.colonneRemplie(5) == true) {
            btn_col_5.setEnabled(false);
        }
        joueurSuivant();
    }//GEN-LAST:event_btn_col_5ActionPerformed

    private void btn_col_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_6ActionPerformed
        // TODO add your handling code here:
        jouerDansColonne(6);
        if (laGrille.colonneRemplie(6) == true) {
            btn_col_6.setEnabled(false);
        }
        joueurSuivant();
    }//GEN-LAST:event_btn_col_6ActionPerformed

    public boolean jouerDansColonne(int indice_colonne) {

        boolean resultatAction;

        resultatAction = laGrille.ajouterJetonDansColonne(joueurCourant, indice_colonne);
        panneau_grille.repaint();

        // joueurCourant.nombreDesintegrateurs++;
        lbl_j1_desint.setText(ListeJoueurs[0].nombreDesintegrateurs + "");
        lbl_j2_desint.setText(ListeJoueurs[1].nombreDesintegrateurs + "");

        boolean vict_Joueur1 = laGrille.etreGagnantPourJoueur(ListeJoueurs[0]);
        boolean vict_Joueur2 = laGrille.etreGagnantPourJoueur(ListeJoueurs[1]);

        if (vict_Joueur1 && !vict_Joueur2) {
            message.setText("Victoire de " + ListeJoueurs[0].Nom + " et defaite de " + ListeJoueurs[1].Nom);
        }
        if (vict_Joueur2 && !vict_Joueur1) {
            message.setText("Victoire de " + ListeJoueurs[1].Nom + " et defaite de " + ListeJoueurs[0].Nom);
        }

        if (vict_Joueur1 && vict_Joueur2) {
            if (joueurCourant == ListeJoueurs[0]) {
                message.setText("Victoire de " + ListeJoueurs[1].Nom + " faute de jeu de l'autre joueur");
            } else {
                message.setText("Victoire de " + ListeJoueurs[0].Nom + " faute de jeu de l'autre joueur");
            }
        }

        if (resultatAction == true) {
            return true;
        } else {
            return false;
        }
    }

    public void joueurSuivant() {

        if (joueurCourant == ListeJoueurs[0]) {
            joueurCourant = ListeJoueurs[1];
        } else {
            joueurCourant = ListeJoueurs[0];
        }
        lbl_jcourant.setText(joueurCourant.Nom);
    }

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
            java.util.logging.Logger.getLogger(fenetreDeJeu.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fenetreDeJeu.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fenetreDeJeu.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fenetreDeJeu.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private java.awt.TextArea message;
    private javax.swing.JTextField nom_joueur_1;
    private javax.swing.JTextField nom_joueur_2;
    private javax.swing.JPanel panneau_creation_jeu;
    private javax.swing.JPanel panneau_grille;
    private javax.swing.JPanel panneau_info_jeu;
    private javax.swing.JPanel panneau_info_joueurs;
    private javax.swing.JPanel panneau_info_partie1;
    // End of variables declaration//GEN-END:variables
}
