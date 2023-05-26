package at18mayFicheiros2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
//import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * leitura de informação da avaliação uma turma 
 * @author AJST
 *
 */
public class Exemplo2PrintWriter {

	public static void main(String[] args) {

		//  ler de CSV para Map
		String fileName="turma.csv";
		
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
		
		//  NEW - save in file  =========================================
		String outputFile="notasFinais.txt";
		File fo=new File(outputFile);
		
		if (fo.exists()){
			System.out.println("Attention! "+fo.getAbsolutePath()+" already exists!");
			System.exit(-3);
		}
			
		PrintWriter pw=null;
		try {
			//pw=new PrintWriter(fo);
			// alternative
			pw=new PrintWriter(new BufferedWriter(new FileWriter(fo)));
		} catch (FileNotFoundException e){
			System.out.println("File not found");
			e.printStackTrace();
			System.exit(-4);
		}
		catch (IOException e) {
			System.out.println("IO problems");
			e.printStackTrace();
			System.exit(-4);
		}
		
		
		//  same code as the one for System.out  only changing System.out to pw
		pw.printf("%-20s", "NAME");
		pw.printf(" %5s %5s %5s %5s", "ATP1", "ATP2","AC","EP");
		pw.printf(" %5s\n", "FINAL");
		
		for (String name:classificacoes.keySet()){
			Double[] cls=classificacoes.get(name);
			pw.printf("%-20s", name);
			for(Double c:cls)
				pw.printf(" %5.1f", c);
			
			pw.printf(" %5d",notaFinal(cls));
			
			pw.println();
			
		}
		
		pw.close();

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
	private static Map<String, Double[]>  readFromFile(File f) throws FileNotFoundException{
		
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
