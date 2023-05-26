package aula12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

public class Avaliacao{
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(new File("entradas.txt"));
			String[] values = sc.nextLine().replaceAll(",",".").split("\t");//linha dos valores
			double v1 = Double.valueOf(values[1]); double v2 = Double.valueOf(values[2]);double v3 = Double.valueOf(values[3]);
			HashMap<String,Double> mapa = new HashMap<String,Double>();
			while(sc.hasNext()) {
				String[] conj = sc.nextLine().replaceAll(",",".").split("\t");
				double n1 = Double.valueOf(conj[1]);
				double n2 = Double.valueOf(conj[2]);
				double n3 = Double.valueOf(conj[3]);
				double nota = n1*v1+n2*v2+n3*v3;
				//System.out.println(conj[0] + " -> " + nota);
				mapa.put(conj[0], nota);//nome - nota final
			}
			sc.close();
			LinkedList< Map.Entry<String,Double> > lista = new LinkedList<>(mapa.entrySet());
			Collections.sort(lista,(o2,o1) -> o1.getValue().compareTo(o2.getValue()));
			
			PrintWriter writ = new PrintWriter(new File("saida.txt"));
			writ.printf("%-7s %-3s\n","Nome","NF");
			for( Map.Entry<String, Double> a:lista) {
				String value = String.format("%3.1f",a.getValue());
				writ.printf("%-7s %-3s\n",a.getKey(),value.replaceAll(",", "."));//para se ficar com o ponto tem que passar para string
				//System.out.printf("%-7s %-3s\n",a.getKey(),value.replaceAll(",", "."));
			}
			writ.close();
		}
		catch(FileNotFoundException e){
			System.out.println("Ficheiro não existente");
		}
	}
}
