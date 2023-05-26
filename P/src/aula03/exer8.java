package aula03;

public class exer8 {
	public static void main(String[]args) {
		double nota;
		double[][] v = new double[2][16];
		System.out.println("NotaT NotaP Pauta");
		for(int i=0;i<16;i++) {
			v[0][i] = generator();
			v[1][i] = generator();
			if (v[0][i] <= 7 || v[1][i] <=7)
				nota = 66;
			else
				nota = Math.round((v[0][i]+v[1][i])/2);
			System.out.printf("%5.1f %5.1f %5.0f\n",v[0][i],v[1][i],nota);
		}
	}
	
	public static double generator() {
		return Math.round( (  Math.random()*(20-0) )*10 )/10.0;
	}
}
