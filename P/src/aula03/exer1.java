package aula03;

import java.util.Scanner;

public class exer1 {
	
	public static void main(String[]args) {
		double notaP; double notaT;double a;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("Nota Prática: ");
			a = sc.nextDouble();
		}while(nota(a));
		notaP = Math.round(a*10) / 10.0;

		do {
			System.out.print("Nota Teórica: ");
			a = sc.nextDouble();
		}while(nota(a));
		notaT = Math.round(a*10) / 10.0;
		
		sc.close();
		
		if (notaT <= 7.0 || notaP <= 7.0)
			System.out.println("66");
		else
			System.out.println(Math.round(0.4*notaT+0.6*notaP));
	}
	public static boolean nota(double a) {	
		if (a < 0 || a > 20) {
			System.out.println("Nota inválida");
			return true;
		}
		else
			return false;
	}
	
}
