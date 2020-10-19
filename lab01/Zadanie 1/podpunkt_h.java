package pl.uwm.wmii.krygiereryk.laboratorium01;

public class podpunkt_h {
    double wynik=0;

    void dzialanie(int [] numery){
        for (int i=0;i<numery.length;i=i+1){
            wynik=wynik-numery[i]*Math.pow(-1,i+1);
        }
        System.out.println("Podpunkt H:"+wynik);
    }
}
