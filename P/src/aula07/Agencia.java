package aula07;

import java.util.Arrays;

public class Agencia {
	// alojamento, viaturas, nome, endere�o
	private String name,endere�o;
	private Alojamento aloj[] = new Alojamento[0];
	private Viatura viat[] = new Viatura[0];
	
	public Agencia(String name, String endere�o) {
		this.endere�o = endere�o;
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEndere�o() {
		return endere�o;
	}
	public String getName() {
		return name;
	}
	
	public void addAloj(Alojamento a) {
		Alojamento a1[] = new Alojamento[aloj.length+1];
		for(int i=0;i<aloj.length;i++) {
			a1[i] = aloj[i];
		}
		a1[aloj.length] = a;
		aloj = a1;
	}
	public void addViatura(Viatura v) {
		Viatura v1[] = new Viatura[viat.length+1];
		for(int i = 0;i<viat.length;i++) {
			v1[i] = viat[i];
		}
		v1[viat.length] = v;
		viat = v1;
	}

	public Alojamento[] getAlojamento() {
		return aloj;
	}
	public Viatura[] getViatura() {
		return viat;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(aloj);
		result = prime * result + ((endere�o == null) ? 0 : endere�o.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + Arrays.hashCode(viat);
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
		Agencia other = (Agencia) obj;
		if (!Arrays.equals(aloj, other.aloj))
			return false;
		if (endere�o == null) {
			if (other.endere�o != null)
				return false;
		} else if (!endere�o.equals(other.endere�o))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (!Arrays.equals(viat, other.viat))
			return false;
		return true;
	}
	public String toString() {
		String a = "",b = "";
		for(Alojamento al:aloj) {
			a += al.toString()+"\n";
		}
		for(Viatura v:viat) {
			b += v.toString()+"\n";
		}
		return "Nome: "+name+", Endere�o: "+endere�o+"\n"+a+"\n"+b;
	}
	
}
