package abstrata.exe1;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Forma f1 = new Circulo("Circulo", 15);
		Forma f2 = new Quadrado("Quadrado",10);
		Forma f3 = new Retangulo("Retangulo",13,5);
		Forma f4 = new Triangulo("Triangulo",5);
		
		List<Forma> formas =  new ArrayList<Forma>();
		formas.add(f1);
		formas.add(f2);
		formas.add(f3);
		formas.add(f4);
		
		for(Forma forma: formas) {
			System.out.println(forma.getNome());
			System.out.printf("Perimetro: %.2f", forma.calcularPerimetro());
			System.out.println();
			System.out.printf("Area: %.2f", forma.getcalcularArea());
			System.out.println("\n");
		}	
	}
}
