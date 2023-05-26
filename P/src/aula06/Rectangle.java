package aula06;

class Rectangle extends Figuras{ // de certa forma um rectangulo sao dois triangulos
	private double comprimento,altura;
	
	public Rectangle(double comprimento, double altura) {
		this.comprimento = comprimento;
		this.altura = altura;
	}
	public double getComprimento() {
		return comprimento;
	}
	public double getAltura() {
		return altura;
	}
	
	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	@Override
	public String toString(){
		return super.toString()+" Altura: "+altura+"; Comprimento: "+comprimento;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(altura);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(comprimento);
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
		Rectangle other = (Rectangle) obj;
		if (Double.doubleToLongBits(altura) != Double.doubleToLongBits(other.altura))
			return false;
		if (Double.doubleToLongBits(comprimento) != Double.doubleToLongBits(other.comprimento))
			return false;
		return true;
	}
	public double area(){
		return comprimento*altura;
	}
	public double perimeter() {
		return 2*comprimento +2*altura;
	}
	
}