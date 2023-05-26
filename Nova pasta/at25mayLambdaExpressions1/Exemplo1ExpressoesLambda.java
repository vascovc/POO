package at25mayLambdaExpressions1;

import java.util.Comparator;
import java.util.function.Function;

public class Exemplo1ExpressoesLambda {
	
	public static void main (String[] args){
		
		// Comparator  
		Comparator<String> comp=(s1,s2) -> 
		             Integer.compare(s1.length(), s2.length());
		
		System.out.println(comp.compare("aaa", "aa"));
		
		
		//   Function
		Function<Double, Double>  f= x -> x*x;
		
		//  usar a fun��o ...  usando apply()
		double r=f.apply(7D);
		System.out.println(r);
		
		//  mudando a fun��o
		f= x ->  Math.log10(x);
		r=f.apply(7.0);
		System.out.println(r);
		
		//  mesma fun��o : nota��o alternativa para m�todos 
		f= Math::log10;
		r=f.apply(7.0);
		System.out.println(r);
			
		
	}

}
