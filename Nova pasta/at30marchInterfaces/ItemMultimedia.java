package at30marchInterfaces;
/**
 * Abstract class ItemMulti - superclasse de Items Multimedia
 * 
 * @author F. Mário Martins
 * @version 1.0/2005
 */


	public abstract class ItemMultimedia {
		//
		private String titulo;
		private String data;    
		private String obs;    // observações
		
		// construtores
		public ItemMultimedia() {
		  titulo = ""; data = ""; obs = "";
		}
		public ItemMultimedia(String tit, String dat, String com) {
		  titulo = tit; data = dat; obs = com;
		}
		
		
		
		//
		public abstract double duracao();
		
		public String getTitulo() {
			return titulo;
		}
		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}
		public String getData() {
			return data;
		}
		public void setData(String data) {
			this.data = data;
		}
		public String getObs() {
			return obs;
		}
		public void setObs(String obs) {
			this.obs = obs;
		}
		
		@Override
		public String toString() {
			return titulo + "(" + data + ")";
		}
		
		
		
		
		
	}


