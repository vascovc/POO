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
public abstract class Fruta {
    
    private String nome;
    private double preco;
    
    public Fruta() { 
        nome = ""; preco = 0.0;
    }
    
    public Fruta(String nm, double preco) {
        nome = nm; this.preco = preco;
    }
    
    public String getNome() { return nome; }
    public double getPreco() { return preco; }
    
    public void setpreco(double nvPreco) { 
        preco = nvPreco;
    }
    
    // abstract methods ...  DEPENDEM DO TIPO DE FRUTA
    public abstract double aPagar();
    
    
    public abstract String toString();
    
    
    
    //public abstract Fruta clone();
}
