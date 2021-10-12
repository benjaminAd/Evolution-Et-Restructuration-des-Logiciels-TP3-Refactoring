/**
 * ADOLPHE Benjamin 22008346
 * LAURET Nicolas 22002804
 * */
package exercice1;

public class Rectangle {
	private int nb_cote, longueur, largeur, angle;

	public Rectangle(int nb_cote, int longueur, int largeur, int angle) {
		this.nb_cote = nb_cote;
		this.longueur = longueur;
		this.largeur = largeur;
		this.angle = angle;
	}

	public int getNb_cote() {
		return nb_cote;
	}

	public void setNb_cote(int nb_cote) {
		this.nb_cote = nb_cote;
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

	public int getAngle() {
		return angle;
	}

	public void setAngle(int angle) {
		this.angle = angle;
	}

	@Override
	public String toString() {
		return "Rectangle{" + "nb_cote=" + nb_cote + ", longueur=" + longueur + ", largeur=" + largeur + ", angle="
				+ angle + '}';
	}
}

class Carre {
	private int nb_cotes;
	private int longueur_cote;
	private int angle;

	public Carre(int nb_cotes, int longueur_cote, int angle) {
		this.nb_cotes = nb_cotes;
		this.longueur_cote = longueur_cote;
		this.angle = angle;
	}

	public int getNb_cotes() {
		return nb_cotes;
	}

	public void setNb_cotes(int nb_cotes) {
		this.nb_cotes = nb_cotes;
	}

	public int getAngle() {
		return angle;
	}

	public void setAngle(int angle) {
		this.angle = angle;
	}

	public int getLongueur_cote() {
		return longueur_cote;
	}

	public void setLongueur_cote(int longueur_cote) {
		this.longueur_cote = longueur_cote;
	}

	@Override
	public String toString() {
		return "Carre{" + "nb_cotes=" + nb_cotes + ", longueur_cote=" + longueur_cote + ", angle=" + angle + '}';
	}
}