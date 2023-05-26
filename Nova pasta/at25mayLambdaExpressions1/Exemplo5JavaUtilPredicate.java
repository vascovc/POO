package at25mayLambdaExpressions1;

import java.util.function.Predicate;
/** 
 * Exemplo de uso de Interface Funcional Pedricate
 *
 */
public class Exemplo5JavaUtilPredicate {

	public static void main(String[] args) {
		
		Predicate<String> grandeString= s -> s.length() > 256;
		
		
		// uso  através de test()
		boolean eGrande = grandeString.test("As armas e os barões");
		
	
		System.out.println(eGrande);
	
	}

}
