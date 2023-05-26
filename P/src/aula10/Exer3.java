package aula10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exer3 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String ab = "Hello World";
		System.out.println(ab+" = "+ positions(ab));
		do {
			System.out.print("Frase: ");
			ab=sc.nextLine();
			positions(ab);
		}while(ab!="");
		sc.close();
	}
	public static String positions(String ab) {
		//ab.replaceAll("\\s","");
		char[] ch = ab.toCharArray();
		Map<Character, ArrayList<Integer>> mapa = new HashMap<>();
		
		for(int i=0;i<ch.length;i++) {
			if( mapa.containsKey(ch[i])) {//se o mapa ja contiver adiciona-se posiçao
				mapa.get(ch[i]).add(i);
			}
			else{
				ArrayList<Integer> ar = new ArrayList<Integer>();ar.add(i); 
				mapa.put(ch[i],ar);
			}
		}
		//System.out.println(mapa);
		return mapa.toString();
	}
}
