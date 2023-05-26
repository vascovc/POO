package aula06;

public class Bolseiro extends Aluno {
	private double bolsa;
	
	Bolseiro(String iNome, int cc, Data dataNasc, Data dataInsc){
		super(iNome,cc,dataNasc,dataInsc);
	}
	Bolseiro(String iNome, int cc, Data dataNasc){
		super(iNome,cc,dataNasc);
	}
	public void setBolsa(double valor) {
		bolsa=valor;
	}
	public double getBolsa() {
		return bolsa;
	}
	
	@Override
	public String toString() {
		return super.toString()+", Bolsa: " + bolsa;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(bolsa);
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
		Bolseiro other = (Bolseiro) obj;
		if (Double.doubleToLongBits(bolsa) != Double.doubleToLongBits(other.bolsa))
			return false;
		return true;
	}
	
}
