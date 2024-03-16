/* Корисникот од тастатура внесува 5 броеви, провери дали броевите се парни или
непарни а потоа испечати ја сумата на парните и сумата на непарните броеви
соодветно. */
import java.util.Scanner;
public class SumaZaParnost {

	public static void main(String[] args) {
		int a,b,c,d,e,sumaP=0,sumaN=0;
		System.out.println("Vnesi pet broevi");
		Scanner vnes = new Scanner(System.in);
		a=vnes.nextInt();
		b=vnes.nextInt();
		c=vnes.nextInt();
		d=vnes.nextInt();
		e=vnes.nextInt();
		
		if(a%2==0) {
			sumaP+=a;
		} else sumaN+=a;
		
		if(b%2==0) {
			sumaP+=b;
		} else sumaN+=b;
		
		if(c%2==0) {
			sumaP+=c;
		} else sumaN+=c;

		if(d%2==0) {
			sumaP+=d;
		} else sumaN+=d;
		
		if(e%2==0) {
			sumaP+=e;
		} else sumaN+=e;
		
		System.out.println("Suma na parnite ");
	}

}
