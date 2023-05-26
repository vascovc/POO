package at30marchInterfaces;

/**
 * Write a description of class DVDRW here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DVDRW extends DVD implements Apagavel {
     
	public DVDRW(String titulo, String data, String obs,
					    int min, double ocup, int gravc) {
			super(titulo, data, obs, min, ocup, gravc); 
			
     }
     
     public DVDRW clone() {
	        return new DVDRW(this.getTitulo(), this.getData(), this.getObs(),
	                       this.getMin(), this.getOcup(), this.getGrava());
	 }
	 
	  public String toString() { return this.getTitulo(); }

	@Override
	public void apaga() {
		// TODO Auto-generated method stub
		 this.mudaOcupa(0.0); 
		 this.mudaGrava(0);
	}

     // implements Apagavel
     //public void apaga() { this.mudaOcupa(0.0); this.mudaGrava(0); }
        
}
