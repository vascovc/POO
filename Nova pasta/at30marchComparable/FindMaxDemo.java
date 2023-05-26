package at30marchComparable;

class FindMaxDemo {
	public static void main( String [ ] args )  {
		Figura[] sh1 = { 
				new Circulo(1, 3, 100), 
				new Quadrado(3, 4, 200),
				new Retangulo(1, 1, 10, 6)
				};
		
		String[] st1 = { "Joe", "Bob", "Bill", "Leke" };

		System.out.println(UtilCompare.findMax(sh1));  // => Comparable
		System.out.println(UtilCompare.findMax(st1));
    
	     //sh1[1].desenha();  //  não funciona, nao Desenhavel
		// sh1[2].desenha();
		//Retangulo r1=(Retangulo) sh1[2];
		//r1.desenha();
	}
}
