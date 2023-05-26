package aula07;

import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		int choice = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Olá, bem vindo\nNome da agência: ");
		String nome = sc.nextLine();
		System.out.print("Endereço da agência: ");
		String end = sc.nextLine();
		
		Agencia ag = new Agencia(nome,end);
		
		while(choice != 88) {
			System.out.print("1 - Adicionar Apartamento\n"
					+ "2 - Adicionar Quarto Hotel\n"
					+ "3 - Adicionar Viatura\n"
					+ "4 - Alojamento Check-in\n"
					+ "5 - Alojamento Check-out\n"
					+ "6 - Viatura Levantar\n"
					+ "7 - Viatura Entregar\n"
					+ "8 - Alojamento Rating\n"
					+ "9 - Alojamento mudar preço\n"
					+ "10 - Alojamento Endereço e "
					+ "00 - Imprimir tudo\n"
					+ "88 - Sair\n"
					+ "Opção: ");
			choice = sc.nextInt();
			sc.nextLine();
			
			if(choice == 1) {
				System.out.print("Código: ");
				String code = sc.next();
				System.out.print("Nome: ");
				String name = sc.next();
				System.out.print("Local: ");
				String local = sc.next();
				System.out.print("Price: ");
				double price = sc.nextDouble();
				sc.nextLine();
				System.out.print("Número de quartos: ");
				int num = sc.nextInt();
				sc.nextLine();
				Alojamento apart = new Apartamento(code,name,local,price,num);
				ag.addAloj(apart);
			}
			else if(choice == 2) {				
				System.out.print("Código: ");
				String code = sc.nextLine();
				System.out.print("Nome: ");
				String name = sc.nextLine();
				System.out.print("Local: ");
				String local = sc.nextLine();
				System.out.print("Price: ");
				double price = sc.nextDouble();
				sc.nextLine();
				String tipo;
				do {
					System.out.print("Tipo de quarto: ");
					tipo = sc.nextLine();
				}while(tipo != "single" || tipo != "double" || tipo != "twin" || tipo != "triple");
				
				Alojamento quarto = new QuartoHotel(code,name,local,price,tipo);
				ag.addAloj(quarto);
			}
			else if(choice == 3) {
				char classe;String fuel;
				do {
					System.out.print("Classe: ");
					classe = sc.nextLine().charAt(0);
				}while(classe >='A' && classe<='Z');
				do {
					System.out.print("Tipo combustivel: ");
					fuel = sc.nextLine();
				}while(fuel != "gasolina" || fuel != "diesel");
				Viatura v = new Viatura(classe,fuel);
				ag.addViatura(v);
			}
			else if(choice == 4) { //Alojamento Check-in
				System.out.print("Código: ");
				String code = sc.nextLine();
				for(Alojamento a: ag.getAlojamento()) {
					if (a.getCode() == code) {
						if(a.getDisponibilidade())//se estiver disponivel muda-se
							a.setDisponibilidade(false);
						else
							System.out.println("Ocupado");
					}
				}
			}
			else if(choice == 5) {//Alojamento Check-out
				System.out.print("Código: ");
				String code = sc.nextLine();
				for(Alojamento a: ag.getAlojamento()) {
					if (a.getCode() == code)
						a.setDisponibilidade(true);
				}
			}
			else if(choice == 6) {//viatura levantar
				System.out.print("Número: ");
				int num = sc.nextInt();
				sc.nextLine();
				for(Viatura v:ag.getViatura()) {
					if(v.getID() == num) {
						if(v.getDisponibilidade())
							v.setDisponibilidade(false);
						else
							System.out.println("Viatura emprestada");
					} 
				}
			}
			else if(choice == 7) {//viatura entregar
				System.out.print("Número: ");
				int num = sc.nextInt();
				sc.nextLine();
				for(Viatura v:ag.getViatura()) {
					if(v.getID() == num)
						v.setDisponibilidade(true);
				}
			}
			else if(choice == 8) {//adicionar uma avaliação
				System.out.print("Código: ");
				String code = sc.nextLine();
				System.out.print("Rating: ");
				double rat = sc.nextDouble();
				sc.nextLine();
				for(Alojamento a: ag.getAlojamento()) {
					if (a.getCode() == code) {
						a.setRating(rat);
						System.out.println(a.getRating());
					}
				}
			}
			else if(choice == 9) {//mudar precos
				System.out.print("Código: ");
				String code = sc.nextLine();
				System.out.print("Preço: ");
				double valor = sc.nextDouble();
				sc.nextLine();
				for(Alojamento a: ag.getAlojamento()) {
					if (a.getCode() == code) {
						a.setPrice(valor);
					}
				}
			}
			else if(choice == 0){//imprimir tudo
				System.out.println(ag);
			}
		}
		sc.close();
		System.out.print(ag);
	}
}
