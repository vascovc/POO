package aula08;

public class Taxi extends Automovel_Ligeiro{
	private int numero_licenca;

	public Taxi(String matricula, String marca, String modelo, double cilindrada, int numero_quadro,
			double capacidade_bagageira,int numero_licenca) {
		super(matricula, marca, modelo, cilindrada, numero_quadro, capacidade_bagageira);
		this.numero_licenca=numero_licenca;
	}
	
	public int getNumero_licenca() {
		return numero_licenca;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + numero_licenca;
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
		Taxi other = (Taxi) obj;
		if (numero_licenca != other.numero_licenca)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Taxi: "+ getMatricula() + ", Marca="+ getMarca() + ", Modelo=" + getModelo() + ", Cilindrada=" + getCilindrada()+", Distancia total="+distanciaTotal()+", Numero quadro=" + getNumero_quadro()+", Numero licenca=" + numero_licenca;
	}


	
}
