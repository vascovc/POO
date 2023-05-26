package aula13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Exer1_97746 {
	public static void main(String[]args) throws FileNotFoundException {
		File folder = new File("files");
		File[] arquivos = folder.listFiles();
		Scanner sc = new Scanner(new File("jwords.txt"));
		HashSet<String> dic = new HashSet<String>();
		while(sc.hasNext()){
			dic.add(sc.next());
		}//dic com as palavras reservadas
		sc.close();
		TreeMap<String,TreeMap<String,Integer>> palavras = new TreeMap<String,TreeMap<String,Integer>>();
		for(File f:arquivos) {
			//um ficheiro
			if(f.getPath().endsWith(".java")) {// se o ficheiro for java
				Scanner sc1 = new Scanner(new File(f.getPath()));
				while(sc1.hasNext()) {
					String word = sc1.next();
					if(dic.contains(word)) {// se for palavra reservada
						if(palavras.containsKey(word)){// se ja tivermos encontrado essa palavra alguma vexz
							TreeMap<String,Integer> mapa = palavras.get(word);
							if(mapa.containsKey(f.getName())) {//se o ficheiro ja tiver a palavra
								mapa.replace(f.getName(),mapa.get(f.getName())+1);
							}
							else{//se o ficheiro ainda nao tiver essa palavra
								mapa.put(f.getName(), 1);
							}
							palavras.replace(word, mapa);
						}
						else{//encontramos pela primeira vez e assim guardamos num dicionario
							TreeMap<String,Integer> mapa = new TreeMap<String,Integer>();
							mapa.put(f.getName(),1);
							palavras.put(word,mapa);
						}
					}
				}
				sc1.close();
			}
		}
		PrintWriter writ = new PrintWriter(new File("reservadas.txt"));
		writ.printf("%-12s %-15s %-2s\n","Words","File","No" );
		System.out.printf("%-12s %-15s %-2s\n","Words","File","No" );
		for(Map.Entry<String, TreeMap<String,Integer>> a:palavras.entrySet()) {
			for(Map.Entry<String, Integer> b:a.getValue().entrySet()) {
				System.out.printf("%-12s %-15s %-2d\n",a.getKey(),b.getKey(),b.getValue());
				writ.printf("%-12s %-15s %-2d\n",a.getKey(),b.getKey(),b.getValue());
			}
		}
		writ.close();
	}
}
