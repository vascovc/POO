package aula07;

import java.time.Duration;
import java.time.Instant;

public class Jogo {
	private Bola bol;
	private Equipa equipa1,equipa2;
	private double duration;
	private Instant start,end;
	
	public Jogo(Equipa equipa1,Equipa equipa2,Bola bol) {
		this.equipa1 = equipa1;
		this.equipa2 = equipa2;
		this.bol = bol;
		duration = 90;
	}
	public void setDuration(double time) {
		duration = time;
	}
	public void startGame() {
		start = Instant.now();
	}
	public void endGame() {
		end = Instant.now();
		System.out.println("Duração do jogo: "+Duration.between(start, end) );
	}
 	public Bola getBol() {
		return bol;
	}
 	public double getDuration() {
 		return duration;
 	}

	public Equipa getEquipa1() {
		return equipa1;
	}


	public Equipa getEquipa2() {
		return equipa2;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bol == null) ? 0 : bol.hashCode());
		long temp;
		temp = Double.doubleToLongBits(duration);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((end == null) ? 0 : end.hashCode());
		result = prime * result + ((equipa1 == null) ? 0 : equipa1.hashCode());
		result = prime * result + ((equipa2 == null) ? 0 : equipa2.hashCode());
		result = prime * result + ((start == null) ? 0 : start.hashCode());
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
		Jogo other = (Jogo) obj;
		if (bol == null) {
			if (other.bol != null)
				return false;
		} else if (!bol.equals(other.bol))
			return false;
		if (Double.doubleToLongBits(duration) != Double.doubleToLongBits(other.duration))
			return false;
		if (end == null) {
			if (other.end != null)
				return false;
		} else if (!end.equals(other.end))
			return false;
		if (equipa1 == null) {
			if (other.equipa1 != null)
				return false;
		} else if (!equipa1.equals(other.equipa1))
			return false;
		if (equipa2 == null) {
			if (other.equipa2 != null)
				return false;
		} else if (!equipa2.equals(other.equipa2))
			return false;
		if (start == null) {
			if (other.start != null)
				return false;
		} else if (!start.equals(other.start))
			return false;
		return true;
	}
	public String toString() {
		return "Bola: "+bol.toString()+", Tempo de jogo: "+duration+"\n" + equipa1.toString()+"\n"+equipa2.toString();
	}
}
