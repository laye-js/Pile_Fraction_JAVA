package ca.quens.sat.master;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Pile {
    private int[] tableau;
    private int sommet = -1;
    private int tailleMax = 100;

    // Constructeur
    public Pile(int max) {
        sommet = -1;
        tailleMax = max;
        tableau = new int[tailleMax];
    }

    /** Cette methode permet d'empiler la pile */
    public void empiler(int element) {
        if (pilePleine()) {
            JFrame frame = new JFrame();
            JOptionPane.showMessageDialog(frame,
                    "La pile est pleine , impossible d'empiler",
                    " Affichage fonction ",
                    JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        sommet++;
        tableau[sommet] = element;
        System.out.print(tableau[sommet]);
    }

    /** Cette methode permet de dépiler la pile */
    public void depiler() {
        if (pileVide()) {
            JFrame frame = new JFrame();
            JOptionPane.showMessageDialog(frame,
                    "La pile est vide, impossible de dépiler",
                    " Affichage fonction ",
                    JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        sommet--;
        System.out.print(tableau[sommet + 1]);
        this.affichePile();
    }

    /** vérifie si une pile est vide */
    public boolean pileVide() {
        return (sommet == -1);
    }

    public boolean pilePleine() {
        return (sommet == tailleMax - 1);

    }

    public void affichePile() {

        JFrame frame = new JFrame();

        String chaine = new String();
        for (int i = 0; i <= sommet; i++) {
            chaine += "| " + this.tableau[(sommet - i)];

        }
        chaine += "|";

        JOptionPane.showMessageDialog(frame,
                chaine,
                " Affichage fonction ",
                JOptionPane.INFORMATION_MESSAGE);

    }
}
