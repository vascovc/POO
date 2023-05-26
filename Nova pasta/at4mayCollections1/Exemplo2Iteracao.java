package at4mayCollections1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import static java.lang.System.out;

public class Exemplo2Iteracao {
		
		public static void main(String[] args){
			
			// Usan programação para interfaces 
			List<Integer> listi=new ArrayList<Integer>();
			
			
			Random r=new Random();
			for (int i=1; i<=10; i++){
				int n=r.nextInt(20);
				listi.add(n);
			}

			//  mostrar contéudo usando toString() 
			out.println("LIST : "+listi);
			
			//  1 - iteração EXTERNA usando indíces
			for (int i=0; i<listi.size();i++)
				out.print(listi.get(i)+", ");
			out.println();
			
			//  1b - iteração EXTERNA - iterador foreach
			for (int i:listi)
				out.print(i+", ");
			out.println();
			
			//  2 - iteração "interna" - Iterator<E>
			
			Iterator<Integer> iti = listi.iterator();
			
			while (iti.hasNext()){
				out.print(iti.next()+", ");
			}
			out.println();
			
			// outro exemplo
			List<Integer> listi2=new ArrayList<>(listi);
			
					
			iti = listi.iterator();  // necessário para inicializar
			
			while (iti.hasNext()){
				int n=iti.next();
				if (n%2==0)
					out.print(n+", ");
				else
					iti.remove();  //  remover de listi !!!
			}
			out.println();
			
			out.println(listi);  // só mantem os pares
			
			
			// ListIterator  (apenas para listas)
			out.println("Before: "+listi2);
			
			ListIterator<Integer> liti= listi2.listIterator();
			while (liti.hasNext()){
				int n=liti.next();
				if (n%2==0) {
					out.print(n+", ");
					//liti.remove();  //  remover de listi2 !!!
					
				} else
					liti.set(-1);
			}
			out.println();
			
			out.println("After  : "+listi2);
			
		}
					
	}


