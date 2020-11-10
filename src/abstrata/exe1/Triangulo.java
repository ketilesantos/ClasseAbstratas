package abstrata.exe1;

public class Triangulo extends Forma{
	public double lado;

	public Triangulo(String nome,double lado) {
		super(nome);
		this.lado = lado;
	}

	public double calcularPerimetro() {
		return lado * 3;
	}

	public double getcalcularArea() {
		return (Math.pow(lado, 2) * Math.sqrt(3)) / 4;
	}
}
