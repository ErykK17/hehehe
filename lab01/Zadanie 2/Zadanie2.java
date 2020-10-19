package pl.uwm.wmii.krygiereryk.laboratorium01;

import java.util.Scanner;

public class Zadanie2 {

    public static void main(String[] args) {
        Scanner podaj = new Scanner(System.in);
        int n = podaj.nextInt();
        int [] numery= new int[n];

        for (int i=0;i<n;i++){
            numery[i]=podaj.nextInt();
        }
        podpunkt_a pa= new podpunkt_a();
        podpunkt_b pb= new podpunkt_b();
        podpunkt_c pc= new podpunkt_c();
        podpunkt_d pd= new podpunkt_d();
        podpunkt_e pe= new podpunkt_e();
        podpunkt_f pf= new podpunkt_f();
        podpunkt_g pg= new podpunkt_g();
        podpunkt_h ph= new podpunkt_h();
        Zadanie2_podpunkt2 z2 = new Zadanie2_podpunkt2();
        zadanie2_podpunkt3 z3 = new zadanie2_podpunkt3();
        zadanie2_podpunkt4 z4= new zadanie2_podpunkt4();
        zadanie2_podpunkt5 z5 = new zadanie2_podpunkt5();


        pa.ilenieparzystych(numery);
        pb.ileniepodzielnych3inie5(numery);
        pc.ilekwadratowliczbparzystych(numery);
        pd.ilespelniajacychwarunek(numery);
        pe.ilespelniajacychwarunek(numery);
        pf.ileparzystychindexnieparzysty(numery);
        pg.ileparzystychindexnieparzysty(numery);
        ph.ilespelniajacychwarunek(numery);
        z2.podwojonasuma(numery);
        z3.ilespelniajacychwarunek(numery);
        z4.najwiekszaczynajmniejsza(numery);
        z5.ilepar(numery);

    }

}
