package aula03;

import java.util.Scanner;

public class exer5 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		double val;float taxa; 
		do {
			System.out.print("Valor investido: ");
			val = sc.nextDouble();
		}while(val >= 0 && val%1000 != 0);
		
		do {
			System.out.print("Taxa de juro mensal: ");
			taxa = sc.nextFloat();
		}while(0>taxa && taxa>=5);
		
		sc.close();
		
		for (int i=1;i<13;i++) {
			val = val*(taxa*0.01) + val;
			System.out.printf("No %2dº mês o valor é de %.2f\n",i,val);
		}
	}
}
// intervalo aberto ou fechado? no 0 e 5