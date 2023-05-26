package at20abrilExceptions1;

public class Exemplo1versao2 {

	public static void main(String[] args) {
		// Questão 1:  qual o output se correr este programa ?
		String str="abc";
		
		try{
			str.toLowerCase();
			int[] nums={1,2,3,4};
		
			//IF () ...
	
			for (int i=0; i<nums.length;i++)
				nums[i]=10;
			
			//throw new NullPointerException();
					
			throw new IllegalArgumentException();		
		}
		//catch(Exception e ){
		catch(ArrayIndexOutOfBoundsException e ){
			System.out.println("Exception catch - Out of bounds");
			System.out.println(e);
		}
		catch (NullPointerException e){
			System.out.println("Null String");
		}
		catch(Exception e ){
			//  Má prática ....
			System.out.println(e);
			System.out.println("Houston we have a problem");
		}
		finally{
			System.out.println("FIM");
		}
	}

}
