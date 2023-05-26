package at30marchComparable;

public class Quadrado extends Retangulo {

	public Quadrado(Ponto centro, double l){
		super(centro, l, l);
	}
	
	// outro construtor
	public Quadrado(int centroX, int centroY, double l){
		super(new Ponto(centroX, centroY), l, l);
	}
	
	
	public void setL(double l){
		super.setA(l);
		super.setC(l);
	}
	
	public double get(){
		return super.getA();
	}

	@Override
	public String toString() {
		return "Quadrado [" + super.toString() + "]";
	}
	
	
}
