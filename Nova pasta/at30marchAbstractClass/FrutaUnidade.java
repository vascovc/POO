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
public class FrutaUnidade extends Fruta {
    
    private int quantidade;

    public FrutaUnidade() { super(); quantidade = 0; }
    
    public FrutaUnidade(String nm, double preco, int quant) { 
        super(nm, preco); quantidade = quant; 
    }
    
    public FrutaUnidade(FrutaUnidade fu) {
        super(fu.getNome(), fu.getPreco());
        quantidade = fu.getQuant();
    }
    
    public int getQuant() { return quantidade; }
    public void setQuant(int qt) { quantidade = qt; }

    /**
     * 
     */
    public double aPagar() { 
        return quantidade * this.getPreco(); 
    }

    
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%-12s",this.getNome()) );
        sb.append(", Preço Unid. = " + this.getPreco() );
        sb.append(", Quantidade = " + quantidade );
        sb.append(", A Pagar = " + this.aPagar() + " Euros \n");
        return sb.toString();
    }

    public FrutaUnidade clone() {
       return new FrutaUnidade(this);
    }
}

