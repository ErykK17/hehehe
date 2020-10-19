package pl.uwm.wmii.krygiereryk.laboratorium01;

public class podpunkt_h {
    int liczba = 0;

    void ilespelniajacychwarunek(int[] numery) {
        for (int i = 0; i <= numery.length-1; i++) {
            if (Math.abs(numery[i])>Math.pow(i+1,2)) {
                liczba++;
            }
        }
        System.out.println("Ilość liczb spełniających ten warunek wynosi:" + liczba);
    }
}
