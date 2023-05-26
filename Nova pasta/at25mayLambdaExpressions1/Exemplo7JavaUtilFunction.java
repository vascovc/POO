package at25mayLambdaExpressions1;


	import java.util.function.Function;

	/** 
	 * Exemplo de uso de Interface Funcional Function
	 *
	 */
	public class Exemplo7JavaUtilFunction {

		public static void main(String[] args) {
			
			
			Function<String, Character> primChar= s->s.charAt(0);
			

			// uso de método apply
			char ch1 = primChar.apply("As armas e os barões");
			
			System.out.println(ch1);
		
		}

	}
