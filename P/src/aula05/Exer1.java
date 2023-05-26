package aula05;

public class Exer1 {
	public static void main(String[] args) {
		Ponto p1 = new Ponto(5,9);
		Ponto p2 = new Ponto(1,1);
		System.out.println(p1 + " "+p2);
		System.out.println("S�o iguais: "+p1.equals(p2));
		p2.setX(p1.getY());
		p2.setY(p1.getX());
		System.out.println(p1 + " "+p2);
		
		System.out.println();
		
		Circle c1 = new Circle(4,5,7);
		Circle c2 = new Circle(1,2,3);
		System.out.println("Circulo 1: "+c1 + "\nCirculo 2: "+c2);
		System.out.println("Os circulos interesetam-se: "+c1.intersection(c2));
		c2.setX(c1.getX());
		c2.setY(c1.getY());
		c2.setRadius(c1.getRadius());
		System.out.printf("C1: �rea: %.3f Per�metro: %.3f\n",+c1.area(),c1.perimeter());
		System.out.println("Circulo 1: "+c1 + "\nCirculo 2: "+c2);
		System.out.println("Os c�rculos 1 e 2 s�o iguais: "+c1.equals(c2));
		
		System.out.println();
		
		Triangle t1 = new Triangle(5,6,7);
		Triangle t2 = new Triangle(4,3,2);
		System.out.println("Triangulo 1: "+t1+"\nTriangulo 2: "+t2);
		t2.setLado1(t1.getLado3());
		t2.setLado2(t1.getLado2());
		t2.setLado3(t1.getLado1());
		System.out.printf("T1: �rea: %.3f Per�metro: %.3f\n",+t1.area(),t1.perimeter());
		System.out.println("Triangulo 1: "+t1 + "\nTriangulo 2: "+t2);
		System.out.println("Os triangulos 1 e 2 s�o iguais: "+t1.equals(t2));
		
		System.out.println();
		
		Rectangle r1 = new Rectangle(4,3);
		Rectangle r2 = new Rectangle(1,2);
		System.out.println("Rect�ngulo 1: "+r1+ " Rect�ngulo 2: "+r2);
		r2.setComprimento(r1.getAltura());
		r2.setAltura(r1.getComprimento());
		System.out.printf("R1: �rea: %.3f Per�metro: %.3f\n",r1.area(),r1.perimeter());
		System.out.println("Rect�ngulo 1: "+r1+ " Rect�ngulo 2: "+r2);
		System.out.println("Os rect�ngulos 1 e 2 s�o iguais: "+r1.equals(r2));
	}

}