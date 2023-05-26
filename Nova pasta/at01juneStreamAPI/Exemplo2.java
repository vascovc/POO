package at01juneStreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Exemplo2 {

	public static void main(String[] args) {
		
		//  stream de uma "lista" de Strings
		Stream.of("Maria", "Pedro", "Manuel","Rita")
			.findFirst()
			.ifPresent(System.out::println);
		
		// outra forma
		List<String> nomes=Arrays.asList("Maria", "Pedro", "Manuel","Rita");
		
		nomes
			.stream()
			.filter(s -> s.startsWith("P"))
			.findFirst()
			.ifPresent(System.out::println);

	}

}
