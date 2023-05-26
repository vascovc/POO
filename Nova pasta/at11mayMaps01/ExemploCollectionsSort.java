package at11mayMaps01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

/**
 * exemplo de uso de Collections....
 * 
 * @author AJST
 *
 */
public class ExemploCollectionsSort {
	public static void main(String[] args) {
		ArrayList<Integer> randInts = new ArrayList<>();
		
		// generate 5 random ints for randInts
		Random rnd = new Random();
		for (int i=0;i<5;i++)
			randInts.add(rnd.nextInt()/100000);

		System.out.println(randInts);

			// sort the randInts ArrayList  - descendent
		Collections.sort(randInts, new Comparator<Integer>() {		
			@Override public int compare(Integer o1, Integer o2) {
				return (o2.intValue() > o1.intValue()) ? 1 : -1;
			}
		});	
		
		System.out.println(randInts);
		
		// sort the randInts ArrayList  - ascendent
		Collections.sort(randInts, new Comparator<Integer>() {		
			@Override public int compare(Integer o1, Integer o2) {
				return (o2.intValue() > o1.intValue()) ? -1 : 1;
			}
		});	
		
		System.out.println(randInts);
	}
}


