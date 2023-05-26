package aula99_C;

public class ExameEscrito extends Teste{
	private boolean consulta = false;
	private int versoes;
	private int prazo;
	
	public ExameEscrito(String nome, String professor, String data,String salas,int versoes) {
		super(nome, professor, data,salas);this.versoes=versoes;
	}
	public ExameEscrito(String nome, String professor, String data, String salas) {
		this(nome,professor,data,salas,1);
	}
	public void setConsulta(boolean b) {
		consulta = b;
	}
	public void setPrazo(int i) {
		prazo=i;		
	}
	public int getVersoes() {
		return versoes;
	}
	public void setVersoes(int versoes) {
		this.versoes = versoes;
	}
	public boolean isConsulta() {
		return consulta;
	}
	public int getPrazo() {
		return prazo;
	}

}
