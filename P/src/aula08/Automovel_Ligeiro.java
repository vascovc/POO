package aula08;

public class Automovel_Ligeiro extends Automovel{
	private double capacidade_bagageira;
	
	public Automovel_Ligeiro(String matricula,String marca,String modelo, double cilindrada, int numero_quadro,double capacidade_bagageira) {
		super(matricula,marca,modelo,cilindrada,numero_quadro);
		this.capacidade_bagageira=capacidade_bagageira;
	
	}
	
	public double getCapacidade_bagageira() {
		return capacidade_bagageira;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(capacidade_bagageira);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Automovel_Ligeiro other = (Automovel_Ligeiro) obj;
		if (Double.doubleToLongBits(capacidade_bagageira) != Double.doubleToLongBits(other.capacidade_bagageira))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Automovel Ligeiro: "+super.toString()+", Capacidade bagageira="+ capacidade_bagageira;
	}
}
