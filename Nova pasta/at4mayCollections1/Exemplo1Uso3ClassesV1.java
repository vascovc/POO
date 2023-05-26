package at4mayCollections1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Random;

public class Exemplo1Uso3ClassesV1 {
	
	public static void main(String[] args){
		
		// criar 
		ArrayList<Integer> listi=new ArrayList<Integer>();
		HashSet<Integer> seti=new HashSet<>();
		LinkedList<Integer> lli= new LinkedList<>();
		
		Random r=new Random();
		for (int i=1; i<=10; i++){
			listi.add(r.nextInt(20));
			seti.add(r.nextInt(20));
			lli.add(r.nextInt(20));
		}
		
		System.out.println(listi);
		System.out.println(seti);
		System.out.println(lli);
		
		
	}
				
}


