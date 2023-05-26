package at20abrilExceptions1;

import java.io.FileNotFoundException;
import java.util.Random;

public class Exemplo2 {

	public static void main (String[] args){
		
		//  ARRAY DE INTEIROS
		int[] nums=new int[10];
	
		try{
			System.out.println("Antes de inicializar() ");
			inicializar(nums);
			System.out.println("Depois de inicializar() ");
			
		} catch (ArrayIndexOutOfBoundsException e){
			System.out.println(e);
			//System.out.println(e.getMessage());
			//System.out.println(e.getStackTrace().toString());
			//System.out.println(e.getLocalizedMessage());
		}
	}
	
	
	public static void inicializar(int[] nums){
		inicializar2(nums);
	}
	/**
	 * 
	 * @param nums
	 */
	public static void inicializar2(int[] nums) { // throws FileNotFoundException {
	
		System.out.println("\tInício de inicializar();");
		
		Random r=new Random();
		//throw new FileNotFoundException();
		
		System.out.println("\t\tAntes do ciclo for(...) ");
		
		for (int i=0;i<=nums.length;i++)
			nums[i]=r.nextInt(100);
		
		System.out.println("\t\tDepois do ciclo for(...) ");
		
		System.out.println("\tFIM de inicializar();");
		
	}
	
}
