package at4mayCollections2;

import java.util.*;

/**
 *  Arraylist, List, Iterator
 *
 */

public class Exemplo1List {

	public static void main(String[] args) {
		String[] str = {"Rui", "Manuel", "Rui", "Jose", "Pires", "Eduardo"};

		//List<String> lista = new ArrayList<>();
		// Trocando a implementação da lista, o interface mantem-se
		List<String> lista = new ArrayList<>(); 
		
		// foreach
		for(String s : str)
			lista.add(s);

		// toString está implementado nas Collections
		System.out.println(lista);

		// Uso de iteradores
		Iterator<String> it = lista.iterator();
		while(it.hasNext()) 
			System.out.println("iterador: " + it.next());

		// Ordenaçao pela ordem natural - método compareTo da classe
		lista.sort(null);
		System.out.println("ordenada " + lista);

		// Ordenação por uma classe tipo Comparator
		lista.sort(new LengthComparator());
		System.out.println("ordenada por length " + lista);
	}

}
