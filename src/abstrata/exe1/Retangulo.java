package abstrata.exe1;

public class Retangulo extends Forma {
	public double altura;
	public double base;

	public Retangulo(String nome, double altura, double base) {
		super(nome);
		this.altura = altura;
		this.base = base;
	}

	public double calcularPerimetro() {
		return ((base * 2) + (altura * 2));
	}

	public double getcalcularArea() {
		return base * altura;
	}
}
