package at25mayLambdaExpressions1;

import java.util.function.*;

/**
 * Os exemplos de Criacao de Interfaces Funcionais
 * usando Interfaces de java.util.function
 * 
 */

public class Exemplo8UsoExistingJavaInterfaces {
	public static void main(String[] args) {
		
		// primeira diferença:  uso de Function<>
		Function<Double,Double> n1 = (x) -> x+1;  
			// qualquer expressão que transforme double em double
		
		//  segunda diferença: uso de apply()
		System.out.println(n1.apply(10.0));
		
		n1 = (x) -> x*x;
		System.out.println(n1.apply((double)10));
	
		//  referência para método
		n1 = Math::log10;
		System.out.println(n1.apply(100.0));
			
	
	}
}
