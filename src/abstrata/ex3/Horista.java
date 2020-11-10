package abstrata.ex3;

public class Horista extends Empregado {
	public double precoHora;
	public double horasTrabalhadas;
	
	public Horista(String nome, String sobrenome, String cf, double precoHora, double horasTrabalhadas) {
		super(nome, sobrenome, cf);	
		this.precoHora = precoHora;
		this.horasTrabalhadas = horasTrabalhadas;
	}
	
	public double getVencimento() {
		return 65;
	}
}
