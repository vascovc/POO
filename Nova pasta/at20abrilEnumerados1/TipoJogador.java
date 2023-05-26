package at20abrilEnumerados1;

public enum TipoJogador {
	GuardaRedes, Avancado, Defesa, Medio;
	//  nota: n�o respeita uso de Mai�sculas ...
	
	public static TipoJogador get(String string) {  // Q++ Porqu�?
		switch (string) {
		case "Avan�ado" : return TipoJogador.Avancado;
		case "M�dio" : return TipoJogador.Medio;
		case "Defesa" : return TipoJogador.Defesa;
		case "Guarda-redes" : return TipoJogador.GuardaRedes;
		default: return TipoJogador.GuardaRedes;
		}
	}
}
