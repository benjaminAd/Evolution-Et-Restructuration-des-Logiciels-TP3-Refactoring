/**
 * ADOLPHE Benjamin 22008346
 * LAURET Nicolas 22002804
 * */
package com.exemple.exo1;

public class Rectangle {
    //TODO Spécialisation de Polygone
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
        return "Rectangle{" +
                "nb_cote=" + nb_cote +
                ", longueur=" + longueur +
                ", largeur=" + largeur +
                ", angle=" + angle +
                '}';
    }
}
