package abstrata.exe1;

public class Quadrado extends Forma {
	double lado;

	public Quadrado(String nome,double lado) {
		super(nome);
		this.lado = lado;
	}
	
	public double calcularPerimetro() {
		return lado * 4;
	}

	public double getcalcularArea() {
		return Math.pow(lado, 2);
	}
}
