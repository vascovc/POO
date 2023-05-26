package at30marchInterfaces;
//import static java.lang.System.out;
 
public interface Apagavel {
	
	public void apaga();	
	
	
	// AT  default method
	default public void print(){
		System.out.println("Eu sou Apagavel");
		//out.println("XXXX");
	}

}
