package at25mayLambdaExpressions1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Exemplo9SortComCollectionsEArrays {

	public static void main(String[] args) {
		
		List<Integer> lst = new ArrayList<>();
		// Código que adiciona 1000 elementos na lista
		for (int i=0; i<1000; i++)
			lst.add(1000-i);
		
		//  ordenar a lista lst
		Collections.sort(lst);
		//lst.sort();

		lst.forEach(System.out::print);
		
		
				
		//  exemplo de uso de forEach
		String[] vec = new String[] { "once", "upon", "a", "time", "in", "Portugal" };
		List<String> list=Arrays.asList(vec);
		
		list.forEach(s -> System.out.print(s.toUpperCase()+" "));
		System.out.println();
		
		list.forEach(System.out::print);
		System.out.println();
		
		//  list sort
		list.sort(String::compareTo);
		
		Collections.reverse( list);
		
		list.forEach(System.out::println);
		System.out.println();
		

		//  Exemplos com vetores
		vec = new String[] { "once", "upon", "a", "time", "in", "Aveiro" };
		
		//  excemplo de Array.toString()
		System.out.println("Arrays.toString():"+Arrays.toString(vec));
			
		// ordenar o vetor vec   pelo comprimento
		Arrays.sort(vec, Comparator.comparing(String::length));

		for (String s : vec) System.out.print(s+" ");
			System.out.println();

	}

}
