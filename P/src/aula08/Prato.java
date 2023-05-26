package aula08;

import java.util.Arrays;

interface Comparable<T>{
	int compareTo(T other);
}
public class Prato implements Comparable<Prato>{
	private String nome;
	private Alimento[] alimentos = new Alimento[0];
	private int num_ingrid=0;
	private double peso=0,calorias=0,proteinas=0; 
	private DiaSemana dia;
	
	public Prato(String nome) {
		this.nome=nome;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Alimento[] getAlimentos() {
		return alimentos;
	}
	public void setAlimentos(Alimento[] alimentos) {
		this.alimentos = alimentos;
	}
	public void setDiaSemana(Object object) {
		this.dia = (DiaSemana) object;
	}
	public Object getDiaSemana() {
		return dia;
	}
	
	public double totalPeso() {
		for(Alimento a:alimentos) {
			peso += a.getPeso();
		}
		return peso;
	}
	public double totalCalorias() {
		for(Alimento a:alimentos) {
			calorias += a.getCalorias();
		}
		return calorias;
	}
	public double totalProteinas() {
		for(Alimento a:alimentos) {
			proteinas += a.getProteinas();
		}
		return proteinas;
	}
	
	public boolean addIngrediente(Alimento aux) {
		Alimento[] n = new Alimento[alimentos.length+1];
		for(int i=0;i<alimentos.length;i++) {
			n[i]=alimentos[i];
		}
		n[alimentos.length]=aux;
		alimentos=n;
		num_ingrid++;
		return true;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(alimentos);
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + num_ingrid;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Prato other = (Prato) obj;
		if (!Arrays.equals(alimentos, other.alimentos))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (num_ingrid != other.num_ingrid)
			return false;
		return true;
	}

	
	@Override
	public String toString() {
		return "Prato '" + nome + "', composto por "+num_ingrid+" Ingredientes";
	}
	
	public String printIngredientes() {
		String a="";
		int i =0;
		for(Alimento bx:alimentos) {
			i++;
			a += '('+i+')'+bx.toString()+"\n";
		}
		return a;
	}
	public int compareTo(Prato p) {
		double dif = totalCalorias()-p.totalProteinas();
		if(dif>0)return 1;
		else if (dif<0)return -1;
		else return 0;
	}
}
