package aula99_A;

public class Suite extends Cabine{

	public Suite(int i, int j) {
		super(i, j);
	}

	@Override
	public String toString() {
		return "Suite c/"+super.getCapacidade()+" quartos "+super.toString();
	}
	
}
