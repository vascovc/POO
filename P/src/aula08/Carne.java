package aula08;

public class Carne extends Alimento{
	private VariedadeCarne v;
	
	public Carne(VariedadeCarne v, double proteinas,double calorias,double peso) {
		super(proteinas,calorias,peso);
		this.v = v;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((v == null) ? 0 : v.hashCode());
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
		Carne other = (Carne) obj;
		if (v != other.v)
			return false;
		return true;
	}

	
	@Override
	public String toString() {
		return "Carne " + v+super.toString();
	}
	
	
	
}
