package aula03;

import java.util.Scanner;


public class exer7 {
	public static void main(String[]args) {
		String val = "S"; int counter = 0; int i=-1;
		
		int x = (int)(Math.random()*100);
		System.out.println(x);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Adivinhe um número entre 1 e 100: ");		
		while(true) {
			i = sc.nextInt();
			++counter;
			if (x > i)
				System.out.println("Demasiado baixo");
			else if(x < i)
				System.out.println("Demasiado alto");
			else {
				System.out.println("Parabéns adivinhou o valor");
				break;
			}
			System.out.println("Pretende continuar? Prima (S)im");
			val = sc.next();
			if (validar(val))
				System.out.print("Introduza o valor: ");
			else
				break;
		}
		
		sc.close();
		System.out.println("Foram nenecessárias " + counter + " tentativas");
	}
	
	public static boolean validar(String x) {
		if(x.charAt(0) == 'S' || x == "Sim")
			return true;
		else
			return false;
	}
}
