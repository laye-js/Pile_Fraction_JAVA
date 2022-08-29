package sn.esp.dgi.master;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import ca.quens.sat.master.Pile;
import fr.saclay.mai.master.Fraction;

public class Test {

    public static void main(String[] args) {
        int choix;
        int max, num, den;
        int choix2;
        int choix3;
        String vchoix2, vchoix3;
        JFrame frame = new JFrame();
        String vchoix = JOptionPane.showInputDialog(frame, "Projet de POO:\n Tapez:\n 1 pour Pile \n 2 pour Fraction ");
        choix = Integer.parseInt(vchoix);
        if (choix == 1) {

            String vtaillemax = JOptionPane.showInputDialog(frame, "Saisir la taille de la pile");
            max = Integer.parseInt(vtaillemax);
            Pile mapile = new Pile(max);
            do {
                vchoix2 = JOptionPane.showInputDialog(frame, "Pile de taille " + max
                        + ":\n Tapez:\n 1 pour empiler \n 2 pour dépiler \n 3 pour verifier si la pile est vide \n 4 pour verifier si la pile est pleine \n 0 pour quitter");
                choix2 = Integer.parseInt(vchoix2);
                if (choix2 == 1) {
                    int element;
                    String velement = JOptionPane.showInputDialog(frame, "Saisir l'element à empiler");
                    element = Integer.parseInt(velement);
                    mapile.empiler(element);
                    mapile.affichePile();

                } else if (choix2 == 2) {
                    mapile.depiler();

                } else if (choix2 == 3) {

                    Boolean value = mapile.pileVide();
                    if (value == true) {
                        JOptionPane.showMessageDialog(frame,
                                "La pile est vide",
                                " Affichage fonction ",
                                JOptionPane.INFORMATION_MESSAGE);
                        mapile.affichePile();

                    } else {
                        JOptionPane.showMessageDialog(frame,
                                "La pile n'est pas vide",
                                " Affichage fonction ",
                                JOptionPane.INFORMATION_MESSAGE);
                        mapile.affichePile();

                    }
                } else if (choix2 == 4) {
                    Boolean value2 = mapile.pilePleine();
                    if (value2 == true) {
                        JOptionPane.showMessageDialog(frame,
                                "La pile est pleine",
                                " Affichage fonction ",
                                JOptionPane.INFORMATION_MESSAGE);
                        mapile.affichePile();
                    } else {
                        JOptionPane.showMessageDialog(frame,
                                "La pile n'est pas pleine",
                                " Affichage fonction ",
                                JOptionPane.INFORMATION_MESSAGE);
                        mapile.affichePile();

                    }
                }
            } while (choix2 != 0);
            System.exit(0);

        } else {

            JOptionPane.showMessageDialog(frame, "Creer fraction");
            String vnum = JOptionPane.showInputDialog(frame, "Saisir numerateur");
            String vden = JOptionPane.showInputDialog(frame, "Saisir denominateur");
            num = Integer.parseInt(vnum);
            den = Integer.parseInt(vden);
            Fraction f1 = new Fraction(num, den);
            do {

                vchoix3 = JOptionPane.showInputDialog(frame,
                        "Tapez \n 1 pour inverser la fraction \n 2 pour multiplier par une fraction \n 3 pour diviser par une fraction \n 4 pour verifier si la fraction est reductible  \n 5 pour soustraire avec une autre fraction \n 0 pour quitter");
                choix3 = Integer.parseInt(vchoix3);
                if (choix3 == 1) {
                    f1.inverser().afficheFraction();
                } else if (choix3 == 2) {
                    vnum = JOptionPane.showInputDialog(frame, "Saisir numerateur de la fraction2");
                    vden = JOptionPane.showInputDialog(frame, "Saisir denominateur de la fraction2");
                    num = Integer.parseInt(vnum);
                    den = Integer.parseInt(vden);
                    Fraction f2 = new Fraction(num, den);
                    f1.multipliePar(f2).afficheFraction();
                } else if (choix3 == 3) {
                    vnum = JOptionPane.showInputDialog(frame, "Saisir numerateur de la fraction2");
                    vden = JOptionPane.showInputDialog(frame, "Saisir denominateur de la fraction2");
                    num = Integer.parseInt(vnum);
                    den = Integer.parseInt(vden);
                    Fraction f2 = new Fraction(num, den);
                    f1.divisePar(f2).afficheFraction();

                } else if (choix3 == 4) {

                    if (f1.estReductible()) {
                        JOptionPane.showMessageDialog(frame,
                                "La fraction est: reductible",
                                " Affichage la fraction ",
                                JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(frame,
                                "La fraction est: irreductible",
                                " Affichage la fraction ",
                                JOptionPane.INFORMATION_MESSAGE);
                    }
                } else if (choix3 == 5) {
                    vnum = JOptionPane.showInputDialog(frame, "Saisir numerateur de la fraction2");
                    vden = JOptionPane.showInputDialog(frame, "Saisir denominateur de la fraction2");
                    num = Integer.parseInt(vnum);
                    den = Integer.parseInt(vden);
                    Fraction f2 = new Fraction(num, den);

                    f1.moins(f2).afficheFraction();
                }

                // f1.inverser().afficher();

            } while (choix3 != 0);
            System.exit(0);

        }
    }
}
