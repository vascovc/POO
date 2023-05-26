
package at25mayLambdaExpressions1;

import java.util.function.Consumer;

/**
 * Example of  java.util.function.Consumer
 *
 */
public class Exemplo6JavaUtilsConsumer {		
	public static void main(String[] args) {
        
		Consumer<String> toLow;
        
        toLow= s -> System.out.println(s.toLowerCase());
         
        // Consumer defines accept()
        //  that performs the operation in a given input
        //  in our case operation is out.println of lowercase 
        toLow.accept("JAVA 8 - FUNCTIONAL INTERFACES");                 
    
    }
	
}
