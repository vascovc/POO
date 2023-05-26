package aula11;

public class Voo {
	private String hora,voo,companhia,origem,atraso,printAtraso;
	private int timeAtraso;
	
	public Voo(String hora, String voo, String companhia, String origem, String atraso) {
		this.hora=hora;this.voo=voo;this.companhia=companhia;this.origem=origem;this.atraso=atraso;
		this.printAtraso = horaAtraso();//ao criar-se o objeto cria-se logo a string de como se imprime o atraso
	}
	public String horaAtraso() {
		if(atraso=="") {
			return "";
		}
		else{
			int h = Integer.valueOf(hora.substring(0, 2));
			int m = Integer.valueOf(hora.substring(3, 5));
			int h_atr = Integer.valueOf(atraso.substring(0, 2));
			int m_atr = Integer.valueOf(atraso.substring(3, 5));
			h = h*60;
			h_atr = h_atr*60;
			this.timeAtraso = h_atr+m_atr;//tempo de atraso em minutos do voo
			int time = h+m+h_atr+m_atr;//hora prevista
			return String.format("Previsto: %2d:%02d", time / 60, time % 60);
		}
	}
	public int getTimeAtraso() {
		return timeAtraso;
	}
	public void setTimeAtraso(int timeAtraso) {
		this.timeAtraso = timeAtraso;
	}
	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getVoo() {
		return voo;
	}

	public void setVoo(String voo) {
		this.voo = voo;
	}

	public String getCompanhia() {
		return companhia;
	}

	public void setCompanhia(String companhia) {
		this.companhia = companhia;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public String getAtraso() {
		return atraso;
	}

	public void setAtraso(String atraso) {
		this.atraso = atraso;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((atraso == null) ? 0 : atraso.hashCode());
		result = prime * result + ((companhia == null) ? 0 : companhia.hashCode());
		result = prime * result + ((hora == null) ? 0 : hora.hashCode());
		result = prime * result + ((origem == null) ? 0 : origem.hashCode());
		result = prime * result + ((voo == null) ? 0 : voo.hashCode());
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
		Voo other = (Voo) obj;
		if (atraso == null) {
			if (other.atraso != null)
				return false;
		} else if (!atraso.equals(other.atraso))
			return false;
		if (companhia == null) {
			if (other.companhia != null)
				return false;
		} else if (!companhia.equals(other.companhia))
			return false;
		if (hora == null) {
			if (other.hora != null)
				return false;
		} else if (!hora.equals(other.hora))
			return false;
		if (origem == null) {
			if (other.origem != null)
				return false;
		} else if (!origem.equals(other.origem))
			return false;
		if (voo == null) {
			if (other.voo != null)
				return false;
		} else if (!voo.equals(other.voo))
			return false;
		return true;
	}

	
	@Override
	public String toString() {
		return String.format("%-6s %-8s %-19s %-22s %-6s %-14s",hora,voo,companhia,origem,atraso,printAtraso);
	}
	
	
}
