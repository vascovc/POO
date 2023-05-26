package at20abrilEnumerado2;

/**
 * Write a description of class TstTShirt1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import static java.lang.System.out;
public class TstTShirt1 {
	/**
	 * main
	 * @param args
	 */
	public static void main(String[] args) {
	
		for(TShirt t : TShirt.values())
			out.printf("Tamanho %s Preço %4.1f%n",t, t.getPreco());
		
		// alterar preço das XL
		TShirt myShirt=TShirt.XL;
		myShirt.setPreco(20);
	
		//  ver novamente
		out.println("-----");
		for(TShirt t : TShirt.values())
			out.printf("Tamanho %s Preço %4.1f%n",t, t.getPreco());
	}
}
