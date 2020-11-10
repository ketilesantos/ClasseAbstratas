package abstrata.exe1;

public abstract class Forma {
	private String nome;
	
	Forma(String nome){
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public abstract double calcularPerimetro();

	public abstract double getcalcularArea();
	
}
