package at30marchInterfaces;

public class Teste {

	public static void  main (String[] args){
		
		CD queen1 = new CD ("Bohemian Rhapsody","2018","",60,0,0);
		System.out.println(queen1);
		//queen1.print(); // doesn't work
		
		CDRW myRec1 = new CDRW ("POO","2020","",60,0,0);
		CDRW myRec2 = new CDRW ("Algorithms","2020","",60,0,0);
		
		System.out.println(myRec1);
		//Apagavel.print(); 
		myRec2.print();
		
		Hi9 myHi9 = new Hi9("Pessoal","2019","nice!",90,60,2);
		
		ItemMultimedia[] lista=new ItemMultimedia[4];
		lista[0]=queen1;
		lista[1]=myRec1;
		lista[2]=myHi9;
		lista[3]=myRec2;
		
		
		System.out.println("Não Apagáveis");
		
		for (ItemMultimedia item:lista)
			if (! (item instanceof Apagavel))
				System.out.println(item);
		
		
		
		
			
		myHi9.apaga();
		System.out.println("Depois de apagar my Hi9 :");
		for (ItemMultimedia item:lista)
			if (item instanceof Apagavel)
				System.out.println(item);
		
		
		
		
	}
}
