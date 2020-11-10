package abstrata.exe1;

public class Circulo extends Forma {
	public double raio;
	public final double PI = 3.14;
	
	public Circulo (String nome, double raio) {
		super(nome);
		this.raio = raio;
	}

	public double calcularPerimetro() {
		return raio * 2 * PI;
	}

	public double getcalcularArea() {
		return Math.pow(raio, 2) * PI;
	}


}
