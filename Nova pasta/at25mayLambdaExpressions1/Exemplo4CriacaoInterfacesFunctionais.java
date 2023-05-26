package at25mayLambdaExpressions1;

// definition of a new functional interface
//    defines getNum()
@FunctionalInterface
interface MyNum {
	double getNum(double n);
}


public class Exemplo4CriacaoInterfacesFunctionais {
	public static void main(String[] args) {
		
		MyNum n1 = (x) -> x+1;  
			// any expression that transforms   double to double
		System.out.println(n1.getNum(10));
		
		n1 = (x) -> x*x;
		System.out.println(n1.getNum(10));
	
		//  reference to static method 
		n1 = Math::log10;
		System.out.println(n1.getNum(100));
			
	
	}
}
