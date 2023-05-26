package aula99_C;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class POO15Ap {
	public static void main(String[] args) {
		POO15Ap ap = new POO15Ap();
		ap.alinea1();
		//ap.alinea2();
		ap.alinea3();
	}
	public void alinea1() {
		System.out.println("\nA1)");
		Escola ih = new Escola("International House Aveiro","Rua Domingos Carrancho, 1, 3800-145 Aveiro");
		ExameEscrito e1 = new ExameEscrito("Inglês para Empresas","Anthony Laurel", "12.06.2015 15h", "15; 22", 4); // 4versões
		e1.setConsulta(true);
		e1.setPrazo(6);
		ih.add(e1);
		ih.add(new ExameEscrito("Alemão", "Manfred Glesner", "12.06.2015 10h", "13"));
		TesteComputador t1 = new TesteComputador("Italiano Intermédio","Luca Benini", "01.06.2015 10h", "25");
		t1.setLink("http://www.ihaveiro.com/outras-linguas/tii");
		ih.add(t1);
		ih.add(new ProvaOral("Inglês Avançado", "Anthony Laurel","05.06.2015 10h", "3", Lingua.UK));
		System.out.println(ih); // imprime todas as provas da escola
		System.out.println(ih);
//		try {
//			PrintWriter fl = new PrintWriter(new File("output2.txt"));
//			fl.println(ih);
//			fl.close();
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
	}
	public void alinea3(){
		try(Scanner sc=new Scanner(new File("samples_s2.txt"))){
			sc.next();
			HashMap<String, ArrayList<String> > mapa=new HashMap<>();
			while(sc.hasNext()) {
				String[] linha = sc.next().split("\t");
				String prof = linha[2];
				if(mapa.containsKey(prof)) {
					mapa.get(prof).add(linha[1]);
				}
				else {
					ArrayList<String> l = new ArrayList<String>();
					l.add(linha[1]);
					mapa.put(prof,l);
				}
			}
			sc.close();
			
			for(String k:mapa.keySet()) {
				System.out.println(k+mapa.get(k));
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
			e.printStackTrace();
		}
	}
}
