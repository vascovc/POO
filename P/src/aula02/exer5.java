package aula02;

import java.util.Scanner;

public class exer5 {
	/* a velocidade m�dia n�o � a m�dia das velocidades
	 * pelo que n�o se pode fazer a m�dia da velocidade
	 * de cada percurso
	 * tem que se fazer distancia total/tempo total
	 */
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Velocidade do percurso 1: ");
		float v1 = sc.nextFloat();
		System.out.print("Dist�ncia percurso 1: ");
		float d1 = sc.nextFloat();
		System.out.print("Velocidade do percurso 2: ");
		float v2 = sc.nextFloat();
		System.out.print("Dist�ncia percurso 2: ");
		float d2 = sc.nextFloat();
		sc.close();
		
		//float t1 = d1/v1; velocidade = distancia/tempo <=> tempo = distancia/velocidade
		//float t2 = d2/v2;
		
		double fin = (d1+d2)/(d1/v1 + d2/v2);
		
		System.out.println("A velocidade m�dia final � de "+fin);
	}
}
