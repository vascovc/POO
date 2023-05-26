package aula08;

import java.util.Scanner;

public class A08E02 {//foi acrescentado o ciclo no fim e a funcao "choosePrato"
	//alertando para a situaçao de as vezes dar um ciclo infinito pois nao consegue acrescentar ingrediente 
	public static void main(String[] args) {
		Ementa ementa = new Ementa("Especial Primavera", "Snack da UA");
		Prato[] pratos = new Prato[DiaSemana.values().length];
		for (int i = 0; i < pratos.length; i++) {
			pratos[i] = randPrato(i + 1);
			System.out.println("A sair .. " + pratos[i]);

			// Adiciona 2 ingredientes a cada prato
			int ingred = 1;
			do {
				Alimento aux = randAlimento();
				if (pratos[i].addIngrediente(aux)) {
					System.out.println("\tIngrediente " + ingred + " adicionado: " + aux);
					ingred++;
				} else
					System.out.println("\tERRO: nÃ£o Ã© possÃ­vel adicionar Ingrediente " + ingred + ": " + aux);
			} while (ingred < 3);

			ementa.addPrato(pratos[i], DiaSemana.getEnum(i));
		}
		System.out.println("\nEmenta final\n--------------------");
		System.out.println(ementa);
		
		int choice = 0;
		Scanner sc = new Scanner(System.in);
		while(choice!=12) {
		System.out.print("-Ingrediente\n"
				+ "  - Adicionar Carne(1)\n"
				+ "  - Adicionar Peixe(2)\n"
				+ "  - Adicionar Cereal(3)\n"
				+ "  - Adicionar Legume(4)\n"
				+ "-Prato\n"
				+ "  - Cria Prato(5)\n"
				+ "  - Apaga Prato(6)\n"
				+ "  - Seleciona Prato(7)\n"
				+ "  - Adiciona Ingrediente(8)\n"
				+ "  - Remove Ingrediente(9)\n"
				+ "-Ementa\n"
				+ "  - Adiciona Prato(10)\n"
				+ "  - Remove Prato(11)\n"
				+ "  - Imprime Ementa(12)\n"
				+ "Opcao: ");
			choice = sc.nextInt();
			sc.nextLine();
			
			if (choice == 1) {
				Prato p = choosePrato(pratos);
				System.out.print("Variedade: ");
				String v = sc.nextLine();
				System.out.print("Proteinas: ");
				double prot = sc.nextDouble();
				sc.nextLine();
				System.out.print("Calorias: ");
				double calo = sc.nextDouble();
				sc.nextLine();
				System.out.print("Peso: ");
				double pes = sc.nextDouble();
				sc.nextLine();
				Carne c = new Carne(VariedadeCarne.valueOf(v),prot,calo,pes);				
				p.addIngrediente(c);
			}
			else if (choice == 2) {
				Prato p = choosePrato(pratos);
				System.out.print("Tipo: ");
				String v = sc.nextLine();
				System.out.print("Proteinas: ");
				double prot = sc.nextDouble();
				sc.nextLine();
				System.out.print("Calorias: ");
				double calo = sc.nextDouble();
				sc.nextLine();
				System.out.print("Peso: ");
				double pes = sc.nextDouble();
				sc.nextLine();
				Peixe pe = new Peixe(TipoPeixe.valueOf(v),prot,calo,pes);				
				p.addIngrediente(pe);
			}
			else if (choice == 3) {
				Prato p = choosePrato(pratos);
				System.out.print("Nome: ");
				String nome = sc.nextLine();
				System.out.print("Proteinas: ");
				double prot = sc.nextDouble();
				sc.nextLine();
				System.out.print("Calorias: ");
				double calo = sc.nextDouble();
				sc.nextLine();
				System.out.print("Peso: ");
				double pes = sc.nextDouble();
				sc.nextLine();
				Cereal pe = new Cereal(nome,prot,calo,pes);				
				p.addIngrediente(pe);
			}
			else if (choice == 4) {
				Prato p = choosePrato(pratos);
				System.out.print("Nome: ");
				String nome = sc.nextLine();
				System.out.print("Proteinas: ");
				double prot = sc.nextDouble();
				sc.nextLine();
				System.out.print("Calorias: ");
				double calo = sc.nextDouble();
				sc.nextLine();
				System.out.print("Peso: ");
				double pes = sc.nextDouble();
				sc.nextLine();
				Legume pe = new Legume(nome,prot,calo,pes);				
				p.addIngrediente(pe);
			}
			else if (choice == 5) {//adiciona se a lista de pratos mas nao a ementa
				System.out.print("Nome: ");
				String name = sc.nextLine();
				Prato[] ax = new Prato[pratos.length+1];
				for(int i=0;i<pratos.length;i++) {
					ax[i]=pratos[i];
				}
				ax[pratos.length] = new Prato(name);
				pratos=ax;
			}
			else if (choice == 6) {//retira-se da lista de pratos
				System.out.print("Nome: ");
				String name = sc.nextLine();
				int count=0;
				Prato[] xa = new Prato[pratos.length-1];
				for(int i=0;i<pratos.length;i++) {
					if(name != pratos[i].getNome()) {
						xa[count] = pratos[i];
						count++;
						}
				}
				pratos = xa;
			}
			else if (choice == 7) {
				Prato p = choosePrato(pratos);
				System.out.println(p);
			}
			else if (choice == 8) {
				// ja esta feito nas opçoes 1 2 3 4
			}
			else if (choice == 9) {
				Prato p = choosePrato(pratos);
				System.out.println(p.printIngredientes()+"Opcao: ");
				int i = sc.nextInt();
				i--;
				Prato p1 = new Prato(p.getNome());
				Alimento[] alim = p.getAlimentos();
				for(int a=0;a<alim.length;a++) {
					if(a!=i)
						p1.addIngrediente(alim[a]);
				}
			}
			else if (choice == 10) {//adiciona-se o prato a ementa
				Prato ax = choosePrato(pratos);
				System.out.print("Dia da semana: ");
				String day = sc.nextLine();
				ementa.addPrato(ax, DiaSemana.valueOf(day));
			}
			else if (choice == 11) {//retira-se o prato da ementa
				Prato[] p2 = ementa.getPratos();
				System.out.print("Nome: ");
				String name = sc.nextLine();
				int count=0;
				Prato[] xa = new Prato[p2.length-1];
				for(int i = 0;i<p2.length;i++) {
					if(p2[i].getNome() != name) {
						xa[count] = p2[i];
						count++;
					}
				}
			}
			else if (choice == 12) {
				System.out.println(ementa);
			}
		}
		sc.close();
	}

	public static Alimento randAlimento() {
		Alimento res = null;
		switch ((int) (Math.random() * 4)) {
		case 0:
			res = new Carne(VariedadeCarne.FRANGO, 22.3, 345.3, 300);
			break;
		case 1:
			res = new Peixe(TipoPeixe.CONGELADO, 31.3, 25.3, 200);
			break;
		case 2:
			res = new Legume("Couve Flor", 21.3, 22.4, 150);
			break;
		case 3:
			res = new Cereal("Milho", 19.3, 32.4, 110);
			break;
		}
		return res;
	}

	public static Prato randPrato(int i) {
		Prato res = null;
		switch ((int) (Math.random() * 3)) {
		case 0:
			res = new Prato("combinado n." + i);
			break;
		case 1:
			res = new PratoVegetariano("combinado n." + i);
			break;
		case 2:
			res = new PratoDieta("combinado n." + i, 90.8);
			break;
		}
		return res;
	}

	public static Prato choosePrato(Prato[] pratos) {
		Scanner sc1 = new Scanner(System.in);
		System.out.print("Nome do prato: ");
		String name = sc1.nextLine();
		sc1.close();
		for(Prato a:pratos) {
			if(a.getNome()==name)
				return a;
		}
		return null;
	}
}
