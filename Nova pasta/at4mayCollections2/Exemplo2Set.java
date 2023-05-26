package at4mayCollections2;

import java.util.*;

/**
 *   Set, TreeSet, HashSet 
 *
 */
public class Exemplo2Set {

	public static void main(String[] args) {
		String[] str = {"Rui", "Manuel", "Rui", "Jose", "Pires", "Eduardo"};

		//Set<String> conj = new HashSet<>();
		Set<String> conj = new TreeSet<>();
		
		
		for(String s : str){
			if(!conj.add(s))
				System.out.println(s + " Repetido!");;
		}

		System.out.println(conj);

		Iterator<String> it = conj.iterator();
		while(it.hasNext()) 
			System.out.println("iterador: " + it.next());

	}
}

