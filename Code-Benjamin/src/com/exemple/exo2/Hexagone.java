/**
 * ADOLPHE Benjamin 22008346
 * LAURET Nicolas 22002804
 **/
package com.exemple.exo2;

public class Hexagone extends Polygone {
	public Hexagone(int longueur_cote, int angle) {
        super();
		this.nb_cotes = 6;
        this.longueur_cote = longueur_cote;
        this.angle = angle;
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
