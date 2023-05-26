package at4mayCollections2;

import java.util.LinkedList;
import java.util.Queue;

public class Exemplo6QueueAPI {

	public static void main(String[] args) {
		
		Queue<String> q;
		q=new LinkedList<>(); // class que implementa Queue interface
	
		// add
		q.add("A");  // 
		q.add("B");  // 
		q.add("C");  // 
		
		q.offer("D");
		q.offer("E");
		
		System.out.println(q);
		
		// push
		q.remove();
		System.out.println(q);
		
		System.out.println("No inicio da fila :"+q.peek());
		q.poll();
		System.out.println(q);

	}		
		
}
