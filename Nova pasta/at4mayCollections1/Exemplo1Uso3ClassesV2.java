package at4mayCollections1; 

	import java.util.ArrayList;
	import java.util.HashSet;
	import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

	public class Exemplo1Uso3ClassesV2 {
		
		public static void main(String[] args){
			
			// Usan programação para interfaces 
			List<Integer> listi=new ArrayList<Integer>();
			Set<Integer> seti=new HashSet<>();
			Queue<Integer> lli= new LinkedList<>();
			
			seti=new TreeSet<> ();  // conjunto ordenado
			
			Random r=new Random();
			for (int i=1; i<=10; i++){
				int n=r.nextInt(20);
				listi.add(n);
				seti.add(n);
				lli.add(n);
			}
			
			System.out.println("LIST : "+listi);
			System.out.println("SET  : "+seti);
			System.out.println("QUEUE: "+lli);
			
			
		}
					
	}


