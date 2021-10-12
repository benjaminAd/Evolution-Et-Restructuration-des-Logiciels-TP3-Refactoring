package com.exemple.exo2;

public class Polygone {

	protected int nb_cotes;
	protected int longueur_cote;
	protected int angle;

	public Polygone() {
		super();
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

}