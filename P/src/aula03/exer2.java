package aula03;

import java.util.Scanner;

public class exer2 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Número positivo inteiro: ");
		int num = sc.nextInt();
		sc.close();
		while (num >=0){
			System.out.println(num--);
			
		}
	}
}
