package aula08;

import java.util.Arrays;

public class Ementa {//exercicio opcional foi acrescentado em ultimo ao exercicio de teste fornecido
	private String nome,local;
	private Prato[] pratos = new Prato[0];
	
	public Ementa(String nome, String local) {
		this.nome=nome;
		this.local=local;
	}

	public void addPrato(Prato prato, Object object) {
		prato.setDiaSemana(object);
		Prato[] n = new Prato[pratos.length+1];
		for(int i=0;i<pratos.length;i++) {
			n[i] = pratos[i];
		}
		n[pratos.length]=prato;
		pratos=n;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public Prato[] getPratos() {
		return pratos;
	}
	public void setPratos(Prato[] pratos) {
		this.pratos = pratos;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((local == null) ? 0 : local.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + Arrays.hashCode(pratos);
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
		Ementa other = (Ementa) obj;
		if (local == null) {
			if (other.local != null)
				return false;
		} else if (!local.equals(other.local))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (!Arrays.equals(pratos, other.pratos))
			return false;
		return true;
	}

	@Override
	public String toString() {
		String s="";
		for(Prato p:pratos) {
			s += p.toString()+", dia "+p.getDiaSemana()+"\n";
		}
		return s;
	}

}
