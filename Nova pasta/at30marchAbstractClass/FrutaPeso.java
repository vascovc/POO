package at30marchAbstractClass;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */




public class FrutaPeso extends Fruta {
    
    private double peso; // atributo específico de Fruta a Peso

    public FrutaPeso() { 
    	super(); 
    	peso = 0.0; 
    	}
    
    public FrutaPeso(String nome, double preco, double peso) { 
        super(nome, preco); this.peso = peso; 
    }
    
    public FrutaPeso(FrutaPeso fp) {
        super(fp.getNome(), fp.getPreco());
        peso = fp.getPeso();
    }
    
    public double getPeso() { return peso; }
    
    public void setPeso(double np) { peso = np; }
    
    

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%-12s",this.getNome() ));
        sb.append(", Preço Unid. = " + this.getPreco() );
        sb.append(", Peso = " + peso );
        sb.append(",  A Pagar = " + this.aPagar() + " Euros \n");
        return sb.toString();
    }

    
    // =========================================
    public double aPagar() { 
        return peso * this.getPreco(); 
    }
    

    
    
    
    
    
    
    
    
    public FrutaPeso clone() {
        return new FrutaPeso(this);
     }

    
    
}
