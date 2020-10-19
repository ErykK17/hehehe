package pl.uwm.wmii.krygiereryk.laboratorium01;

public class podpunkt_d {
    double wynik=0;

    void dzialanie(int [] numery){
        for (int i : numery){
            wynik=wynik+Math.sqrt(Math.abs(i));
        }
        System.out.println("Podpunkt D:"+wynik);
    }
}
