package pl.uwm.wmii.krygiereryk.laboratorium01;

public class Zadanie2_podpunkt2 {
    int wynik = 0;

    void podwojonasuma(int[] numery) {
        for (int i : numery) {
            if (i > 0) {
                wynik += 2 * i;
            }
        }
        System.out.println("Podwojona suma dodatnich liczb wynosi:" + wynik);
    }
}
