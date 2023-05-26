package at11mayMaps01;


public class Contacto {

	private String nome;
	private String telef;
	private Data dataNasc;
	private String email;

	//nome, telefone, data de nascimento, email
	public Contacto(String nome,String telef, Data dataNasc, String email){
		this.nome=nome;
		this.telef=telef;
		this.dataNasc=dataNasc;
		this.email=email;
		
	}

	@Override
	public String toString() {
		return "Contacto [nome=" + nome + ", telef=" + telef + ", dataNasc=" + dataNasc + ", email=" + email + "]\n";
	}


}
