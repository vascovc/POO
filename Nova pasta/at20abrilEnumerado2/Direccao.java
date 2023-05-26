package at20abrilEnumerado2;

/**
 * Enumeration class Direccao 
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public enum Direccao {
	Norte, Sul{
		public String toString(){return "ENUM SUL";}
	}, Este, Oeste
}
