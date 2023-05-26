package aula99_A;

import java.util.LinkedList;
import java.util.TreeSet;

public class Cruzeiro {
	private String nome,data_comeco;
	private String[] cidades;
	private int duracao;
	private TreeSet<Cabine> lista = new TreeSet<>();
	
	public Cruzeiro(String nome, String[] cidades, String data_comeco) {
		this.nome=nome;this.cidades = cidades;this.data_comeco = data_comeco;
	}
	public void setDuracao(int i) {
		this.duracao = i;		
	}
	public void add(Cabine c) {
		lista.add(c);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getData_comeco() {
		return data_comeco;
	}
	public void setData_comeco(String data_comeco) {
		this.data_comeco = data_comeco;
	}
	public String[] getCidades() {
		return cidades;
	}
	public void setCidades(String[] cidades) {
		this.cidades = cidades;
	}
	public TreeSet<Cabine> getLista() {
		return lista;
	}
	public void setLista(TreeSet<Cabine> lista) {
		this.lista = lista;
	}
	public int getDuracao() {
		return duracao;
	}
	@Override
	public String toString() {
		LinkedList<String> a = new LinkedList<>();
		for(String c:cidades)
			a.add(c);
		String cabs = "";
		for(Cabine c:lista)
			cabs += c.toString();
		return "Navio " + nome + ", partida em "+ data_comeco+"\nItenerario:"+ a+"\n"+cabs;
	}
	
}
