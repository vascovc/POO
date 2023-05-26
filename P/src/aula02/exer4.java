package aula02;

import java.util.Scanner;

public class exer4 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Montante a investir: ");
		float money = sc.nextFloat();
		System.out.print("Taxa de juro mensal: ");
		float taxa = sc.nextFloat();
		sc.close();
		
		float total = money;
		int month = 3;
		while(month>0) {
			total = total*(1 + taxa/100); // assim a taxa e de 1,taxa% 
			month = month-1;
		}
		
		System.out.println("Ao fim de 3 meses o investimento de "+money+"euros a uma taxa de "+taxa+"% rendeu "+total+"euros");
	}
}
