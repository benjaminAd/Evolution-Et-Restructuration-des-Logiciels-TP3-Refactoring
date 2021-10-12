/**
 * ADOLPHE Benjamin 22008346
 * LAURET Nicolas 22002804
 * */
package com.exemple.exo2;

public class Test {
    public static void main(String[] args) {
        Polygone hex1 = new Hexagone(50, 60);
        Rectangle rect1 = new Rectangle(4, 50, 25, 90);
        Carre carre1 = new Carre(4, 25, 90);
        System.out.println(hex1);
        System.out.println(rect1);
        System.out.println(carre1);
    }
}
