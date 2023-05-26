package at4mayCollections1;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Exemplo3ArraysToLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> amigos=Arrays.asList("Jorge","Manuel","Manuela","António");
		
		System.out.println(amigos);
		
		Iterator<String> its=amigos.iterator();
		
		while (its.hasNext()){
			String a=its.next();
			if (a.length()>5)
				System.out.println(a);
			
			if (a.endsWith("a"))
				System.out.println(a + " *");
			
		}
		
	}

}
