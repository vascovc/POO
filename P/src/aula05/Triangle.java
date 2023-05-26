package aula05;

public class Triangle{
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
	public boolean equals(Triangle one) {
		if (lado1 == one.lado1 && lado2 == one.lado2 && lado3 == one.lado3)
			return true;//supondo que um triangulo para ser igual os seus lados tem que o ser por essa ordem
		else
			return false;
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