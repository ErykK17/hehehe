package pl.uwm.wmii.krygiereryk.laboratorium01;

public class podpunkt_g {
    int wynik=0;
    int wynik1=1;

    void dzialanie(int [] numery){
        for (int i : numery){
            wynik=wynik+i;
        }
        System.out.println("Podpunkt G1:"+wynik);
        for (int j : numery){
            wynik1=wynik1*j;
        }
        System.out.println("Podpunkt G2:"+wynik1);
    }
}
