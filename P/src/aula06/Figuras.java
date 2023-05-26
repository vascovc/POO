package aula06;

public class Figuras {
	String color="";
	public void setColor(String color) {
		this.color = color;
	}
	public String getColorr() {
		return color;
	}
	@Override
	public String toString() {
		return "Color: "+color;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
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
		Figuras other = (Figuras) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		return true;
	}
	
}
