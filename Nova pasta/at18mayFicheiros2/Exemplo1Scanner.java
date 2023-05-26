package at18mayFicheiros2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * leitura de informação da avaliação uma turma 
 * @author AJST
 *
 */
public class Exemplo1Scanner {

	public static void main(String[] args) {

		//  ler de CSV para Map
		String fileName="turma.csv";
		
		//  File 
		File f=new File(fileName);
		
		
		if (!f.exists()){
			System.out.println(f.getAbsolutePath()+" doesn't exist");
			System.exit(-1);
		}
			
		if (!f.canRead()){
			System.out.println(f.getAbsolutePath()+" no readable.");
			System.exit(-2);
		}
		
		Map<String, Double[]> classificacoes=null;
		
	    try {
			classificacoes=readFromFile(f);
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
			e.printStackTrace();
		}
		
		// mostrar MAp
		//System.out.println(classificacoes);
		
		//  mostrar aluno e nota final
		System.out.printf("%-20s", "NAME");
		System.out.printf(" %5s %5s %5s %5s", "ATP1", "ATP2","AC","EP");
		System.out.printf(" %5s\n", "FINAL");
		
		for (String name:classificacoes.keySet()){
			Double[] cls=classificacoes.get(name);
			System.out.printf("%-20s", name);
			for(Double c:cls)
				System.out.printf(" %5.1f", c);
			
			System.out.printf(" %5d",notaFinal(cls));
			
			System.out.println();
			
		}
		

	}

	/**
	 * 
	 * @param cls
	 * @return
	 */
	private static int notaFinal(Double[] cls) {
		
		double r=cls[0]*0.15 + cls[1]*0.15 + cls[2]*0.2 + cls[3]*0.5; 
		r=Math.round(r);
		return (int) r;
	}

	/**
	 * 
	 * @param f
	 * @return
	 * @throws FileNotFoundException
	 */
	private static Map<String, Double[]>  
	         readFromFile(File f) throws FileNotFoundException{
		
		// Map
		Map<String,Double[]> classific =new TreeMap<>();
		
		// alternativa
		//Map<String,List<Double>> classific =new TreeMap<>();
		
		
		// criar Scanner
		Scanner scf=new Scanner(f);
		
		//  skip first row
		scf.nextLine(); 
		while (scf.hasNextLine())  {
			
			String line=scf.nextLine(); // easier to process line by line
			// debug
			System.out.println(line);
			
			// to solve use of , in doubles
			line=line.replace(',', '.');
			String[] columns=line.split(";");
			System.out.println(columns[0]+" : "+columns[1]);
			
			if (columns.length<5){
				System.out.println("\tline doesn't have enough columns");
				continue;
			}
			else {
				Double[] notas=new Double[4];
				
				String nomeAluno=columns[0];
				notas[0]=Double.parseDouble(columns[1]);
				notas[1]=Double.parseDouble(columns[2]);
				notas[2]=Double.parseDouble(columns[3]);
				notas[3]=Double.parseDouble(columns[4]);
				
				classific.putIfAbsent(nomeAluno, notas);
			}
				
		}
		scf.close();
		return classific;
	}
}
