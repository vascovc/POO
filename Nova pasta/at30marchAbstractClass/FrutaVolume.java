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
public class FrutaVolume extends Fruta {
    
    private double volume;

    public FrutaVolume() { super(); volume = 0.0; }
    public FrutaVolume(String nome, double preco, double vol) { 
        super(nome, preco); volume = vol; 
    }
    public FrutaVolume(FrutaVolume fp) {
        super(fp.getNome(), fp.getPreco());
        volume = fp.getVolume();
    }
    
    public double getVolume() { return volume; }
    public void setVolume(double vol) { volume = vol; }
    public double aPagar() { 
        return volume * this.getPreco(); 
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%-12s",this.getNome()) );
        sb.append(", Preço Volume = " + this.getPreco());
        sb.append(", Vol = " + volume );
        sb.append(", A Pagar = " + this.aPagar() + " Euros \n");
        return sb.toString();
    }

    public FrutaVolume clone() {
       return new FrutaVolume(this);
    }
}

