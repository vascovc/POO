package aula05;

public class Livro {
	private int id=100;
	private static int instanceCounter = 0;
	private String título, tipoEmprestimo;
	
	public Livro(String título,String tipoEmprestimo) {
		this.título = título;
		this.tipoEmprestimo = tipoEmprestimo;
		id = id + instanceCounter++; // assim vamos aumentando o contador e conseguem-se obter os ids diferentes
	}
	public Livro(String título) {
		this(título, "NORMAL"); // pelo que é suposto imprimir chega-se à conclusão de ser NORMAL
	}
	
	public void setTipoEmprestimo(String tipoEmprestimo) {
		this.tipoEmprestimo = tipoEmprestimo.toUpperCase();
	}

	public int getId() {
		return id;
	}
	public String getTitulo() {
		return título;
	}
	public String getTipoEmprestimo() {
		return tipoEmprestimo;
	}
	
	@Override
	public String toString(){
		return "Livro "+ id +"; "+título+"; "+tipoEmprestimo;
	}
}