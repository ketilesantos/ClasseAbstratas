package abstrata.ex3;

public abstract class Empregado {
	
	private String nome;
	private String sobrenome;
	private String cpf;
	
	Empregado(String nome, String sobrenome, String cpf){
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
	}
	
	public String getNome() {
		return this.nome;
	}
	public String getSobrenome() {
		return this.sobrenome;
	}
	public String getCpf() {
		return this.cpf;
	}
	
	public abstract double getVencimento();

}
