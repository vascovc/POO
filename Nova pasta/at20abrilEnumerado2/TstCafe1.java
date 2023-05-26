package at20abrilEnumerado2;

/**
 * Write a description of class TstCafe1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
import static java.lang.System.out;

public class TstCafe1 {
	
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    int opcao = 0;
	    Cafe meuCafe = null;
	    
	
	    out.println("-----  ESCOLHAS ----");
	    Cafe[] cafes = Cafe.values();   // values()
	    for(Cafe c : cafes)
	     out.printf("%d - %s%n", c.ordinal()+1, c.name());
	    
	    do {
	       out.print("Como quer o seu Cafe ? ");
	       opcao = input.nextInt();
	    }
	    while(opcao<1 || opcao>cafes.length);
	    meuCafe = cafes[opcao-1];
	    out.println("\nOh Ze, tira um cafe " + meuCafe);
    }
}