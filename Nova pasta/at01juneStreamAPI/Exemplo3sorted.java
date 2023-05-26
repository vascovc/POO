package at01juneStreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Exemplo3sorted {

	public static void main(String[] args) {
		
		List<String> nomes=Arrays.asList("Maria", "Pedro", "Manuel","Rita");
		
		nomes
			.stream()
			.map(s-> s.toLowerCase())
			.sorted()
			.forEach(System.out::println);
	
		System.out.println();
		//
		nomes
			.stream()
			.map(s-> s.toLowerCase())
			.sorted(Comparator.comparing(String::length))
			.forEach(System.out::println);


	}

}
