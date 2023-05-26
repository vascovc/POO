package aula12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class Exer2 {
	public static void main(String[]args) {
		try {
			Scanner sc = new Scanner(new File("movies.txt"));
			sc.nextLine();//cabeçalhos
			TreeSet<Movie> set = new TreeSet<Movie>();
			while(sc.hasNext()) {
				String next = sc.nextLine();
				String[] conj = next.split("[\\t]");
				double score = Double.valueOf(conj[1]);
				int running = Integer.valueOf(conj[4]);
				Movie m = new Movie(conj[0],score,conj[2],conj[3],running);
				set.add(m);
			}
			sc.close();
			System.out.printf("%-37s %-6s %-7s %-12s %-12s\n","name","score","rating","genre","running time");
			set.forEach(n -> System.out.print(n));
			
			System.out.println("\nOrdenados por score");
			//c 1
			List<Movie> lista = new LinkedList<>(set);
			Collections.sort(lista, (o2,o1) -> Double.compare(o1.getScore(),o2.getScore()) );
			System.out.printf("%-37s %-6s %-7s %-12s %-12s\n","name","score","rating","genre","running time");
			lista.forEach(n -> System.out.print(n));
			//c 2
			System.out.println("\nOrdenados por running time");
			Collections.sort(lista,(o1,o2) -> Integer.compare( o1.getRunningTime(),o2.getRunningTime() ));
			System.out.printf("%-37s %-6s %-7s %-12s %-12s\n","name","score","rating","genre","running time");
			lista.forEach(n -> System.out.print(n));
			//d
			HashSet<String> genre = new HashSet<>();
			set.forEach( (n) -> genre.add(n.getGenre()) );// a cada objeto se obtem o genre e adiciona-se a um set que nao vai guardar duplicados
			System.out.println("\ngenre");
			genre.forEach(System.out::println);
			//e
			PrintWriter writ = new PrintWriter(new File("myselection.txt"));
			writ.printf("%-37s %-6s %-7s %-12s %-12s\n","name","score","rating","genre","running time");
			set.forEach( n -> {
								 if(n.getScore() > 60 && n.getGenre().contentEquals("comedy")){
									writ.print(n.toString());
									//System.out.print(n.toString());
									}
								} );
			writ.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("Ficheiro não existente!");
		}
	}
}
