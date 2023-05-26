package aula02;

import java.util.Scanner;
import java.lang.Math;

public class exer7 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ponto 1:");
		System.out.print("x: ");
		float x1 = sc.nextFloat();
		System.out.print("y: ");
		float y1 = sc.nextFloat();
		System.out.println("Ponto 2:");
		System.out.print("x: ");
		float x2 = sc.nextFloat();
		System.out.print("y: ");
		float y2 = sc.nextFloat();
		sc.close();
		
		double dis = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1,2));
		
		System.out.println("A distância entre os pontos ("+x1+","+y1+") e ("+x2+","+y2+") é "+dis);
	}
}
