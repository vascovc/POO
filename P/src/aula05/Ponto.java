package aula05;

public class Ponto{
	private double x;
	private double y;
	
	public Ponto(double x, double y) {
		this.x=x;
		this.y=y;
	}
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	
	public void setX(double x){
		this.x = x;
	}
	public void setY(double y) {
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "Ponto: ("+x+","+y+")";
	}
	public boolean equals(Ponto one) {
		if (x == one.x && y == one.y)
			return true;
		else
			return false;
		
	}
}
