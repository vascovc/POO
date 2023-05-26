package aula09;

public class Pessoa {
	private String name;
	private int cc;
	private Data dataNasc;
	
	public Pessoa(String name, int cc, Data dataNasc) {
		this.name = name;
		this.cc = cc;
		this.dataNasc = dataNasc;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCC() {
		return cc;
	}
	public Data getDataNasc() {
		return dataNasc;
	}
	@Override
	public String toString() {
		return name + ", CC: " + cc + ", Data: " + dataNasc;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cc;
		result = prime * result + ((dataNasc == null) ? 0 : dataNasc.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Pessoa other = (Pessoa) obj;
		if (cc != other.cc)
			return false;
		if (dataNasc == null) {
			if (other.dataNasc != null)
				return false;
		} else if (!dataNasc.equals(other.dataNasc))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
}