package aula08;

public abstract class Automovel extends Veiculo{
	private int numero_quadro;
	
	public Automovel(String matricula,String marca,String modelo, double cilindrada, int numero_quadro) {
		super(matricula,marca,modelo,cilindrada);
		this.numero_quadro = numero_quadro;
	}
	
	public int getNumero_quadro() {
		return numero_quadro;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numero_quadro;
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
		Automovel other = (Automovel) obj;
		if (numero_quadro != other.numero_quadro)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return super.toString()+", Numero quadro: " + numero_quadro;
	}
	
}
