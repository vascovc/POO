package at30marchInterfaces;

/**
 * Write a description of class CD here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CD extends ItemMultimedia {
		//
		private int minutos;
		private double ocupacao;    // ocupado em percentagem
		private int gravacoes;      // núm de gravações
		
		// construtores
		public CD(String titulo, String data, String obs,
					    int min, double ocup, int gravc) {
			super(titulo, data, obs); // super ??
			minutos = min; ocupacao = ocup; gravacoes = gravc;
        }
		//
		public int getMin() { return minutos; }
		public double getOcup() { return ocupacao; }
		public int getGrava() { return gravacoes; }

		public double duracao() {
		    return minutos*(ocupacao/100);
	    }
	    @Override
		public String toString() {
			return super.toString() + "[minutos=" + minutos + ", ocupacao=" + ocupacao + ", gravacoes=" + gravacoes + "]";
		}
	    
 	    
	    
	    public void mudaOcupa(double ocup) { ocupacao = ocup; }
	    public void mudaGrava(int maisGravs) { gravacoes += maisGravs; }

}

	

