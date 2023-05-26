package aula07;

public class Apartamento extends Alojamento {
	private int number;
	
	public Apartamento(String code, String nome, String local, double price, boolean disponibilidade, int number) {
		super(code,nome,local,price,disponibilidade);
		this.number = number;
	}
	public Apartamento(String code, String nome, String local, double price, int number) {
		this(code,nome,local,price,true,number);
	}
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	@Override
	public String toString() {
		return super.toString() +", Apartamento, Número Quartos: " + number;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + number;
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
		Apartamento other = (Apartamento) obj;
		if (number != other.number)
			return false;
		return true;
	}
	
}
