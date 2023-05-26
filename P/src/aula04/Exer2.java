package aula04;

import java.util.Scanner;

public class Exer2 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Frase:");
		String ab = sc.nextLine();
		sc.close();
		System.out.println("A frase cont�m "+countDigits(ab)+" carateres num�ricos");
		System.out.println("Cont�m "+countSpaces(ab)+" espa�os");
		System.out.println("A frase est� apenas em MAI�SCULAS: "+checkCaps(ab));
		System.out.println("A frase sem espa�os repetidos �:\n"+joinSpaces(ab));
		System.out.println("� um pal�ndromo: "+palindrome(ab));
		
	}
	public static int countDigits(String x) {
		char[] a = x.toCharArray();
		int count = 0;
		for(int i = 0;i<x.length();i++) {
			if (Character.isDigit(a[i]))
				count++;
		}
		return count;
	}
	public static int countSpaces(String x) {
		int count=0;
		char[] a = x.toCharArray();
		for(int i = 0;i<x.length();i++) {
			if(a[i] == ' ')
				count++;
		}// converte se a char array e se esse char for espa�o ent o count aumenta
		return count;
	}
	public static boolean checkCaps(String x) {
		if(x.toUpperCase() == x) // se a string para maiusculas for igual a si mesma entao esta em maiusculas
			return true;
		else
			return false;
	}
	public static String joinSpaces(String x) {
		char[] a = x.toCharArray();
		String fin = ""; 
		for(int i = 0; i<a.length-1;i++) {
			if (a[i] == ' ') {
				if (a[i+1] != ' ')
						fin += a[i];			}
			else
				fin += a[i];
		}// estamos num caracter, se nao for um espa�o adicionamos, se for entao caso o seguinte caracter nao seja adicionamos
		return fin;
	}
	public static boolean palindrome(String x) {
		char[] a = x.toCharArray();
		for(int i=0 ; i <= (x.length()-1) ; i++) {
			if (a[i] != a[x.length()-i-1])
					return false;
		}// se a primeira for diferente da ultima devolve-se false se nao continua se e vemos o par seguinte, a segunda letra e a penultima
		// poderia ser otimizado o ciclo pois este faz duas vezes a mesma coisa, a verifica�ao apos o meio e redundante
		return true;
	}
}