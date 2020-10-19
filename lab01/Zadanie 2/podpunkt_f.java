package pl.uwm.wmii.krygiereryk.laboratorium01;

public class podpunkt_f {
    int liczba = 0;

    void ileparzystychindexnieparzysty(int[] numery) {
        for (int i = 0; i <= numery.length-1; i++) {
            if ((i+1)%2!=0 && numery[i]%2==0) {
                liczba++;
            }
        }
        System.out.println("Ilość liczb spełniających ten warunek wynosi:" + liczba);
    }
}

