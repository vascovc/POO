package aula08;

public enum DiaSemana {
	Segunda,Terca,Quarta,Quinta,Sexta,Sabado,Domingo;
	
	static Object getEnum(int i) {
		switch(i) {
		case 0:
			return Segunda;
		case 1:
			return Terca;
		case 2:
			return Quarta;
		case 3:
			return Quinta;
		case 4:
			return Sexta;
		case 5:
			return Sabado;
		default:
			return Domingo;
		}
	}
}
