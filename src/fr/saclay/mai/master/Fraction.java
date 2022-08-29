package fr.saclay.mai.master;

//Définition du package
//package fr.upmc.masterc;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * Code de la classe de gestion de Fractions
 * ligne 2
 * ligne 3
 */
public class Fraction {
	/* Champs1: numerateur */
	private int num;
	/* Champs1: dénominateur */
	private int den = 1;

	/**
	 * Contructeur de la classe
	 * 
	 * @param le numérateur et le denominateur
	 *           ligne 3
	 */

	/**
	 * ...Les getteurs (du denominateur et du numerateur)
	 */

	public int getDen() {
		return this.den;
	}

	public int getNum() {
		return this.num;
	}

	/**
	 * 
	 * /**
	 * ...Les setteurs (du denominateur et du numerateur)
	 */

	public void setDen(int d) {
		if (d != 0)
			this.den = d;
		else {
			JFrame frame = new JFrame();

			JOptionPane.showMessageDialog(frame,
					"Le dénominateur doit être différent de 0\n Il est initialisé à 1 par défaut",
					" Erreur DenNotNull ",
					JOptionPane.INFORMATION_MESSAGE);
		}
	}

	public void setNum(int n) {
		this.num = n;
	}

	/**
	 * Le constructeur
	 */
	public Fraction(int n, int d) {
		this.num = n;
		this.setDen(d);
	}

	/**
	 * Methode 1
	 * Permet d'inverser la fraction sur laquelle elle est appelée
	 * 
	 * @return le resultat sous la forme d'une autre fraction
	 */
	public Fraction inverser() {
		if (this.num != 0)
			return new Fraction(this.den, this.num);
		else {
			JFrame frame = new JFrame();

			JOptionPane.showMessageDialog(frame,
					"Impossible d'inverser",
					" Erreur DenNotNull ",
					JOptionPane.INFORMATION_MESSAGE);
			// return null;
			return new Fraction(this.num, this.den);
		}
	}

	public Fraction plus(Fraction f) {
		int numr = this.num * f.getDen() + this.den * f.getNum();
		int denr = this.den * f.getDen();
		return new Fraction(numr, denr);
	}

	public Fraction moins(Fraction f) {
		int numr = this.num * f.getDen() - this.den * f.getNum();
		int denr = this.den * f.getDen();
		return new Fraction(numr, denr);
	}

	public Fraction multipliePar(Fraction f) {
		int numr = this.num * f.getNum();
		int denr = this.den * f.getDen();
		return new Fraction(numr, denr);
	}

	public Fraction divisePar(Fraction f) {
		int numr = this.num * f.getDen();
		int denr = this.den * f.getNum();
		return new Fraction(numr, denr);
	}

	public boolean estReductible() {
		boolean valeur = true;
		int pgcd;
		int n1 = this.num;
		int n2 = this.den;
		while (n1 != n2) {
			if (n1 > n2)
				n1 = n1 - n2;
			else
				n2 = n2 - n1;
		}
		pgcd = n2;
		if (pgcd == 1) {
			valeur = false;
		}
		return valeur;
	}

	public Fraction denominateurNul() {
		if (this.den != 0)
			return new Fraction(this.num, this.den);
		else
			return null;
	}

	public void afficheFraction() {
		JFrame frame = new JFrame();

		JOptionPane.showMessageDialog(frame,
				this.num + "/" + this.den,
				" Affichage fonction ",
				JOptionPane.INFORMATION_MESSAGE);

	}

	/**
	 * Methode 2
	 * Permet d'afficher la fraction sur laquelle elle est appelée
	 *
	 */
	public void afficher() {
		if (this.num % this.den == 0)
			System.out.println(this.num / this.den);
		else
			System.out.println(this.num + "/" + this.den);
	}
}
