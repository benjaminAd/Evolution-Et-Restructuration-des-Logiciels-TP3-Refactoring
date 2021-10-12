/**
 * ADOLPHE Benjamin 22008346
 * LAURET Nicolas 22002804
 **/
package com.exemple.exo1;

public class Hexagone {
	
	protected int nb_cotes;
	protected int longueur_cote;
	protected int angle;
	
	public Hexagone(int longueur_cote, int angle) {
        super();
		this.nb_cotes = 6;
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
	    return "Hexagone{" +
	            "nb_cotes=" + nb_cotes +
	            ", longueur_cote=" + longueur_cote +
	            ", angle=" + angle +
	            "}";
	}
}
