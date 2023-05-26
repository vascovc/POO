package at30marchComparable;

public abstract class Figura 
               implements Comparable<Figura>{
	private Ponto centro;
	private String id;
	private static int count = 0;
	
	/**
	 * 
	 * @param centro
	 */
	public Figura(Ponto centro) {
		this.centro = centro;
		this.id = "F" + count;
		count++;
	}
	
	@Override
	public String toString() {
		return "[centro=" + centro + ", id=" + id + "]";
	}

	public Ponto getCentro() {
		return centro;
	}

	public void setCentro(Ponto centro) {
		this.centro = centro;
	}
	
	//  ABSTRACT
	public abstract double area();
	
	public abstract double perimetro();

	//  dos slides
	/**
	 * da Interface Comparable
	 */
	 public int compareTo(Figura other)  {
			double res = area() - other.area();
			
			if (res > 0) return 1;
			else if (res < 0) return -1;
				else return 0;
		}
	 

}
