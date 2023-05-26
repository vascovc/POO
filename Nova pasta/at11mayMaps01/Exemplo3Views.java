package at11mayMaps01;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
//import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Exemplo3Views {

	public static void main(String[] args) {
		
		//  criar um Map  para ter número de ocorrências de letras
		Map<Character,Integer> map =new TreeMap<>();
		//String str1="Universidade de Aveiro";
		String str1="aaabbbbcccccddddddeff";
		
		for (int i=0;i<str1.length();i++){
			Character c=str1.charAt(i);
			if (Character.isAlphabetic(c))
				if (map.containsKey(c))
					map.put(c, map.get(c)+1);
				else 
					map.put(c, 1);
			
		}
		
		//  mostrar Map
		System.out.println(map);
		System.out.println();
		
		//  keys
		System.out.print("Keys             :");
		Set<Character> keys = map.keySet();
		for (Character key: keys)
			System.out.print(key+", ");
		System.out.println();
		
		//  keys using Iterator
		System.out.print("Keys (Iterator)  :");
		Iterator<Character> it= keys.iterator();
		while (it.hasNext())
			System.out.print(it.next()+", ");
		System.out.println();
		System.out.println();
		
		// values
		System.out.print("Values           :");
		Collection<Integer> values = map.values();
		for (Integer value: values)
			System.out.print(value+", ");
		System.out.println();
		
		// values iterator
		System.out.print("Values (iterator):");
		Iterator<Integer> itv= values.iterator();
		while (itv.hasNext())
			System.out.print(itv.next()+", ");
		System.out.println();
		System.out.println();
		
		// Set of Entrys 
		Set<Map.Entry<Character, Integer>> entries=map.entrySet();
		
		Iterator<Map.Entry<Character, Integer>> ite=entries.iterator();
		
		while (ite.hasNext()){
			Map.Entry<Character,Integer> me=ite.next();
			
			System.out.printf("%c -> %d\n", me.getKey(),me.getValue());	
			me.setValue(-1);
		}
		System.out.println(map);	
	}
}
