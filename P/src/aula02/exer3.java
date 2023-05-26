package aula02;

import java.util.Scanner;

public class exer3 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Massa de água a aquecer(kg): ");
		float M = sc.nextFloat();
		System.out.print("Temperatura inicial(ºC): ");
		float ti = sc.nextFloat();
		System.out.print("Temperatura final(ºC): ");
		float tf = sc.nextFloat();
		sc.close();
		
		float q = M*(tf-ti)*4184;
		
		System.out.println("É necessária a energia de "+q+"Joules");
	}
}
