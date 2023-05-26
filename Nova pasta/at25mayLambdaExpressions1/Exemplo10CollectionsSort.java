package at25mayLambdaExpressions1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exemplo10CollectionsSort {

	public static void main(String[] args) {
		
		List<Empregado> empregados=new ArrayList<>();
		empregados.add(new Empregado("António", 1456.0));
		empregados.add(new Empregado("Manuel", 4456.0));
		empregados.add(new Empregado("Luciana", 1860.0));
		empregados.add(new Empregado("Marília", 756.0));
		empregados.forEach(System.out::println);
		
		//System.exit(-1);
		
		System.out.println();
	    Collections.sort(empregados, 
	    		(e1,e2) -> (int) (e1.salario() - e2.salario()));
		empregados.forEach(System.out::println);
		System.out.println();
		
		//System.exit(-1);
		
		Collections.sort(empregados, 
				(Empregado e1, Empregado e2) -> e1.nome().compareTo(e2.nome()));
		Collections.reverse(empregados);
		empregados.forEach(System.out::println);
		

	
	}

}
