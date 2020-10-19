package pl.uwm.wmii.krygiereryk.laboratorium01;
import java.util.Scanner;


public class Zadanie1 {

    public static void main(String[] args) {
	Scanner podaj = new Scanner(System.in);
	int n = podaj.nextInt();
	int [] numery= new int[n];

	for (int i=0;i<n;i++){
		numery[i]=podaj.nextInt();
	}


	podpunkt_a pa = new podpunkt_a();
	podpunkt_b pb = new podpunkt_b();
	podpunkt_c pc = new podpunkt_c();
	podpunkt_d pd = new podpunkt_d();
	podpunkt_e pe = new podpunkt_e();
	podpunkt_f pf = new podpunkt_f();
	podpunkt_g pg = new podpunkt_g();
	podpunkt_h ph = new podpunkt_h();
	podpunkt_i pi = new podpunkt_i();
	podpunkt_2 p2 = new podpunkt_2();

	pa.dzialanie(numery);
	pb.dzialanie(numery);
	pc.dzialanie(numery);
	pd.dzialanie(numery);
	pe.dzialanie(numery);
	pf.dzialanie(numery);
	pg.dzialanie(numery);
	ph.dzialanie(numery);
	pi.dzialanie(numery);
	System.out.println("Ciąg liczb:");
	p2.wypisz(numery);


    }
}
