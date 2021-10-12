/**
 * ADOLPHE Benjamin 22008346
 * LAURET Nicolas 22002804
 * */
package com.exemple.exo2;

public class Rectangle {
    //TODO Spécialisation de Polygone
    private int nb_cotes, longueur, largeur, angle;

    public Rectangle(int nb_cotes, int longueur, int largeur, int angle) {
        this.nb_cotes = nb_cotes;
        this.longueur = longueur;
        this.largeur = largeur;
        this.angle = angle;
    }

    public int getNb_cotes() {
        return nb_cotes;
    }

    public void setNb_cotes(int nb_cotes) {
        this.nb_cotes = nb_cotes;
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
        return "Rectangle{" +
                "nb_cotes=" + nb_cotes +
                ", longueur=" + longueur +
                ", largeur=" + largeur +
                ", angle=" + angle +
                '}';
    }
}
