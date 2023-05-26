package at20abrilEnumerado2;


public class Test2 {
	
	 

	public static void main(String[] args) {
		
		Cafe c=Cafe.Curto;
		
		Cafe c2=null;
		System.out.println(c2);
		
		
		System.out.println(c.name());
		System.out.println(c.ordinal());
		
		for (Cafe c3:Cafe.values())
			System.out.println(c3);
		
		
		
		
	}
}
