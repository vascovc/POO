package at25mayLambdaExpressions1;

import java.util.function.Predicate;
/** 
 * Exemplo de uso de Interface Funcional Pedricate
 *
 */
public class Exemplo5JavaUtilPredicate {

	public static void main(String[] args) {
		
		Predicate<String> grandeString= s -> s.length() > 256;
		
		
		// uso  atrav�s de test()
		boolean eGrande = grandeString.test("As armas e os bar�es");
		
	
		System.out.println(eGrande);
	
	}

}
