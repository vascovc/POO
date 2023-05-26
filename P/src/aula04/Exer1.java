package aula04;

import java.util.Scanner;

public class Exer1 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Palavra, frase ou parágrafo:");
		String ab = sc.nextLine();
		sc.close();
		
		String caps = ab.toLowerCase();
		
		char last = ab.charAt(ab.length()-1);
		
		String tf = ab.substring(0,3);
		
		System.out.print("Em minúsculas: "+caps+"\nO último caracter: "+last+"\nOs 3 primeiros caracteres: "+tf+"\n");
		
		// tira os 'a' da palavra e substitui por um 'e'
		String a_1 = ab.replace('a','e');
		// se e a string vazia
		boolean a_2 = ab.isEmpty();
		// os tres ultimos carateres
		String a_3 = ab.substring(ab.length()-3);
		// o hash code
		int a_4 = ab.hashCode();
		
		System.out.print("Substituindo os 'a' por 'e': "+a_1+"\nÉ a string vazia: "+a_2+"\nA string a começar no antepenultimo carater: "+a_3+"\nO hashcode da string: "+a_4);
	}
}