package aula05;

public class Livro {
	private int id=100;
	private static int instanceCounter = 0;
	private String t�tulo, tipoEmprestimo;
	
	public Livro(String t�tulo,String tipoEmprestimo) {
		this.t�tulo = t�tulo;
		this.tipoEmprestimo = tipoEmprestimo;
		id = id + instanceCounter++; // assim vamos aumentando o contador e conseguem-se obter os ids diferentes
	}
	public Livro(String t�tulo) {
		this(t�tulo, "NORMAL"); // pelo que � suposto imprimir chega-se � conclus�o de ser NORMAL
	}
	
	public void setTipoEmprestimo(String tipoEmprestimo) {
		this.tipoEmprestimo = tipoEmprestimo.toUpperCase();
	}

	public int getId() {
		return id;
	}
	public String getTitulo() {
		return t�tulo;
	}
	public String getTipoEmprestimo() {
		return tipoEmprestimo;
	}
	
	@Override
	public String toString(){
		return "Livro "+ id +"; "+t�tulo+"; "+tipoEmprestimo;
	}
}