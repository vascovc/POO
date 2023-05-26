package at11mayMaps01;

import java.util.*;

public class Exemplo1Map {

	public static void main(String[] args) {

		// declaração e inicialização
		Map<String, Double> mapa = new HashMap<>();
		
		//  outro tipo de Map
		//mapa = new TreeMap<>();
			
		
		//  adicionar pares chave, valor
		mapa.put("Rui", 32.4);
		mapa.put("Manuel", 3.2);
		mapa.put("Rita", 5.6);

		//  informação sobre o Map
		System.out.println("O Mapa contém " + mapa.size() + " elementos"); 
		
		// verificar se uma chave está no Map
		System.out.println("O Rui está no Mapa? " + mapa.containsKey("Rui"));

		// obter valor associado a uma chave
		System.out.println("A Rita tem " +  mapa.get("Rita") + "€");
		
		//  update
		mapa.put("Rita", mapa.get("Rita") + 3.6);
		
		// outro put
		mapa.putIfAbsent("Rita", 199.0);
		
		System.out.println("A Rita tem " +  mapa.get("Rita") + "€");
		System.out.println();

		System.out.println("MAPA "+mapa);
		
		// Vistas do Map:
		// =============================================
		
		// uso da interface Map.Entry
		Set<Map.Entry<String, Double>> set = mapa.entrySet();
		
		for (Map.Entry<String, Double> ele: set)
			System.out.println("O " + ele.getKey() + " ganha " + ele.getValue() + "€");

		System.out.println(mapa);
		System.out.println();

		/*  VISTAS
		 
		
		//  Lista de chaves
		Set<String> chaves=mapa.keySet();
		for (String str:chaves)
			System.out.print(str+",");
		System.out.println();

		System.out.println(chaves);
			
		
		//  lista de valores
		Collection<Double> valores= mapa.values();
		for (Double v:valores)
			System.out.printf("%.1f ",v);
		System.out.println();
		
		// ou
		for (Double v:mapa.values())
			System.out.printf("%.1f ",v);
		System.out.println();
		
		
		*/
	}

}
