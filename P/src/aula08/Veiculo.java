package aula08;

public abstract class Veiculo implements KmPercorridosInterface{
	private String matricula,marca,modelo;
	private double cilindrada;
	private int trajeto,total=0; 
	
	public Veiculo(String matricula,String marca,String modelo, double cilindrada) {
		this.matricula=matricula;
		this.marca=marca;
		this.modelo=modelo;
		this.cilindrada=cilindrada;
	}
	public String getMatricula() {
		return matricula;
	}
	public String getMarca() {
		return marca;
	}
	public String getModelo() {
		return modelo;
	}
	public double getCilindrada() {
		return cilindrada;
	}
	
	public void trajeto(int quilometros) {
		trajeto = quilometros;
		total += quilometros;
	}
	public int ultimoTrajeto() {
		return trajeto;
	}
	public int distanciaTotal() {
		return total;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(cilindrada);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((marca == null) ? 0 : marca.hashCode());
		result = prime * result + ((matricula == null) ? 0 : matricula.hashCode());
		result = prime * result + ((modelo == null) ? 0 : modelo.hashCode());
		result = prime * result + total;
		result = prime * result + trajeto;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Veiculo other = (Veiculo) obj;
		if (Double.doubleToLongBits(cilindrada) != Double.doubleToLongBits(other.cilindrada))
			return false;
		if (marca == null) {
			if (other.marca != null)
				return false;
		} else if (!marca.equals(other.marca))
			return false;
		if (matricula == null) {
			if (other.matricula != null)
				return false;
		} else if (!matricula.equals(other.matricula))
			return false;
		if (modelo == null) {
			if (other.modelo != null)
				return false;
		} else if (!modelo.equals(other.modelo))
			return false;
		if (total != other.total)
			return false;
		if (trajeto != other.trajeto)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return matricula + ", Marca=" + marca + ", Modelo=" + modelo + ", Cilindrada="
				+ cilindrada + ", Distancia total=" + total;
	}
	
}
