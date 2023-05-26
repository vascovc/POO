package aula10;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Exer2 {
	public static void main(String[]args) {
		Map< String, ArrayList<String> > mapa = new TreeMap<>();
		String a = "branco";
		String ad1 = "Que tem a cor da neve";
		String ad2 = "Descorado pálido";
		String ad3 = "Cor de leite";
		ArrayList<String> ad = new ArrayList<String>();ad.add(ad1);ad.add(ad2);ad.add(ad3);
		mapa.put(a, ad);
		String b = "preto";
		ArrayList<String> bd = new ArrayList<String>();bd.add("Escuro");bd.add("noite");
		mapa.put(b, bd);
		String c = "azul";
		ArrayList<String> cd = new ArrayList<String>();cd.add("Cor do ceu");cd.add("Cor do mar");
		mapa.put(c, cd);
		String d = "amarelo";
		ArrayList<String> dd = new ArrayList<String>();dd.add("Cor do sol");dd.add("girassois");
		mapa.put(d, dd);
		String e = "verde";
		ArrayList<String> ed = new ArrayList<String>();ed.add("cor da relva");ed.add("folhas");
		mapa.put(e, ed);
		String f = "vermelho";
		ArrayList<String> fd = new ArrayList<String>();fd.add("cor do sangue");fd.add("vestido");
		mapa.put(f, fd);
		
		System.out.println(mapa);
		//adicionar definicao
		ArrayList<String> str = mapa.get("branco");
		str.add("farinha");
		mapa.replace("branco", str);
		
		mapa.get("vermelho").add("cravos");
		System.out.println(mapa);
		//alterar
		mapa.get("vermelho").remove(0);
		mapa.get("verde").clear();
		System.out.println(mapa);
		
		//remove
		mapa.remove("amarelo");
		System.out.println(mapa);
		
		for(Object ob:mapa.keySet()) {
			System.out.println(ob.toString() +" = " + mapa.get(ob));
		}
		System.out.println(mapa.keySet());
		System.out.println(mapa.values());
		
		System.out.println();
		for(int i=0;i<10;i++)
			System.out.println(rand_ob(mapa,"branco"));
	}
	public static String rand_ob(Map mapa,String termo) {
		ArrayList<String> values = (ArrayList<String>) mapa.get(termo);
		int numero = values.size();
		return values.get( (int) ( Math.random()*(numero) ) );
	}
}
