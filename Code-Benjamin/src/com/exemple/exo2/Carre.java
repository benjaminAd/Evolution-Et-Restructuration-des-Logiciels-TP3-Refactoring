/**
 * ADOLPHE Benjamin 22008346
 * LAURET Nicolas 22002804
 * */
package com.exemple.exo2;
public class Carre{
    //TODO le carré est une spécialisation de rectangle
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
        return "Carre{" +
                "nb_cotes=" + nb_cotes +
                ", longueur_cote=" + longueur_cote +
                ", angle=" + angle +
                '}';
    }
}
