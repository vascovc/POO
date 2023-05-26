package aula99_A;

public class CabineComJanela extends Cabine{
	private TipoDeJanela tipo;
	private Extra ext;
	
	public CabineComJanela(int i, int j, TipoDeJanela tipo,String[] passageiros) {
		super(i, j, passageiros);this.tipo=tipo;
	}
	public CabineComJanela(int i, int j, TipoDeJanela tipo) {
		super(i, j);this.tipo=tipo;
	}
	public void pacoteExtra(Extra ext) {
		this.ext=ext;
	}
	@Override
	public String toString() {
		String b="";
		if(ext!=null)
			b = ext.toString();
		return "Cabine com Janela "+tipo+" " +b+ " "+super.toString();
	}

}
