package abstrata.ex3;

public class Assalariado extends Empregado{
	public double salario;
	
	public Assalariado(String nome, String sobrenome, String cf, double salario) {
		super(nome, sobrenome, cf);	
		this.salario = salario;
	}
	
	public double getVencimento() {
		return 10;
	}
}
