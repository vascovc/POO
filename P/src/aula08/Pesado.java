package aula08;

public abstract class Pesado extends Automovel{
	private double peso;
	public Pesado(String matricula, String marca, String modelo, double cilindrada, int numero_quadro,double peso) {
		super(matricula, marca, modelo, cilindrada, numero_quadro);
		this.peso=peso;
	}
	public double getPeso() {
		return peso;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(peso);
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
		Pesado other = (Pesado) obj;
		if (Double.doubleToLongBits(peso) != Double.doubleToLongBits(other.peso))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return super.toString() + ", Peso="+peso;
	}
	
}
