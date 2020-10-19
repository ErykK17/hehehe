package pl.uwm.wmii.krygiereryk.laboratorium01;

public class podpunkt_2 {

    void wypisz (int [] numery){
        for (int i=0;i<=numery.length-1;i++){
            if(i>=1){
                System.out.println(numery[i]);
            }
            if (i==numery.length-1){
                System.out.println(numery[0]);
            }

        }
    }
}
