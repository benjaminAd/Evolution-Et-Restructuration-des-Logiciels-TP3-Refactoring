/**
 * ADOLPHE Benjamin 22008346
 * LAURET Nicolas 22002804
 * */
package exercice1;

//Move Carre to another file (Move type to new file)
class Carre extends Rectangle {

    public Carre(int longueur) {
        super(longueur, longueur);
    }

    @Override
    public String toString() {
        return "Carre{ longueur=" + longueur + ", largeur=" + largeur + " }";
    }
}
