package aula08;

public class PratoVegetariano extends Prato{
	
	public PratoVegetariano(String nome) {
		super(nome);
	}
	
	public boolean addIngrediente(Alimento aux) {
		if(aux instanceof AlimentoVegetariano) {
			super.addIngrediente(aux);
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return super.toString()+" - Prato Vegetariano";
	}

}
