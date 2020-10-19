package pl.uwm.wmii.krygiereryk.laboratorium01;

public class podpunkt_g {
    int liczba = 0;

    void ileparzystychindexnieparzysty(int[] numery) {
        for (int i : numery) {
            if (i%2!=0 && i>=0) {
                liczba++;
            }
        }
        System.out.println("Ilość liczb nieparzystych i nieujemych wynosi:" + liczba);
    }
}
