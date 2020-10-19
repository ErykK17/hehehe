package pl.uwm.wmii.krygiereryk.laboratorium01;

public class podpunkt_a {
    int liczba=0;
    void ilenieparzystych (int [] numery){
        for(int i : numery ){
            if(i%2!=0){
                liczba++;
            }
        }
        System.out.println("Liczba liczb nieparzystych wynosi: "+ liczba );
    }
}
