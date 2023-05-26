package aula08;

public class Legume extends AlimentoVegetariano{
	public Legume(String nome, double proteinas,double calorias,double peso) {
		super(nome,proteinas,calorias,peso);
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		return true;
	}

	
	@Override
	public String toString() {
		return "Legume "+super.toString();
	}	
}
