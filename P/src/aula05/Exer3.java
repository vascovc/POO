package aula05;

import java.util.Scanner;

public class Exer3 {

	public static void main(String[] args) {
		int choice = 1;
		int counter_uti = 0;
		int counter_book = 0;
		Scanner sc = new Scanner(System.in);
		Livro book[] = new Livro[100];
		Utilizador user[] = new Utilizador[100];
		/*
		user[0] = new Utilizador("Catarina Marques", 80232, "MIEGI");
		user[1] = new Utilizador("Alfredo", 97895, "MOG");
		user[2] = new Utilizador("Joao Silva", 97893, "MIEC");
		user[3] = new Utilizador("Andreia Matos", 97746, "LEI");
		
		book[0] = new Livro("Ola");
		book[1] = new Livro("JAva");
		book[2] = new Livro("Calculo");
		*/
		while(choice != 8) {
			System.out.print("1 - inscrever utilizador\r\n" + 
				"2 - remover utilizador\r\n" + 
				"3 - imprimir lista de utilizadores\r\n" + 
				"4 - registar um novo livro\r\n" + 
				"5 - imprimir lista de livros\r\n" + 
				"6 - emprestar\r\n" + 
				"7 - devolver\r\n" + 
				"8 - sair\n\nOpção: ");
			choice = sc.nextInt();

			if (choice == 1) {
				sc.nextLine();
				System.out.print("Nome: ");
				String nome = sc.nextLine();
				System.out.print("Numero mecanográfico: ");
				int num = sc.nextInt();
				System.out.print("Curso: ");
				sc.nextLine();
				String curso = sc.nextLine();
				user[counter_uti] = new Utilizador(nome,num,curso);
				//System.out.println(user[counter_uti]);
				counter_uti++;// assim so se avança na lista quando se escolhe esta opçao
			}
			else if (choice == 2) {
				System.out.print("Numero mecanográfico: ");
				int num = sc.nextInt();
				int counter = 0;// nao encontrando um metodo para obter o indice nao vejo outra forma se nao esta
				while(user[counter].getnMec() != num) {
					counter++;
				}
				System.out.println(user[counter]);
				System.out.println();
				user[counter] = null;
			}	
			else if (choice == 3) {
				for(int i = 0; i<user.length;i++) {
					if(user[i] != null) {
						System.out.println(user[i]);
					}
				}
			}
			else if (choice == 4) {
				sc.nextLine();
				System.out.print("Título: ");
				String t = sc.nextLine();
				book[counter_book] = new Livro(t);
				counter_book++;
			}
			else if (choice == 5) {
				for(int i = 0; i<book.length;i++) {
					if(book[i] != null)
						System.out.println(book[i]);
				}
				System.out.println();
			}
			else if (choice == 6) {
				System.out.print("ID do livro: ");
				int id = sc.nextInt();
				System.out.print("Numero Mecanográfico: ");
				int nm = sc.nextInt();
				int count = 0; //mais  uma vez a ter de usar isto
				while(book[count].getId() != id) {
					count++;
				}
				int counter = 0;
				while(user[counter].getnMec() != nm) {//e aqui outra, são demasiados ciclos
					counter++;
				}
				if (book[count].getTipoEmprestimo() == "CONDICIONAL")
					System.out.println("O livro encontra-se emprestado");
				else {
					if(user[counter].getBook().length() > 9)// como os ids vao de 100 a 199 se forem mais de 3 conjuntos de numeros
						System.out.println("O utilizador tem mais de 3 livros emprestados");
					else {
						book[count].setTipoEmprestimo("CONDICIONAL");
						user[counter].setBook(id);
					}	
				}
			}	
			else if (choice == 7) {
				System.out.print("ID do livro: ");
				int id = sc.nextInt();
				System.out.print("Numero Mecanográfico: ");
				int nm = sc.nextInt();
				int count = 0;
				while(book[count].getId() != id) {// e que usando book.indexOF dá erro e teria que ser com uma expressao lambda ou assim la dentro
					count++;
				}
				int counter = 0;
				while(user[counter].getnMec() != nm) {
					counter++;
				}
				book[count].setTipoEmprestimo("NORMAL");
				user[counter].removeID(id);
			}
		}
		sc.close();
	}
}