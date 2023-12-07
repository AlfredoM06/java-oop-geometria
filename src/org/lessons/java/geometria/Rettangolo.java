package org.lessons.java.geometria;
//attributi
public class Rettangolo {
    int base;
    int height;
// costruttori
    public Rettangolo(int height, int base) {
        this.height = height;
        this.base = base;
    }
//metodi
    @Override
    public String toString() {
        return "Rettangolo{" +
                "base=" + base +
                ", height=" + height +
                '}';
    }

    int calcolaArea () {
        int calcolo = base * height;
        return calcolo;
    }

    int calcolaPerimetro () {
        int secondoCalcolo = ( base + height) * 2;
        return secondoCalcolo;
    }

    String disegna () {

    }
}
