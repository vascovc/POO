package aula06;

public class Circle extends Ponto{
	private double r;
	
	public Circle(double x,double y, double r) {
		super(x,y);
		this.r = r;
	}
	
	public void setRadius(double r) {
		this.r = r;
	}

	public double getRadius() {
		return r;
	}
	
	public double area() {
		return Math.PI*r*r;
	}
	public double perimeter() {
		return 2*Math.PI*r;
	}
	public boolean intersection(Circle one) {
		double a = Math.sqrt(Math.pow((one.getX() - super.getX()), 2) + Math.pow((one.getY() - super.getY()), 2));
		if(a > one.r+r)
			return false;
		else
			return true;
	}
	@Override
	public String toString() {
		return super.toString()+" Radius: "+r;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(r);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Circle other = (Circle) obj;
		if (Double.doubleToLongBits(r) != Double.doubleToLongBits(other.r))
			return false;
		return true;
	}
	
}
