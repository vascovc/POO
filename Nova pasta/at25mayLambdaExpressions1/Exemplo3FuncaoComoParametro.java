 
package at25mayLambdaExpressions1;

import java.util.function.Function;

	public class Exemplo3FuncaoComoParametro {
		/**
		 * 
		 * @param valorAMudar 	-  value for function 
		 * @param func			-  function
		 * @return				-  result of function application
		 */
		public static Integer alteraInt(int valorAMudar, 
		                Function<Integer, Integer> func){
		   return func.apply(valorAMudar);
		}
		

		public static void main(String[] args) {
			int delta = 10; 
			int valor =100;
			int res;
			
			
			// res= valor + delta
			res = alteraInt(valor, val -> val + delta);
			System.out.println("Resultado = " +  res);
			
			//  res= valor * delta (function changed easily)
			res = alteraInt(valor, i -> i * delta);
			System.out.println("Resultado = " + res);
			
			valor = 5;
			res = alteraInt(valor, v -> v * delta); // i, v is the same
			System.out.println("Resultado = " + res);
		}
	}
