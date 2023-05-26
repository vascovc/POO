package aula08;

public class PratoDieta extends Prato{
	private double maxCalorias;
	
	public PratoDieta(String nome,double maxCalorias) {
		super(nome);
		this.maxCalorias=maxCalorias;
	}
	public boolean addIngrediente(Alimento aux) {
		if(aux.getCalorias()+super.totalCalorias() <= maxCalorias) {
			super.addIngrediente(aux);
			return true;
		}//so se pode meter mais este alimento se o prato ficar no fim com as calorias a baixo do maximo
		return false;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(maxCalorias);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		PratoDieta other = (PratoDieta) obj;
		if (Double.doubleToLongBits(maxCalorias) != Double.doubleToLongBits(other.maxCalorias))
			return false;
		return true;
	}

	@Override
	public String toString() {
		
		return super.toString()+" - Dieta (" + String.format("%.2f",super.totalCalorias()) + " Calorias)";
	}
}
