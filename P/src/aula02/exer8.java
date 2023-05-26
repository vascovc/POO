package aula02;

import java.util.Scanner;
import java.lang.Math;


public class exer8 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Cateto A: ");
		float a = sc.nextFloat();
		System.out.print("Cateto B: ");
		float b = sc.nextFloat();
		sc.close();
		
		double hip = Math.sqrt(a*a + b*b);
		
		double grau = Math.toDegrees(Math.acos(a/hip));
		
		System.out.println("O valor da hipotenusa é "+ hip);
		System.out.println("Entre o lado A e a hipotenusa forma-se um ângulo de "+grau+" graus");
	}

}
