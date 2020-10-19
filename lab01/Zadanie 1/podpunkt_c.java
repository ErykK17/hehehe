package pl.uwm.wmii.krygiereryk.laboratorium01;

public class podpunkt_c {
    int wynik=0;

    void dzialanie(int []numery){
        for (int i : numery){
            wynik=wynik+Math.abs(i);
        }
        System.out.println("Podpunkt C:"+wynik);
    }
}
