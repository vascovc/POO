package aula08;

public class Pesado_Mercadorias extends Pesado{
	private double carga_max;
	
	public Pesado_Mercadorias(String matricula, String marca, String modelo, double cilindrada, int numero_quadro,
			double peso,double carga_max) {
		super(matricula, marca, modelo, cilindrada, numero_quadro, peso);
		this.carga_max = carga_max;
	}
	
	public double getCarga_max() {
		return carga_max;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(carga_max);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pesado_Mercadorias other = (Pesado_Mercadorias) obj;
		if (Double.doubleToLongBits(carga_max) != Double.doubleToLongBits(other.carga_max))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Pesado Mercadorias: "+super.toString()+", Carga maxima=" + carga_max;
	}
	
}
