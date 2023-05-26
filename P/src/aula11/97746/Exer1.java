package aula11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeMap;

public class Exer1 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		try {
			Scanner input = new Scanner(new File("major.txt")).useDelimiter("[ \\t\\n\\r.,:'‘’;?!-*=+&/()\\[\\]”“\"\']");
			TreeMap<String,TreeMap<String,Integer>> map = new TreeMap<>(); 
			String atual="",word="";
			
			do{
				atual = input.next().toLowerCase();
				//System.out.println(atual);
			}while(atual.length()<3);
			
			while (input.hasNext()){
				word = input.next().toLowerCase();
				if(word.length()>2) {
					if(map.containsKey(atual)) {
						TreeMap<String,Integer> inside = map.get(atual);
						if(inside.containsKey(word)){//se o par ja existir
							Integer num = inside.get(word);
							inside.replace(word, ++num);
						}
						else{
							inside.put(word, 1);
						}
						map.replace(atual, inside);//atualiza-se no main o inside
					 }
					else {
						TreeMap<String,Integer> inside = new TreeMap<>();
						inside.put(word, 1);
						map.put(atual, inside);
					 }
					atual = word;
				}
				else {
					continue;
				}
			}
		input.close();
		/*primeiro leem se duas palavras e depois vemos se a primeira se encontra no mapa se nao estiver
		  criamos um inside e metemos la a palavra e um 1(numero de aparicoes). Se ja la estiver entao temos que ver se a segunda
		  palavra la esta se estiver entao temos que retirar o valor e alterar para um numero superior.
		  se for um outro par então colocamos la a palavra e o 1
		  
		  a questao de uma estar fora e outra dentro e por causa de nao se deverem ler duas palavras por ciclo
		  no final de uma iteracao a palavra que era a atual passa a ser a anterior nessa
		*/
		for(Object a:map.entrySet()) {
			System.out.println(a);
		}
		
		}catch (FileNotFoundException e) {
			System.out.println("Ficheiro não existente!");
		}
		
	}

}
