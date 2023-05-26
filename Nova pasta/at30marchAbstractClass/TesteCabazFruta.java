package at30marchAbstractClass; 
import static java.lang.System.out;

public class TesteCabazFruta {
    
    public static void main(String[] args) {
    
     Cabaz cabaz = new Cabaz();
     
     cabaz.insereFruta( new FrutaUnidade("Papaia", 3.22, 2) );
     cabaz.insereFruta( new FrutaUnidade("Meloa", 1.50, 2) );
     cabaz.insereFruta( new FrutaPeso("Banana", 2.20, 2.5) );
     cabaz.insereFruta( new FrutaPeso("Laranja", 2.70, 3.5) );
     cabaz.insereFruta( new FrutaPeso("Manga", 3.70, 1.0) );
     cabaz.insereFruta( new FrutaVolume("Coco", 3.90, 2.0) );
     cabaz.insereFruta( new FrutaVolume("Coco variedade 2", 3.90, 2.0) );
     
    
     out.println("A Pagar: " + cabaz.valorTotal() + " Euros");
     
     out.printf("Total fruta à Unidade: %.2f Euros\n",
    		 cabaz.valorTotaldoTipo("FrutaUnidade"));
    
     out.printf("Total fruta a Peso: %.2f Euros\n",
    		 cabaz.valorTotaldoTipo("FrutaPeso"));
    
     
     out.println("A Peso: " + cabaz.numTotaldoTipo("FrutaPeso")+ " items.");
     
     // AT 
     out.println(cabaz);

   }
}
