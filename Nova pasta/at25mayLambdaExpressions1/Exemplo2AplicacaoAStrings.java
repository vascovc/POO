package at25mayLambdaExpressions1;

public class Exemplo2AplicacaoAStrings {

	interface MyFunc<T> { 
		T func(T n); 
	}
	
	static String stringOp(MyFunc<String> sf, String s) {
		return sf.func(s);
	}

	public static void main(String[] args) {
		 
		
		String inStr = "Lambdas add power to Java";
		
		String outStr = stringOp((str) -> str.toUpperCase(), inStr);
		System.out.println("The string in uppercase: " + outStr);
		
		// This passes a block lambda that removes spaces.
		outStr = stringOp((str) ->  {
			StringBuilder result = new StringBuilder();
			for(int i = 0; i < str.length(); i++)
				if(str.charAt(i) != ' ')
					result.append( str.charAt(i) );
				return result.toString();
		}, inStr);
		
		System.out.println("The string with spaces removed: " + outStr);
		
	}

}
