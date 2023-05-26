package aula12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;

public class Exer1 {
	public static void main(String[]args) {
		try {
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(new File("major.txt")).useDelimiter("[ \\t\\n\\r.,:'‘’;?!-*=+&/()\\[\\]”“\"\']");
			HashSet<String> palavras = new HashSet<String>();
			int count = 0;
			while(sc.hasNext()) {
				count++;
				palavras.add(sc.next());
			}
			sc.close();
			System.out.println("Número Total de Palavras: "+count);
			System.out.println("Número de Diferentes Palavras: "+palavras.size());
		}
		catch(FileNotFoundException e) {
			System.out.println("Ficheiro não existente!");
		}
	}
}
