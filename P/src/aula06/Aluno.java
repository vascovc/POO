package aula06;

import java.time.LocalDate; 

public class Aluno extends Pessoa {
	private Data dataInsc ;
	private int NMec=100;
	private static int instanceCounter = 0;
	
	//nao pode mudar o numero mecanografico
	Aluno(String iNome, int cc, Data dataNasc, Data dataInsc){
		super(iNome,cc,dataNasc);
		this.dataInsc = dataInsc;
		NMec = NMec+instanceCounter++;
	}
	Aluno(String iNome, int cc, Data dataNasc){
		super(iNome,cc,dataNasc);
		LocalDate obj = LocalDate.now();
		Data currentTime = new Data(obj.getDayOfMonth(),obj.getMonthValue(),obj.getYear());
		this.dataInsc = currentTime;
		NMec = NMec+instanceCounter++;
	}

	public int getNMec() {
		return NMec;
	}
	public Data getDataInsc() {
		return dataInsc;
	}
	public void setDataInsc(Data insc) {//se tiver sido escrita a data errada
		this.dataInsc = insc;
	}
	
	@Override
	public String toString() {
		return super.toString()+", Data de inscrição: "+dataInsc+", Número Mecanográfico: "+NMec;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + NMec;
		result = prime * result + ((dataInsc == null) ? 0 : dataInsc.hashCode());
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
		Aluno other = (Aluno) obj;
		if (NMec != other.NMec)
			return false;
		if (dataInsc == null) {
			if (other.dataInsc != null)
				return false;
		} else if (!dataInsc.equals(other.dataInsc))
			return false;
		return true;
	}
	
}
