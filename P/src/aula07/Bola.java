package aula07;

public class Bola extends MovableObject{
	private String cor;
	
	public Bola(String cor, int x, int y) {
		super(x,y);
		this.cor = cor;
	}
	
	public String getCor() {
		return cor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((cor == null) ? 0 : cor.hashCode());
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
		Bola other = (Bola) obj;
		if (cor == null) {
			if (other.cor != null)
				return false;
		} else if (!cor.equals(other.cor))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Bola - Cor: " + cor + super.toString();
	}
	
}
