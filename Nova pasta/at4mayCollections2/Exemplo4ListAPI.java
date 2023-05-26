package at4mayCollections2;

 
	import java.util.ArrayList;
	import java.util.Collection;
	import java.util.Iterator;
	import java.util.LinkedList;
import java.util.List;

/**
 * exemplifica API da interface List
 * @author AJST
 *
 */

	public class Exemplo4ListAPI {

		public static void main(String[] args) {
			
			List<String> c;
			
			// alternatives
			c=new ArrayList<>();
			//c=new LinkedList<>();
			 
			
			// add
			c.add("A");
			c.add("B");
			c.add("C");
			c.add("D");
			
			System.out.println(c);  // [A, B, C, D]
			// remove
			c.remove("B");
			// contains
			
			if( c.contains("C"))
				System.out.println("contém C");
			
			// size
			System.out.printf("%d elementos\n",c.size());;
			
			// iterator
			Iterator<String> it=c.iterator();
			
			while (it.hasNext())
				System.out.print(it.next()+" ");
			
			System.out.println();
			
			// NOT IN COLLECTION...
			// get
			System.out.println("na posicao 1 " +c.get(1));
			System.out.println("na posicao 2 " +c.get(2));

			// Exception
			//System.out.print("na posicao 10 " +c.get(10));
			
			
			// indexOf
			int pos= c.indexOf("C");
			
			System.out.printf("%s na posição %d\n",c.get(pos),pos);

			
		}

	}
