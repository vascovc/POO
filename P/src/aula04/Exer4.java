package aula04;

import java.util.Scanner;

public class Exer4 {
	public static void main(String[]args) {
		int[] dados = reader();
		int mes,ano,dia;
		mes = dados[0];
		ano = dados[1];
		dia = dados[2];
		printer(mes,ano,dia);
	}// fun�ao de leitura ->[mes,ano,dia]
	public static int[] reader() {
		int m,ano,dia;
		Scanner sc = new Scanner(System.in);
		System.out.print("M�s: ");
		m = sc.nextInt();
		System.out.print("Ano: ");
		ano = sc.nextInt();
		System.out.print("1 = Segunda\n2 = Ter�a\n3 = Quarta\n4 = Quinta\n5 = Sexta\n6 = S�bado\n7 = Domingo\nDia da semana em que come�a o m�s: ");
		dia = sc.nextInt();
		sc.close();
		int val[] = {m,ano,dia};
		return val;
	}
	//	ve quantos dias tem o m�s -> dias_do_mes
	public static int dayCalc(int month, int ano) {
		int days;
		if (month != 2) {
			switch(month){
			case 4:
			case 6:
			case 9:
			case 11: days = 30; break;
			default: days = 31;
			}
		}
		else {
			if(ano%4 == 0 && (ano%100 != 0 || ano%400 == 0))
				days = 29;
			else
				days = 28;
		}
		return days;
	}

	// ve o nome do mes -> String
	public static String month(int m) {
		String a;
		switch(m) {
			case 1:a = "January";break;
			case 2:a = "February";break;
			case 3:a = "March";break;
			case 4:a = "April";break;
			case 5:a = "May";break;
			case 6:a = "June";break;
			case 7:a = "July";break;
			case 8:a = "August";break;
			case 9:a = "September";break;
			case 10:a = "October";break;
			case 11:a = "November";break;
			default:
				a = "December";
		}
		return a;
	}
	
	public static void printer(int mes, int ano, int dia) {
		int dias_do_mes,semana,dia_semana;
		String nome_mes;
		dias_do_mes = dayCalc(mes,ano);
		nome_mes = month(mes);
		
		int[][] a = new int[7][6]; // 7 dias da semana e no maximo temos 6 semanas
		for(int i = 1; i<=dias_do_mes;i++) {
			if(dia==7)
				dia = 0;
			
			semana = (i+dia)/7; // assim vemos em que semana est� pois ao somarmos o "dia" ficamos com a primeira linha vazia quando necess�ria
			dia_semana = (i+dia)%7; // dia da semana em que se esta, 6%7 dia 1 fevereiro na imagem da resto 6 e tira se um para ficarmos com indice 5 
			
			if(dia_semana != 0) // fazemos a distin��o pois assim o menos um nao funcionava
				a[dia_semana-1][semana] = i;
			else
				a[6][semana-1]=i;
		}
	
		// Unico problema e que imprime os 0
		
		/*	for(int i = 0;i<7;i++) {
				for(int b = 0;b<6;b++) {
					if (a[i][b]==0)
						a[i][b] = (Integer) null;
				}
			}
		*/
		System.out.println();
		System.out.println("   "+nome_mes+" "+ano);
		System.out.println("Su Mo Tu We Th Fr Sa");
		for(int i = 0; i<a[0].length;i++) {
			System.out.printf("%2d %2d %2d %2d %2d %2d %2d ",a[0][i],a[1][i],a[2][i],a[3][i],a[4][i],a[5][i],a[6][i]);
			System.out.println();
		}
	}
}