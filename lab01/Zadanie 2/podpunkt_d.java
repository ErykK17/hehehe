package pl.uwm.wmii.krygiereryk.laboratorium01;

public class podpunkt_d {

    int liczba = 0;

    void ilespelniajacychwarunek(int[] numery) {
        for (int i = 1; i < numery.length-1; i++) {
            if (numery[i] > (numery[i - 1] + numery[i + 1]) / 2) {
                liczba++;
            }
        }
        System.out.println("Ilość liczb spełniających ten warunek wynosi:" + liczba);
    }
}
