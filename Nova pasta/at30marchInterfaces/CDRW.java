package at30marchInterfaces;

/**
 * Write a description of class CDRW here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CDRW extends CD implements Apagavel {
	
     public CDRW(String titulo, String data, String obs,
					    int min, double ocup, int gravc) {
			super(titulo, data, obs, min, ocup, gravc); 
			
     }
     
     public CDRW clone() {
	        return new CDRW(this.getTitulo(), this.getData(), this.getObs(),
	                       this.getMin(), this.getOcup(), this.getGrava());
	 }
	  public String toString() { return "CDRW " + super.toString(); }

	@Override
	public void apaga() {
		// TODO Auto-generated method stub
		this.mudaOcupa(0.0); // espaço ocupado
		this.mudaGrava(0);   // número de gravações
	}

	
	  
     // implements Apagavel
    // public void apaga() { this.mudaOcupa(0.0); this.mudaGrava(0); }
        
}
