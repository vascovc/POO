package aula06;

public class Triangle extends Figuras{//se bem que tambem dava para fazer ao contrario pois este tem mais um lado e era so acrescentar
	// mas os nomes depois nao fariam grande sentido e acabava por ter de se voltar a escrever código
	private double lado1,lado2,lado3;
	public Triangle(double lado1,double lado2,double lado3) {
		this.lado1=lado1;
		this.lado2=lado2;
		this.lado3=lado3;
	}
	
	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}
	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}
	public void setLado3(double lado3) {
		this.lado3 = lado3;
	}
	
	public double getLado1() {
		return lado1;
	}	
	public double getLado2() {
		return lado2;
	}
	public double getLado3() {
		return lado3;
	}
	
	@Override
	public String toString() {
		return "Lado1: "+lado1+"; Lado2: "+lado2+"; Lado3: "+lado3;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(lado1);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(lado2);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(lado3);
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
		Triangle other = (Triangle) obj;
		if (Double.doubleToLongBits(lado1) != Double.doubleToLongBits(other.lado1))
			return false;
		if (Double.doubleToLongBits(lado2) != Double.doubleToLongBits(other.lado2))
			return false;
		if (Double.doubleToLongBits(lado3) != Double.doubleToLongBits(other.lado3))
			return false;
		return true;
	}

	public double perimeter() {
		return lado1+lado2+lado3;
	}
	public double area() {
		double p = (lado1+lado2+lado3)/2;
		return Math.sqrt(p*(p-lado1)*(p-lado2)*(p-lado3));
		//Fórmula de Heron
	}

}