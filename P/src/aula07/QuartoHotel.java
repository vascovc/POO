package aula07;

public class QuartoHotel extends Alojamento{
	private String tipo;
	
	public QuartoHotel(String code, String nome, String local, double price, boolean disponibilidade, String tipo) {
		super(code,nome,local,price,disponibilidade);
		if(tipo != "single" || tipo != "double" || tipo != "twin" || tipo != "triple")
			System.out.println("Tipo de quarto inválido");
		else
			this.tipo = tipo;
	}
	public QuartoHotel(String code, String nome, String local, double price, String tipo) {
		this(code,nome,local,price,true,tipo);
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
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
		QuartoHotel other = (QuartoHotel) obj;
		if (tipo == null) {
			if (other.tipo != null)
				return false;
		} else if (!tipo.equals(other.tipo))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return super.toString()+", Quarto de Hotel, Tipo: " + tipo;
	}
	
}
