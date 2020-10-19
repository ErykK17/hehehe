package pl.uwm.wmii.krygiereryk.laboratorium01;

public class podpunkt_b {
    int liczba=0;
    void ileniepodzielnych3inie5 (int [] numery){
        for(int i : numery ){
            if(i%3==0&&i%5!=0){
                liczba++;
            }
        }
        System.out.println("Liczba liczb podzielnych przez 3 i niepodzielnych przez 5 wynosi: "+ liczba );
    }
}
