/**
 * ADOLPHE Benjamin 22008346
 * LAURET Nicolas 22002804
 * */
package exercice1;

public class Rectangle {
	protected int longueur;
	protected int largeur;

	public Rectangle(int longueur, int largeur) {
		this.longueur = longueur;
		this.largeur = largeur;
	}

	public int getLongueur() {
		return longueur;
	}

	public void setLongueur(int longueur) {
		this.longueur = longueur;
	}

	public int getLargeur() {
		return largeur;
	}

	public void setLargeur(int largeur) {
		this.largeur = largeur;
	}

	@Override
	public String toString() {
		return "Rectangle{ longueur=" + longueur + ", largeur=" + largeur + " }";
	}
}

class Carre extends Rectangle {

	public Carre(int longueur) {
		super(longueur, longueur);
	}

	@Override
	public String toString() {
		return "Carre{ longueur=" + longueur + ", largeur=" + largeur + " }";
	}
}