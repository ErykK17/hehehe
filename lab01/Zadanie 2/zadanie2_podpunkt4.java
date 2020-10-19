package pl.uwm.wmii.krygiereryk.laboratorium01;

public class zadanie2_podpunkt4 {
    int najmniejsza=0;
    int najwieksza=0;
    void najwiekszaczynajmniejsza(int [] numery){
        int najmniejsza=numery[0];
        int najwieksza= numery [0];
        for(int i : numery){
            if (i<=najmniejsza){
                najmniejsza=i;
            }
            if (i>=najwieksza){
                najwieksza=i;
            }
        }
    System.out.println("Najwieksza liczba to: "+ najwieksza);
    System.out.println("Najmniejsza liczba to: "+ najmniejsza);
    }
}
