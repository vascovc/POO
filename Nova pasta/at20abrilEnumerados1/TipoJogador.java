package at20abrilEnumerados1;

public enum TipoJogador {
	GuardaRedes, Avancado, Defesa, Medio;
	//  nota: não respeita uso de Maiúsculas ...
	
	public static TipoJogador get(String string) {  // Q++ Porquê?
		switch (string) {
		case "Avançado" : return TipoJogador.Avancado;
		case "Médio" : return TipoJogador.Medio;
		case "Defesa" : return TipoJogador.Defesa;
		case "Guarda-redes" : return TipoJogador.GuardaRedes;
		default: return TipoJogador.GuardaRedes;
		}
	}
}
