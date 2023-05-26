package aula99_C;

public class TesteComputador extends Teste{
	private String link;
	private int prazo;
	
	public int getPrazo() {
		return prazo;
	}

	public void setPrazo(int prazo) {
		this.prazo = prazo;
	}

	public TesteComputador(String nome, String professor, String data,String salas) {
		super(nome, professor, data,salas);
	}

	public void setLink(String link) {
		this.link=link;
	}
	public String getLink() {
		return link;
	}

}
