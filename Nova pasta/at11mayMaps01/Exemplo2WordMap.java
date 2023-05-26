package at11mayMaps01;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * Map<String, Integer
 * view: keySet
 * 
 * leitura de ficheiro
 * 
 * @author AJST
 *
 */
public class Exemplo2WordMap {

	public static void main(String[] args) {
		Map<String, Integer> m = //new HashMap<String, Integer>();
	        		new TreeMap<String, Integer>();

		// Initialize frequency table from command line
	    Scanner scf=null;
	        
	        for (String a : args) {
	        	try {
					scf=new Scanner(new File(a));
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	    
	        while (scf.hasNext()){
	        	a=scf.next();
	        	Integer freq = m.get(a);
	        	m.put(a, (freq == null) ? 1 : freq + 1);
	        }
	   
	        }

	        System.out.println(m.size() + " distinct words:");
	        System.out.println(m);
	        
	        for (String s:m.keySet())
	        	System.out.println(s+"->"+m.get(s));
	        
	       
	    }
	}