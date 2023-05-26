package at01juneStreamAPI;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * adaptado de https://winterbe.com/posts/2014/07/31/java8-stream-tutorial-examples/
 *
 */

public class Exemplo4StreamsAndCollections {

	public static void main(String[] args) {
	
		//  create list with some persons...
		List<Person> persons =
		    Arrays.asList(
		        new Person("Max", 18),
		        new Person("Peter", 23),
		        new Person("Pamela", 23),
		        new Person("David", 12));
		
		
		//  using collect to obtain a derived list, after filtering
		List<Person> filtered =
			    persons
			        .stream()
			        .filter(p -> p.getName().startsWith("P"))
			        .collect(Collectors.toList());

		
		System.out.println(filtered);    // [Peter, Pamela]
		
		//  next example groups all persons by age
		//  uses groupingBy
		Map<Integer, List<Person>> personsByAge = persons
			    .stream()
			    .collect(Collectors.groupingBy(p -> p.getAge()));

		System.out.println(personsByAge);
		personsByAge
			    .forEach((age, p) -> System.out.format("age %s: %s\n", age, p));
		
		 
		// age 18: [Max]
		// age 23: [Peter, Pamela]
		// age 12: [David]
		
		
	    // Collectors are versatile
		Double averageAge = persons
			    .stream()
			    .collect(Collectors.averagingInt(p -> p.getAge()));

		System.out.println(averageAge);     // 19.0
			
		
		// more comprehensive statistics
		IntSummaryStatistics ageSummary =
			    persons
			        .stream()
			        .collect(Collectors.summarizingInt(p -> p.getAge()));

		System.out.println(ageSummary);
		// IntSummaryStatistics{count=4, sum=76, min=12, average=19.000000, max=23}
		
		
		//  Collectors.joining
		String phrase = persons
			    .stream()
			    .filter(p -> p.getAge() >= 18)
			    .map(p -> p.getName())
			    .collect(Collectors.joining(" and ", "In Germany ", " are of legal age."));

		System.out.println(phrase);
		// In Germany Max and Peter and Pamela are of legal age.
		
		
		// Collectors.toMap
		// we have to specify how both the keys and the values should be mapped.
		
		Map<Integer, String> map = persons
			    .stream()
			    .collect(Collectors.toMap(
			        p -> p.getAge(),
			        p -> p.getName(),
			        (name1, name2) -> name1 + ";" + name2));

		System.out.println(map);
		// {18=Max, 23=Peter;Pamela, 12=David}
			

		
		//  Reduce
		persons
	    .stream()
	    .reduce((p1, p2) -> p1.getAge() > p2.getAge() ? p1 : p2)
	    .ifPresent(System.out::println);    // Pamela
			
			
	}

}
