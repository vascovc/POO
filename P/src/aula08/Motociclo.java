package aula08;

public class Motociclo extends Veiculo{
	private String tipo;
	
	public Motociclo(String matricula,String marca,String modelo, double cilindrada, String tipo) {
		super(matricula,marca,modelo,cilindrada);
		this.tipo = tipo;
	}
	public String getTipo() {
		return tipo;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
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
		Motociclo other = (Motociclo) obj;
		if (tipo == null) {
			if (other.tipo != null)
				return false;
		} else if (!tipo.equals(other.tipo))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Motociclo: "+super.toString() + ", Tipo="+tipo;
	}

}
