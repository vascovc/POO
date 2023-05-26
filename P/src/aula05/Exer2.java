package aula05;

import java.util.ArrayList;

public class Exer2 {

	public static void main(String[] args) {
		Livro catalogo[] = new Livro[10];
		catalogo[0] = new Livro("Java 8", "CONDICIONAL");
		catalogo[1] = new Livro("POO em Java 8");
		catalogo[2] = new Livro("Java para tot�s", "NORMAL");
		System.out.println("ID = " + catalogo[1].getId() + ", "
							+ catalogo[1].getTitulo());
		catalogo[2].setTipoEmprestimo("CONDICIONAL");
		for (int i = 0; i < catalogo.length; i++) { // usando o indice do vector
			if (catalogo[i] != null) // porque o vector catalogo n�o est� cheio
				System.out.println(catalogo[i]);
		}
		// Para o conjunto de utilizadores usamos a classe java.util.ArrayList
		// � uma implementa��o de um vetor com tamanho vari�vel
		ArrayList<Utilizador> alunos = new ArrayList<>();
		alunos.add(new Utilizador("Catarina Marques", 80232, "MIEGI"));
		alunos.add(new Utilizador("Joao Silva", 90123, "LEI"));
		alunos.get(1).setnMec(80123);
		for (Utilizador u : alunos) { // usando foreach
			System.out.println(u);
		}

	}

}
