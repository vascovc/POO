package at4mayCollections2;

 
	import java.util.HashSet;
import java.util.Iterator;
	import java.util.Set;

/**
 * API de interface Set
 * @author AJST
 *
 */
	public class Exemplo5SetAPI {

		public static void main(String[] args) {
			
			Set<String> c;
			
			// alternatives
			c=new HashSet<>();
			//c=new LinkedList<>();
			 
			
			// add
			c.add("A");
			c.add("B");
			c.add("C");
			c.add("D");
			
			
			if (!c.add("D"))  //  devido a ser Set
				System.out.println("D Já existe");
			
			
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
			
		}

	}
