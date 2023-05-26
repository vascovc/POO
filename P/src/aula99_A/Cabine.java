package aula99_A;

import java.util.LinkedList;

public abstract class Cabine implements Comparable<Cabine>{
	private int numero,capacidade;
	private String[] passageiros;
	
	public Cabine(int i, int j,String[] passageiros) {
		this.numero = i; this.capacidade = j;this.passageiros = passageiros;
	}
	public Cabine(int i, int j) {
		numero = i;capacidade = j;
	}
	
	public int getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	
	public int getMaxOcupantes() {
		return capacidade;
	}
	public void setMaxOcupantes(int capacidade) {
		this.capacidade = capacidade;
	}
	public String[] getPassageiros() {
		return passageiros;
	}
	public void setNumQuartos(int numero) {
		this.numero = numero;
	}

	public void setPassageiros(String[] passageiros) {
		this.passageiros=passageiros;
	}
	public int getNumQuartos() {
		return numero;
	}
	
	@Override
	public String toString() {
		LinkedList<String> a = new LinkedList<>();
		String b;
		if(passageiros!=null) {
			for(String c:passageiros)
				a.add(c);
			b = a.toString();
		}
		else
			b = "Disponivel para venda";
		
		return "[ Nº"+numero+"( max "+capacidade+" pessoas ) : "+b+"]\n";
	}
	@Override
	public int compareTo(Cabine o) {
		return Integer.compare(numero, o.getNumQuartos());
	}
}
