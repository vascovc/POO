package aula02;

import java.util.Scanner;

public class exer3 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Massa de �gua a aquecer(kg): ");
		float M = sc.nextFloat();
		System.out.print("Temperatura inicial(�C): ");
		float ti = sc.nextFloat();
		System.out.print("Temperatura final(�C): ");
		float tf = sc.nextFloat();
		sc.close();
		
		float q = M*(tf-ti)*4184;
		
		System.out.println("� necess�ria a energia de "+q+"Joules");
	}
}
