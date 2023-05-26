package at20abrilExceptions1;

public class Exemplo1versao3 {
	 

		public static void main(String[] args) {
			// Questão 1:  qual o output se correr este programa ?
			String str="teste";
			
			try{
				str.toLowerCase();
				int[] nums={1,2,3,4};
			
				for (int i=0; i<=nums.length;i++)
				nums[i]=10;
			}
			catch(ArrayIndexOutOfBoundsException e ){
				System.out.println("Exception catch - Out of bounds");
				System.out.println(e);
			}
			catch (NullPointerException e){
				System.out.println("Null String");
			}
			
			System.out.println("FIM");
		}

	}
