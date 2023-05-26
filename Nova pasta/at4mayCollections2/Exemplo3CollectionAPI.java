package at4mayCollections2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Exemplo3CollectionAPI {

	public static void main(String[] args) {
		
		Collection<String> c;
		
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
		
	}

}
