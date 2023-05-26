package aula09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ALDemo {

	public static void main(String[] args) {
		ArrayList<Integer> c1 = new ArrayList<>();
		for (int i = 10; i <= 100; i+=10) 
			c1.add(i);
		System.out.println("Size: " + c1.size());
		for (int i = 0; i < c1.size(); i++) 
			System.out.println("Elemento: " + c1.get(i));
		System.out.println(c1.indexOf(10));
		c1.replaceAll(num -> num/2);
		System.out.println(c1);
		
		ArrayList<String> c2 = new ArrayList<>();
		c2.add("Vento");
		c2.add("Calor");
		c2.add("Frio");
		c2.add("Chuva");
		c2.add("Chuva");
		c2.add("20");
		c2.add(0, "Hello");
		System.out.println(c2);
		Collections.sort(c2);
		System.out.println(c2);
		c2.remove("Chuva"); 
		c2.remove(0);
		
		System.out.println(c2);
		c2.clear();
		System.out.println(c2);
		
		Set<Pessoa> c3 = new HashSet<>();
		c3.add(new Pessoa("Miguel Tomas", 2000, new Data(3,6,2010)));
		c3.add(new Pessoa("Joao Afonso", 1500, new Data(30,5,2001)));
		c3.add(new Pessoa("Joao Afonso", 1500, new Data(30,5,2001)));
		c3.add(new Pessoa("John Smith", 1600, new Data(20,4,2011)));
		c3.add(new Pessoa("António Manel", 1501, new Data(10,9,2009)));
		c3.add(new Pessoa("António Manel", 1501, new Data(10,9,2009)));
		for(Pessoa p:c3)
			System.out.println(p);
		
		Set<Data> c4 = new TreeSet<>();
		c4.add(new Data(30,12,2001));
		c4.add(new Data(30,12,2001));
		c4.add(new Data(3,1,2001));
		c4.add(new Data(2,1,2001));
		c4.add(new Data(30,12,2005));
		c4.add(new Data(15,2,2003));
		System.out.println(c4);
		
	}
}