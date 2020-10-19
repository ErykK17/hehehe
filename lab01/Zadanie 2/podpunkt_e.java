package pl.uwm.wmii.krygiereryk.laboratorium01;

public class podpunkt_e {

    int liczba = 0;
    silnia si= new silnia();

    void ilespelniajacychwarunek(int[] numery) {
        for (int i = 0; i <= numery.length-1; i++) {
            if (numery[i]> Math.pow(2,i+1)&& numery[i]< si.dzialanie(i+1)) {
                liczba++;
            }
        }
        System.out.println("Ilość liczb spełniających ten warunek wynosi:" + liczba);
    }
}
