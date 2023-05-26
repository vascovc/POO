package aula09;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

public class CollectionTester {
	@SuppressWarnings("unused")
	public static void main(String[] args) {

		int[] array = {1000,5000,10000,20000,40000,100000};
		Collection<Integer> col;
		double[][][] results = new double [4][array.length][3];
		// tipo-numero_de_casos-resultados
		int counter=0;
		
		for(int DIM:array) {
			col = new ArrayList<Integer>();	
			results[0][counter] = checkPerformance(new ArrayList<>(), DIM);
			
			col = new LinkedList<Integer>();
			results[1][counter] = checkPerformance(new ArrayList<>(), DIM);
			
			col = new HashSet<Integer>();
			results[2][counter] = checkPerformance(new ArrayList<>(), DIM);
			
			col = new TreeSet<Integer>();
			results[3][counter] = checkPerformance(new ArrayList<>(), DIM);
			
			counter++;
		}
		String[] names = {"ArrayList", "LinkedList", "HashSet", "TreeSet"};
		String[] sub = {"add","search","remove"};
		System.out.printf("%-10s %10d %10d %10d %10d %10d %10d\n","Collection",1000,5000,10000,20000,40000,100000);
		//System.out.println(results[3][5][2]);
		for(int i=0;i<results.length;i++) {// i vai de 0 a 3
			System.out.printf("%-10s\n",names[i]);
			int d=0;
			for(String n:sub) {
				System.out.printf("%-10s %10.1f %10.1f %10.1f %10.1f %10.1f %10.1f\n",n,results[i][0][d],results[i][1][d],results[i][2][d],results[i][3][d],results[i][4][d],results[i][5][d]);
				d++;
			}
		}
	}

	private static double[] checkPerformance(Collection<Integer> col, int DIM) {
		Iterator<Integer> iterator;
		double start;
		double stop;
		//double delta;
		double[] times = new double[3];

		// Add
		start = System.nanoTime(); // clock snapshot before
		for(int i=0; i<DIM; i++ )
			col.add( i );
		stop = System.nanoTime();  // clock snapshot after
		times[0]= (stop-start)/1e6; // convert nanoseconds to milliseconds
		//System.out.println(col.size()+ ": Add to " + col.getClass().getSimpleName() +" took " + delta + "ms");
		
		// Search
		start = System.nanoTime(); // clock snapshot before
		for(int i=0; i<DIM; i++ ) {
			int n = (int) (Math.random()*DIM);
			if (!col.contains(n)) 
				System.out.println("Not found???"+n);
		}
		stop = System.nanoTime();  // clock snapshot after
		times[1] = (stop-start)/1e6; // convert nanoseconds to milliseconds
		//System.out.println(col.size()+ ": Search to " + col.getClass().getSimpleName() +" took " + delta + "ms");
				
		// Remove
		start = System.nanoTime(); // clock snapshot before
		iterator = col.iterator();
		while (iterator.hasNext()) {
		    iterator.next();
		    iterator.remove();
		}
		stop = System.nanoTime();  // clock snapshot after
		times[2] = (stop-start)/1e6; // convert nanoseconds to milliseconds
		//System.out.println(col.size() + ": Remove from "+ col.getClass().getSimpleName() +" took " + delta + "ms");

		return times;
	}
}

