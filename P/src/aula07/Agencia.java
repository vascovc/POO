package aula07;

import java.util.Arrays;

public class Agencia {
	// alojamento, viaturas, nome, endereço
	private String name,endereço;
	private Alojamento aloj[] = new Alojamento[0];
	private Viatura viat[] = new Viatura[0];
	
	public Agencia(String name, String endereço) {
		this.endereço = endereço;
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEndereço() {
		return endereço;
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
		result = prime * result + ((endereço == null) ? 0 : endereço.hashCode());
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
		if (endereço == null) {
			if (other.endereço != null)
				return false;
		} else if (!endereço.equals(other.endereço))
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
		return "Nome: "+name+", Endereço: "+endereço+"\n"+a+"\n"+b;
	}
	
}
