package pl.uwm.wmii.krygiereryk.laboratorium01;

public class zadanie2_podpunkt3 {
    int zera = 0;
    int dodatnie = 0;
    int ujemne = 0;

    void ilespelniajacychwarunek(int[] numery) {
        for (int i : numery) {
            if (i > 0) {
                dodatnie++;
            }
            if (i < 0) {
                ujemne++;
            }
            if (i == 0) {
                zera++;
            }
        }
        System.out.println("Liczba zer wynosi:" + zera);
        System.out.println("Ilość liczb dodatnich wynosi:" + dodatnie);
        System.out.println("Liczba liczb ujemnch wynosi:" + ujemne);
    }
}
