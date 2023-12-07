package org.lessons.java.geometria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyScanner = new Scanner(System.in);



        System.out.println("Benvenuto nel calcolatore di aree");
        System.out.println("Inserisci la base");
        int newBase = Integer.parseInt(keyScanner.nextLine());
        System.out.println("Inserisci l'altezza");
        int newHeight = Integer.parseInt(keyScanner.nextLine());

        Rettangolo rectangle = new Rettangolo(newHeight, newBase);

        System.out.println(rectangle.toString());
        System.out.println("l'area del rettangolo è: " + rectangle.calcolaArea());
        System.out.println("il perimetro del rettangolo è: " + rectangle.calcolaPerimetro());

        keyScanner.close();
    }

}
