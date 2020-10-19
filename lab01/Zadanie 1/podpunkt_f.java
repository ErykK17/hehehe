package pl.uwm.wmii.krygiereryk.laboratorium01;

public class podpunkt_f {
    double wynik=0;

    void dzialanie(int [] numery){
        for (int i : numery){
            wynik=wynik+Math.pow(i,2);
        }
        System.out.println("Podpunkt F:"+wynik);
    }
}
