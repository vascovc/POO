package aula08;

import java.util.Arrays;
import java.util.Comparator;

public class Empresa {
	private String nome,codigo_postal,email;
	private Veiculo[] viaturas;
	public Empresa(String nome, String codigo_postal, String email, Veiculo[] viaturas) {
		this.nome = nome;
		this.codigo_postal = codigo_postal;
		this.email = email;
		this.viaturas = viaturas;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCodigo_postal() {
		return codigo_postal;
	}
	public void setCodigo_postal(String codigo_postal) {
		this.codigo_postal = codigo_postal;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Veiculo[] getViaturas() {
		return viaturas;
	}
	public void setViaturas(Veiculo[] viaturas) {
		this.viaturas = viaturas;
	}
	
	public void addVeiculo(Veiculo v) {
		Veiculo[] ab = new Veiculo[viaturas.length+1];
		for(int i=0;i<viaturas.length;i++) {
			ab[i]=viaturas[i];
		}
		ab[viaturas.length]=v;
		viaturas = ab;
	}
	public void removeVeiculo(Veiculo v) {
		Veiculo[] ab = new Veiculo[viaturas.length-1];
		int pos=0;
		
		for(int i=0;i<viaturas.length;i++) {
			if( !v.equals(viaturas[i]) ) {
				ab[pos]=viaturas[i];
				pos++;
			}
		}
		viaturas=ab;
	}
	public Veiculo maisQuilometros(){
		Veiculo v = viaturas[0];
		for(int i=1;i<viaturas.length;i++) {
			if ( viaturas[i].distanciaTotal() > v.distanciaTotal() )
				v = viaturas[i];
		}
		return v;
	}

	public void sortCilindrada() {
		Arrays.sort(viaturas,Comparator.comparing(Veiculo::getCilindrada));
		String s ="";
		for(Veiculo a:viaturas) {
			s+=a.toString()+"\n";
		}
		System.out.println(s);
	}

	@Override
 	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo_postal == null) ? 0 : codigo_postal.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + Arrays.hashCode(viaturas);
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
		Empresa other = (Empresa) obj;
		if (codigo_postal == null) {
			if (other.codigo_postal != null)
				return false;
		} else if (!codigo_postal.equals(other.codigo_postal))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (!Arrays.equals(viaturas, other.viaturas))
			return false;
		return true;
	}

	@Override
	public String toString() {
		String vi="";
		for(Veiculo a:viaturas) {
			vi+="\n\t"+a.toString();
		}
		return "Empresa: " + nome + ", Codigo postal=" + codigo_postal + ", Email=" + email + ", Viaturas:"+vi;
	}
}
