package abstrata.ex3;

public class Comissionado extends Empregado{
	public double totalVenda;
	public double taxaComissao;
	
	public Comissionado(String nome, String sobrenome, String cf, double totalVenda, double taxaComissao) {
		super(nome, sobrenome, cf);	
		this.totalVenda = totalVenda;
		this.taxaComissao = taxaComissao;
	}
	
	public double getVencimento() {
		return 25;
	}
}
