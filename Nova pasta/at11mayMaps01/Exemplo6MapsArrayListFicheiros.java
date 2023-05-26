package at11mayMaps01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
//import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Exemplo6MapsArrayListFicheiros {

	public static void main(String[] args) {
		
		// Collections para guardar informação
		Map<String, List<Integer>> wordsMap; 
		//wordsMap= new HashMap<>();
		wordsMap= new TreeMap<>();
		
		List<String> lines = new ArrayList<>();
		
		// leitura e processamento de ficheiro
		String fileName=null;
		if (args.length > 0)
			fileName=args[0];
		else
			fileName="livro.txt";
		
		processFile(fileName, wordsMap, lines);
		
		System.out.println(wordsMap);
		
		// print more common words  - usando VIEW keySet
		for (String w:wordsMap.keySet()){
			if (wordsMap.get(w).size()>200)
				System.out.printf(" %s (%d ocurrences)-> %s\n", w, wordsMap.get(w).size(),wordsMap.get(w));
		}
		
		//  exemplo de uso de entrySet VIEW
		
		Set<Map.Entry<String,List<Integer>>> entries=wordsMap.entrySet();
		
		for (Map.Entry<String, List<Integer>> e:entries){
			if (e.getKey().startsWith("j"))
				System.out.printf("%s -> %s %s %s \n", 
					e.getKey(), 
					e.getValue().get(0),
					(e.getValue().size()>1 ? e.getValue().get(1): ""),
					(e.getValue().size()>2 ? e.getValue().get(2)+"...": "")
					);
			
			
		}
			
		
		//  procurar palaavras
		
		//System.out.println (lines);
		
		String word="Jacinthico";
		word=word.toLowerCase();
		
		List<Integer> l=wordsMap.get(word);
		System.out.println(l);
		
		for (int pos:l){
			System.out.printf("%d : %s\n",pos+1,lines.get(pos));
		}
		
		
		
		
	}

	/**
	 * 
	 * @param fileName
	 * @param wordsMap
	 * @param lines
	 */
	private static void processFile(String fileName, 
			Map<String, List<Integer>> wordsMap, 
			List<String> lines) {
		
		File fin= new File (fileName);
		Scanner scf=null;
		try {
			scf= new Scanner(new FileReader(fin));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int lineNumber=0;
		while (scf.hasNext()){
			
			String line= scf.nextLine();  // MUST BE nexLine() ++
			lineNumber++;
			//System.out.println("Processing line "+lineNumber);
			// save line
			lines.add(line);
			
			// split words
			line=line.toLowerCase();
			String[] words=line.split("[ \\s\\t,.:;«»?!_><)(-]");
			
			for (String word: words){
				if (!wordsMap.containsKey(word)){
					
					// create new List
					List<Integer> nlist= new ArrayList<>();
					nlist.add(lineNumber-1);  // as it starts in 0
					
					//  add to Map
					wordsMap.put(word, nlist);
					
				}
				else{
					// get List
					List<Integer> list= wordsMap.get(word);
					list.add(lineNumber-1);
				}
		
					
			}
		}
		
		
		
	}

}
