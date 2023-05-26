package aula03;

import java.util.Scanner;

public class exer6 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int month;int year; int days;
		
		do {
			System.out.print("Mês: ");
			month = sc.nextInt();
		}while(month<1 && month>12);
		
		do {
			System.out.print("Ano: ");
			year = sc.nextInt();
		}while(year<0);
		
		sc.close();
		
		if (month != 2) {
			switch(month){
			case 4:
			case 6:
			case 9:
			case 11: days = 30;break;
			default: days = 31;
			}
		}
		else {
			if(year%4 == 0 && (year%100 != 0 || year%400 == 0))
				days = 29;
			else
				days = 28;
		}
		System.out.println("Dias: "+days);
	}
}
