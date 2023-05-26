package aula02;

import java.util.Scanner;

public class exer6 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Tempo em segundos: ");
		int time = sc.nextInt();
		sc.close();
		
		int segundos = time%60; // obtemos os segundos "livres"
		int minutos = time/60; // temos o tempo convertido em minutos
		int min_f = minutos%60; // obtemos os minutos "livres"
		int horas = minutos/60; // obtemos as horas 
		
		System.out.println(horas+"h:"+min_f+"min:"+segundos+"seg");
		
	}
}
