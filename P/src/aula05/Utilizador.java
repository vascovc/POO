package aula05;

public class Utilizador {
	private String nome,curso,book = "";
	private int nMec;
	
	public Utilizador(String nome, int nMec, String curso) {
		this.nome = nome;
		this.nMec = nMec;
		this.curso = curso;
	}
	
	public void setnMec(int nMec) {
		this.nMec = nMec;
	}
	public int getnMec() {
		return nMec;
	}
	
	public void setBook(int id) {// a conversão não e das coisas mais praticas mas ira funcionar
		book += String.valueOf(id);
	}
	public String getBook() {
		return book;
	}
	public void removeID(int ab){
		char[] a = String.valueOf(ab).toCharArray();
		char[] b = book.toCharArray();
		book = "";
		for(int i= 0;i<b.length;i += 3) {// vamos saltando de 3 em 3 que assim obtemos os inicios dos pares
			if (a[0] == b[i] && a[1] == b[i+1] && a[2] == b[i+2])
				continue;
			else
				book += b[i] + b[i+1] + b[i+2];
		}
	}
	@Override
	public String toString() {
		return "Aluno: "+nMec+"; "+nome+"; "+curso;
	}
}
