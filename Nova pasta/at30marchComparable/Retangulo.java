package at30marchComparable;

public class Retangulo extends Figura implements Desenhavel{
	private double l1, l2;
	
	public Retangulo(Ponto centro, double l1, double l2){
		super(centro);
		this.l2 = l2;
		this.l1 = l1;
	}

	public Retangulo(int centroX, int centroY, double l1, double l2){
		super(new Ponto(centroX, centroY));
		this.l2 = l2;
		this.l1 = l1;
	}

	
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return this.l1 * this.l2;
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return 2 * this.l1 + 2 * this.l2;
	}

	public double getC() {
		return l1;
	}

	public void setC(double l1) {
		this.l1 = l1;
	}

	public double getA() {
		return l2;
	}

	public void setA(double l2) {
		this.l2 = l2;
	}

	@Override
	public String toString() {
		return "Retangulo [lado1=" + l1 + ", lado2=" + l2 + ", " + super.toString() + "]";
	}

	@Override
	public void desenha() {
		// TODO Auto-generated method stub
		for(int i = 0 ; i < this.l1 ; i++)
			System.out.print(Desenhavel.simbolo);

		System.out.println();
		for(int j = 2 ; j < this.l2 ; j++){
			System.out.print(Desenhavel.simbolo);
			for(int i = 2 ; i < this.l1 ; i++)
				System.out.print(" ");
			System.out.print(Desenhavel.simbolo);
			System.out.println();
		}

		for(int i = 0 ; i < this.l1 ; i++)
			System.out.print(Desenhavel.simbolo);
		
		System.out.println();
	}
}
