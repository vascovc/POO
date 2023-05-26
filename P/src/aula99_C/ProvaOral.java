package aula99_C;

public class ProvaOral extends Teste{
	private Lingua lingua;

	public ProvaOral(String nome, String professor, String data, String salas, Lingua lingua) {
		super(nome, professor, data,salas);this.lingua=lingua;
	}
	public ProvaOral(String nome, String professor, String data, String salas) {
		this(nome, professor, data,salas,Lingua.UK);
	}
	
	public Lingua getLingua() {
		return lingua;
	}
	public void setLingua(Lingua lingua) {
		this.lingua = lingua;
	}
}
