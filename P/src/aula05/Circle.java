package aula05;

public class Circle {
	private double x,y,r;
	
	public Circle(double x,double y, double r) {
		this.x = x;
		this.y = y;
		this.r = r;
	}
	
	public void setX(double x) {
		this.x = x;
	}
	public void setY(double y) {
		this.y = y;
	}
	public void setRadius(double r) {
		this.r = r;
	}
	
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	public double getRadius() {
		return r;
	}
	
	@Override
	public String toString() {
		return "("+x+","+y+") Radius: "+r;
	}
	public boolean equals(Circle one) {
		if (x == one.x && y == one.y && r == one.r)
			return true;
		else
			return false;
		
	}
	
	public double area() {
		return Math.PI*r*r;
	}
	public double perimeter() {
		return 2*Math.PI*r;
	}
	public boolean intersection(Circle one) {
		double a = Math.sqrt(Math.pow((one.x - x), 2) + Math.pow((one.y - y), 2));
		if(a > one.r+r)
			return false;
		else
			return true;
	}
}
