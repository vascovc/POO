package at25mayLambdaExpressions1;

/**
 *  Exemplo muito simples apenas para exemplificar sort
 * @author AJST
 *
 */
public class Empregado {
	private String nome;
	private double salario;
	
	Empregado (String nome, double salario){
		this.nome=nome;
		this.salario=salario;
	}
	
	
	public double salario() {  return salario;}
	public String nome() {  return nome;}

	@Override
	public String toString() {
		return "Empregado [nome=" + nome + ", salario=" + salario + "]";
	}
	
	
	
}
