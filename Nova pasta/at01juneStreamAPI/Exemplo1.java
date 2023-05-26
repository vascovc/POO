package at01juneStreamAPI;

import java.util.Random;
import java.util.stream.IntStream;

public class Exemplo1 {

	public static void main(String[] args) {
		
		IntStream.range(1,99)
			  .filter ( i -> i % 10 == 0)  //  multiple of 10
		      .forEach(System.out::println);
		
		
		//  exemplo 2 - 
		int soma = IntStream.of(7,10,20,34)
			.filter(i -> i % 2 ==0)
			.sum();
		System.out.println("soma="+soma);
		
		//  exemplo 3
		Random generator = new Random();
		generator
		    .ints(5,1,1000)
			.filter(i -> i % 2 ==0)
			.forEach( i -> System.out.print(i+ " "));
		
			
		
		
	}

}
