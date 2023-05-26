package aula99_C;

public abstract class Teste implements Comparable<Teste>{
	private String nome,professor,data,salas;
	
	public Teste(String nome,String professor,String data,String salas) {
		this.nome = nome;this.professor=professor;this.data=data;this.salas=salas;
	}
	public String toString() {
		return String.format("%s %s %s %s\n", nome,professor,data,salas);
	}
	
	@Override
	public int compareTo(Teste o) {
		return nome.compareTo(o.getNome());
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getProfessor() {
		return professor;
	}
	public void setProfessor(String professor) {
		this.professor = professor;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getSalas() {
		return salas;
	}
	public void setSalas(String salas) {
		this.salas = salas;
	}
	
}
