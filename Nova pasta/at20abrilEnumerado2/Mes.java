package at20abrilEnumerado2;

public enum Mes {
    // enumeracao
	Janeiro(31), Fevereiro(29), 
	Marco(31) {
			public String toString()
				{return "Mar�o";}
			}
	, Abril(30),
	Maio(31), Junho(30), Julho(31), Agosto(31),
	Setembro(30), Outubro(31), Novembro(30),Dezembro(31);
	
	// construtor privado da classe
	private Mes(int dias) { this.dias = dias; }
	
	// vari�vel de estado associada a cada constante
    private final int dias;
    // m�todo para consulta do estado de cada constante
    public final int getDias() { return dias; }
}
