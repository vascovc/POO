 package aula11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Exer2 {
	
	public static void main(String[] args) {
		//companhias
		try {
			Scanner input = new Scanner(new File("companhias.txt"));
			Scanner input1 = new Scanner(new File("voos.txt")); 
			input.nextLine();input1.nextLine();//cabeçalhos desnecessarios
			//companhias
			HashMap<String, String> comp= new HashMap<>();
			while (input.hasNextLine()) {//separacao no tab
				String word = input.nextLine();
				String[] str = word.split("\t");
				comp.put(str[0], str[1]);//A5 Hop! sigla-nome
			}
			input.close();
			//voos
			ArrayList<Voo> tabela = new ArrayList<Voo>();	
			while (input1.hasNextLine()) {//separacao no tab
				String word = input1.nextLine();
				String[] str = word.split("\t");
				String hora=str[0],voo = str[1],origem = str[2],atraso;
				if(str.length == 3) {//se tiver as quatro colunas -> tem atraso
					atraso = "";
				}else {
					atraso = str[3];
				}
				String companhia = comp.get(voo.substring(0,2));//a companhia sao as 2 primeiras letras
				Voo v = new Voo(hora,voo,companhia,origem,atraso);
				tabela.add(v);//lista com voos
			}
			input1.close();
			// Nao existe companhia ZI
			//a
			System.out.printf("%-6s %-8s %-19s %-22s %-6s %-14s\n","Hora","Voo","Companhia","Origem","Atraso","Obs");
			for(Voo a:tabela) {
				System.out.println(a);
			}
			//b
			PrintWriter fileWriter = new PrintWriter(new File("Infopublico.txt"));
			fileWriter.printf("%-6s %-8s %-19s %-22s %-6s %-14s\n","Hora","Voo","Companhia","Origem","Atraso","Obs");
			for(Voo a:tabela) {
				fileWriter.println(a.toString());
			}
			fileWriter.close();
			
			//c
			HashMap<String,Integer[]> atrasos = new HashMap<>();
			for(Voo a:tabela) {
				if(a.getAtraso() != ""){//se houver atraso
					if(atrasos.containsKey(a.getCompanhia())) {//se ja estiver nos atrasos
						Integer[] t = atrasos.get(a.getCompanhia());//numero atrasos - tempo total - media
						t[0] = t[0]++;
						t[1] = t[1] + a.getTimeAtraso();
						t[2] = t[1]/t[0];//tempo esta em minutos
					}
					else{//se ainda nao estiver no map
						Integer[] t = new Integer[3];//numero atrasos - tempo total - media
						t[0] = 1;
						t[1] = a.getTimeAtraso();
						t[2] = t[1];
						atrasos.put(a.getCompanhia(),t);
					}
				}
				else {
					continue;
				}
			}
			List< Map.Entry<String, Integer[]> > lista = new LinkedList<>(atrasos.entrySet());//passa se para uma lista para se poder ordenar
	        Collections.sort(lista, (o1, o2) -> o1.getValue()[2].compareTo(o2.getValue()[2]));//no value[2] esta o atraso médio
	        
			System.out.println();//so para alguma separacao na consola
			System.out.printf("%-22s %-5s\n","Companhia","Atraso médio");
			for(Map.Entry<String, Integer[]> a:lista) {
				int time = a.getValue()[2];
				System.out.printf("%-22s %02d:%02d\n",a.getKey(), time / 60,time % 60);//tempo em minutos pelo que se passa a h:min
			}
			//d
			TreeMap<String,Integer> cidades = new TreeMap<>();
			for(Voo a:tabela) {
				String ori = a.getOrigem();
				if(cidades.containsKey(ori)) {//se a origem ja for contemplada o valor passa a ser mais um 
					cidades.replace(ori, cidades.get(ori)+1);	
				}
				else//se nao estiver poe-se com 1
					cidades.put(ori, 1);
			}
			
			List< Map.Entry<String, Integer> > lista1 = new LinkedList<>(cidades.entrySet());
	        Collections.sort(lista1, (o1, o2) -> o2.getValue().compareTo(o1.getValue()));

	        //System.out.println();
			PrintWriter fileWriter2 = new PrintWriter(new File("cidades.txt"));
			fileWriter2.printf("%-22s %-5s\n","Origem","Voos");
			for( Map.Entry<String, Integer> a:lista1) {
				fileWriter2.printf("%-22s %-5s\n",a.getKey(),a.getValue());
				//System.out.printf("%-22s %-5s\n",a.getKey(),a.getValue());
			}
			fileWriter2.close();
		} catch (FileNotFoundException e) {
			System.out.println("Ficheiro não existente!");
		}
	}
}
