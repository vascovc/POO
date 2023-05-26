package aula99_C;

import java.util.TreeSet;

public class Escola {
	private String nome,endereco;
	private TreeSet<Teste> lista = new TreeSet<>();
	
	public Escola(String nome, String endereco) {
		this.nome=nome;this.endereco=endereco;
	}
	public void add(Teste t) {
		lista.add(t);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public TreeSet<Teste> getLista() {
		return lista;
	}
	public void setLista(TreeSet<Teste> lista) {
		this.lista = lista;
	}
	public String toString() {
		String a="\n";
		for(Teste t:lista)
			a+=t.toString();
		return "Escola "+nome + "\nEndereco: "+endereco+a;
	}
}
