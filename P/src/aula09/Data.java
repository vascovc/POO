package aula09;
import java.lang.Comparable;

public class Data implements Comparable<Data>{
	private int dia,mes,ano;
	
	public Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}	
	
	public int getDia() {
		return dia;
	}

	public int getMes() {
		return mes;
	}

	public int getAno() {
		return ano;
	}

	@Override
	public String toString() {
		return dia+"/"+mes+"/"+ano;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ano;
		result = prime * result + dia;
		result = prime * result + mes;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Data other = (Data) obj;
		if (ano != other.ano)
			return false;
		if (dia != other.dia)
			return false;
		if (mes != other.mes)
			return false;
		return true;
	}

	@Override
	public int compareTo(Data d) {
		Data a = (Data) d;
		if(ano > a.getAno())
			return 1;
		else if(ano < a.getAno())
			return -1;
		else {//anos iguais
			if(mes > a.getAno())
				return 1;
			else if(mes < a.getAno())
				return -1;
			else {//meses iguais
				if(dia > a.getDia())
					return 1;
				else if(dia < a.getDia())
					return -1;
				else
					return 0;
			}
		}
	}	
}


