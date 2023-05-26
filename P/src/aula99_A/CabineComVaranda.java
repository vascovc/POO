package aula99_A;

public class CabineComVaranda extends Cabine{
	private TipoDeVaranda tipo;
	private Extra ext;
	
	public CabineComVaranda(int i, int j, TipoDeVaranda tipo, String[] passageiros) {
		super(i, j, passageiros);this.tipo=tipo;
	}
	public CabineComVaranda(int i, int j, TipoDeVaranda tipo) {
		super(i, j);this.tipo=tipo;
	}
	public void pacoteExtra(Extra ext) {
		this.ext=ext;
	}
	public TipoDeVaranda getTipo() {
		return tipo;
	}

	public Extra getExt() {
		return ext;
	}
	public void setExt(Extra ext) {
		this.ext = ext;
	}
	public void setTipoVaranda(TipoDeVaranda obstrParcial) {
		this.tipo = obstrParcial;		
	}
	@Override
	public String toString() {
		return "";
	}

}
