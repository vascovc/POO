package aula08;

public class Pesado_Passageiro extends Pesado{
	private int numero_passageiros;
	
	public Pesado_Passageiro(String matricula, String marca, String modelo, double cilindrada, int numero_quadro,
			double peso,int numero_passageiros) {
		super(matricula, marca, modelo, cilindrada, numero_quadro, peso);
		this.numero_passageiros=numero_passageiros;
	}
	
	public int getNumero_passageiros() {
		return numero_passageiros;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + numero_passageiros;
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
		Pesado_Passageiro other = (Pesado_Passageiro) obj;
		if (numero_passageiros != other.numero_passageiros)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Pesado Passageiro: "+super.toString()+", Numero passageiros=" + numero_passageiros;
	}
	
}
