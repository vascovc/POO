package at30marchAbstractClass;

public class Cabaz {
    public static int MAX_CAP = 100;
    
    private Fruta[] cabaz = new Fruta[MAX_CAP]; 
    private int total = 0; // items no cabaz

    /**
     * 
     * @param f
     */
    public void insereFruta(Fruta f) { 
    	//TODO  mudar return para boolean sucesso?
        if(total < MAX_CAP) {
             
             cabaz[total] = f; 
             total++;
             //cabaz[total] = f.clone(); total++; 
        }
        // TODO aumentar tamanho do array
        
    }

    
    
    
    /**
     * 
     * @return
     */
    public double valorTotal() {
       double valor = 0.0;
       
       for(int i = 0; i < total; i++)  {
                valor += cabaz[i].aPagar();
                //cabaz[i].aPagar()
       }
       return valor;
    }

    /**
     * 
     * @param tipoFruta
     * @return
     */
    public double valorTotaldoTipo(String tipoFruta) {
       double valor = 0.0;
       
       for(int i = 0; i < total; i++)  {
    	  //System.out.println(cabaz[i].getClass().getSimpleName());
       
    	  if(cabaz[i].getClass().getSimpleName().equals(tipoFruta))
              valor += cabaz[i].aPagar();
       	  }
       
       return valor;
    }

    /**
     * 
     * @param tipoFruta
     * @return
     */
    public int numTotaldoTipo(String tipoFruta) {
       int contador = 0;
       
       for(int i = 0; i < total; i++)   
          if(cabaz[i].getClass().getSimpleName().equals(tipoFruta))
              contador++;
       
       return contador;
    }
    
    
    // AT
    public String toString( ) {
        StringBuilder sb=new StringBuilder();
        
        sb.append("\nConteúdo do Cabaz\n");
        sb.append("---------------------\n");
        for(Fruta f:cabaz)   
        	if (f!=null)
				sb.append(f);
        
        return sb.toString();
     }

    
    
}
