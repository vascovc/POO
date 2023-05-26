package at20abrilExceptions1;

import java.util.Scanner;

import at20abrilEnumerado2.Mes;

public class Exemplo3 {

	private static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
	
		int r=lerMes();
		System.out.println("Mes= "+r);
		
		r=lerMes2();
		System.out.println("Mes= "+r);
		
		Mes r2=lerMes3();
		System.out.println("Mes= "+r2);
		
	
		System.out.println("FIM");
	}
		
	public static int lerMes()
	{
	
		System.out.print("Qual o mês ?");	
		
		int m=sc.nextInt();     
		//  o que acontece se escrever janeiro?
		
		return m;
	}
	
	public static int lerMes2(){	
		int m=0;
		boolean valido=false;
	
		
		do {
			System.out.print("Qual o mês ?");	
			
			String str=sc.next();
			try{
				m=Integer.parseInt(str); 
				valido=true;
			} catch(NumberFormatException excecao){
			System.out.println("Tem de escrever um número inteiro");
			}
		}
		while (!valido);
		
		return m;
		
		}
	

///  com enumerados 
public static Mes lerMes3(){	
	Mes m=null;
	boolean valido=false;

	
	do {
		System.out.print("Qual o mês ?");	
		
		String str=sc.next();
		
		try{
			m=Mes.valueOf(str); 
			valido=true;
		} catch(IllegalArgumentException excecao){
			System.out.println("Mês inválido");
			System.out.println(excecao);
		}
	}
	while (!valido);
	
	return m;
	
	}
}

