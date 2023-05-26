package aula07;

public class MovableObject {
	private int x,y;
	private double dist=0;
	
	public MovableObject(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void move(int newX, int newY) {
		dist += Math.sqrt( Math.pow( (x-newX) ,2) + Math.pow( (y-newY), 2) );
		x = newX;
		y = newY;
	}
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public double getDist() {
		return ((int)(dist*1000))/1000;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(dist);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + x;
		result = prime * result + y;
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
		MovableObject other = (MovableObject) obj;
		if (Double.doubleToLongBits(dist) != Double.doubleToLongBits(other.dist))
			return false;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "(" + x + ", " + y + "), Distãncia: " + ((int)(dist*1000))/1000;
	}
	
}
