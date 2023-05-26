package aula05;

class Rectangle{
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
		return "Altura: "+altura+"; Comprimento: "+comprimento;
	}
	public boolean equals(Rectangle one) {
		if ((comprimento == one.comprimento && altura == one.altura) ||
		    (altura == one.comprimento && comprimento == one.altura))
			return true;
		else
			return false;
		
	}
	//equals esta mal
	public double area(){
		return comprimento*altura;
	}
	public double perimeter() {
		return 2*comprimento +2*altura;
	}
	
}