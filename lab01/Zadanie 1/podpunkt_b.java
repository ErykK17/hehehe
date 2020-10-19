package pl.uwm.wmii.krygiereryk.laboratorium01;

public class podpunkt_b {
    double wynik=1;

    void dzialanie(int[] numery) {
        for (int i: numery) {
            wynik = wynik*i;
        }
        System.out.println("Podpunkt B:"+wynik);
    }

}

