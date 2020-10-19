package pl.uwm.wmii.krygiereryk.laboratorium01;

public class podpunkt_c {
    int liczba=0;
    void ilekwadratowliczbparzystych (int [] numery){
        for(int i : numery ){
            if(Math.sqrt(i)%2==0){
                liczba++;
            }
        }
        System.out.println("Liczba kwadratow liczby parzystej wynosi: "+ liczba );
    }
}
