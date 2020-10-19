package pl.uwm.wmii.krygiereryk.laboratorium01;

public class podpunkt_a {
    int wynik=0;

    void dzialanie(int [] numery){
        for (int j : numery) {
            wynik = wynik + j;
        }
        System.out.println("Podpunkt A:"+wynik);
    }

}
