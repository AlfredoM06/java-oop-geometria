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


    void disegna(){
        for (int i = 0; i < height; i ++){
            String linea= "";
            if((i == 0) || (i == height - 1 )){
                for (int k = 0; k < base ; k ++) {
                    linea += "0";
                }
                System.out.println(linea);
            } else{
                linea="0";
                for (int k = 1; k < base-1 ; k ++) {
                    linea += " ";
                }
                linea += "0";
                System.out.println(linea);
            }
        }
    }

}
