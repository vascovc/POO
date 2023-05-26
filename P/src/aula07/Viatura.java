package aula07;

public class Viatura {
	private char classe;
	private String fuel;
	private boolean disponibilidade;
	private static int counter = 0;// nao pede mas para no menu ver-se qual é
	private int id;
	
	public Viatura(char classe,String fuel,boolean disponibilidade) {
		if(classe >='A' && classe<='Z') 
			this.classe = classe;
		else
			System.out.println("Tipo de carro ilegivel");
			this.classe = '\u0000';
		this.fuel = fuel;
		this.disponibilidade = disponibilidade;
		id = counter++;
		System.out.println(id);
	}
	public Viatura(char classe,String fuel) {
		this(classe,fuel, true);
	}
	
	//apesar de ser possivel um veiculo mudar de tipo de combustivel nao interessa neste caso
	public void setDisponibilidade(boolean disponibilidade) {
		this.disponibilidade = disponibilidade;
	}
	public boolean getDisponibilidade() {
		return disponibilidade;
	}
	public char getClasse() {
		return classe;
	}
	public String getFuel() {
		return fuel;
	}
	public int getID() {
		return id;
	}
	@Override
	public String toString() {
		return "Viatura: " + classe + ", Fuel: " + fuel + ", Disponibilidade: " + disponibilidade;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + classe;
		result = prime * result + (disponibilidade ? 1231 : 1237);
		result = prime * result + ((fuel == null) ? 0 : fuel.hashCode());
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
		Viatura other = (Viatura) obj;
		if (classe != other.classe)
			return false;
		if (disponibilidade != other.disponibilidade)
			return false;
		if (fuel == null) {
			if (other.fuel != null)
				return false;
		} else if (!fuel.equals(other.fuel))
			return false;
		return true;
	}
}
