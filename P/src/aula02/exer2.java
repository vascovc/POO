package aula02;

import java.util.Scanner;

public class exer2 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Graus Célsius: ");
		float c = sc.nextFloat();
		sc.close();
		
		
		double f = 1.8*c + 32;
		
		System.out.println(c+" graus Célsius = "+f+" graus Fahrenheit");
	}
}
