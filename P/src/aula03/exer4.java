package aula03;

import java.util.Scanner;

public class exer4 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Número: ");
		float a = sc.nextFloat();
		int count = 1;
		float max=a; float min=a; float med=a;
		while(true) {
			System.out.print("Número: ");
			float b = sc.nextFloat();
			if (a == b)
				break;
			if (b>max)
				max = b;
			if (b<min)
				min = b;
			med += b;
			++count;
		}
		sc.close();
		med = med/count;
		System.out.println("O valor máximo foi "+max+" o valor minimo foi "+min+" e a média foi de "+med+" e foram lidos ao todo "+count+" numeros");
	}
}
