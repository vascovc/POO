package aula04;

import java.util.Scanner;

public class Exer3 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduza uma frase");
		String ab = sc.nextLine();
		sc.close();
		String st = replacer(ab);
		
		System.out.println("Acrónimo: "+st);
	}
	public static String replacer(String x) {
		String[] a = x.split(" "); // dividimos a frase em palvras
		String fin = "";
		for(int i=0;i<a.length;i++) {
			if (a[i].length()>=3) // se essa palavra tiver 3 ou mais characteres
				fin += String.valueOf(a[i].toUpperCase().charAt(0));
			// entao a string de saida passa a ser a que la estava mais o primeiro
		}
		return fin;
	}
}