package pl.uwm.wmii.krygiereryk.laboratorium01;

public class zadanie2_podpunkt5 {
    int liczbapar=0;
    
    void ilepar(int [] numery){
        for (int i=0;i<numery.length-1;i++){
            if(numery[i]>0 && numery[i+1]>0){
                liczbapar++;
            }
        }
        System.out.println("Liczba takich par wynosi:"+ liczbapar);
    }
}
