package at11mayMaps01;

public class ExemploDeComparableLivro implements Comparable<ExemploDeComparableLivro>{

	private String nome;
	private String autor;
	private int ano;

	public ExemploDeComparableLivro (String nome, String autor, int ano){
		this.nome=nome;
		this.autor=autor;
		this.ano=ano;
		
	}

	@Override
	public String toString() {
		return "Livro [nome=" + nome + ", autor=" + autor + ", ano=" + ano + "]\n";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	@Override
	public int compareTo(ExemploDeComparableLivro other) {
		// TODO Auto-generated method stub
		return this.nome.compareTo(other.nome);
	}
	
}
