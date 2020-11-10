package abstrata.ex3;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		
		
		Empregado E1 = new Comissionado("Joao", "Silva", "458.115.025.81", 152.20, 0.25);
		Empregado E2 = new Assalariado("Maria", "Santos", "858.225.825.22", 1254.22);
		Empregado E3 = new Horista("Lara", "Poulis", "112.556.105.69", 15.85, 12);
		
		List<Empregado> empregados = new ArrayList<Empregado>();
		empregados.add(E1);
		empregados.add(E2);
		empregados.add(E3);
		
		int total = 0;
		for (Empregado empregado: empregados) {
			System.out.println("Nome: " + empregado.getNome());
			System.out.println("Sobrenome: " + empregado.getSobrenome());
			System.out.println("CPF: " + empregado.getCpf());
			System.out.println("Vencimento: " + empregado.getVencimento());
			total+=empregado.getVencimento();
			System.out.println();
			
		}
		System.out.println("Total dos Vencimentos: "  + total);
		
	}
}
