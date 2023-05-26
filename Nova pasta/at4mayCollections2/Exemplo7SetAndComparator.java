package at4mayCollections2;

import java.util.TreeSet;


public class Exemplo7SetAndComparator{

	public static void main(String args[]) {
		TreeSet<String> ts = 
				new TreeSet<String>(new LengthComparator());
		
		ts.add("jgdshj");
		ts.add("hj");
		ts.add("khsdfk jjskfk");
		ts.add("f");
		ts.add("opeiwoj kn kndsjsa");
		ts.add("kndkd");
		
		for (String element : ts)
		      System.out.println(element + " ");
	}
}


