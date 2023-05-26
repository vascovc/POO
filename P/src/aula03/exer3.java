package aula03;

import java.util.Scanner;

public class exer3 {
	public static void main(String[]args) {
		int num;
		
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("Número inteiro positivo: ");
			num = sc.nextInt();
		}while(num<=0);
		sc.close();
		
		String mes = "O número é primo";
		if (num != 1) {
			for(int i = 2;i<num;i++) {
				if (num%i == 0) {
					mes = "O número não é primo";
					break;
				}
			}
		}
		else
			mes = "O número não é primo";
		System.out.println(mes);
	}
}
