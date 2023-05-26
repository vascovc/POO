package aula07;

import java.util.Arrays;

public class Equipa{
	private String nome, nome_responsavel;
	private int golos_marcados=0,golos_sofridos=0;
	private Robot[] jogadores = new Robot[3];
	
	public Equipa(String nome, String nome_responsavel,Robot[] jogadores) {
		this.nome = nome;
		this.nome_responsavel = nome_responsavel;
		this.jogadores = jogadores;
	}

	public void setNome_responsavel(String nome_responsavel) {//o nome do treinador pode mudar
		this.nome_responsavel = nome_responsavel;
	}
	public void scoreGoal(Equipa adv,Robot r) {
		adv.gotScored();
		golos_marcados++;
		r.scoreGoal();
	}
	public void gotScored() {
		golos_sofridos++;
	}
	public String getNome_responsavel() {
		return nome_responsavel;
	}
	public String getNome() {
		return nome;
	}
	public int getGolos_marcados() {
		return golos_marcados;
	}
	public int getGolos_sofridos() {
		return golos_sofridos;
	}
	public Robot[] getJogadores() {
		return jogadores;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + golos_marcados;
		result = prime * result + golos_sofridos;
		result = prime * result + Arrays.hashCode(jogadores);
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((nome_responsavel == null) ? 0 : nome_responsavel.hashCode());
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
		Equipa other = (Equipa) obj;
		if (golos_marcados != other.golos_marcados)
			return false;
		if (golos_sofridos != other.golos_sofridos)
			return false;
		if (!Arrays.equals(jogadores, other.jogadores))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (nome_responsavel == null) {
			if (other.nome_responsavel != null)
				return false;
		} else if (!nome_responsavel.equals(other.nome_responsavel))
			return false;
		return true;
	}

	@Override
	public String toString() {
		String a="";
		for(Robot r:jogadores) {
			a+=r+"\n\t";
		}
		return "Equipa - " + nome + ", Responsável: " + nome_responsavel + ", Golos Marcados: " + golos_marcados
				+ ", Golos Sofridos: " + golos_sofridos+", Jogadores:\n\t"+a;
	}
	
}
