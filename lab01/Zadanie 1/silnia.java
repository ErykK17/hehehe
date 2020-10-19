package pl.uwm.wmii.krygiereryk.laboratorium01;

public class silnia {

    public double dzialanie (int x){
        double wynik=1;
        for (int i=1;i<x+1;i=i+1) {
            wynik = wynik*i;
        }
        return wynik;
    }
}
