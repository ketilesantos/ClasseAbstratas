package abstrata.exe2;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Funcionario f1 = new Presidente(12385.00);
		Funcionario f2 = new Gerente(8956.21);
		Funcionario f3 = new Diretor(10568.00);
		Funcionario f4 = new SecretariaAdministrativa(3654.00);
		Funcionario f5 = new SecretariaAgencia(2415.32);
		
		List <Funcionario> funcionarios = new ArrayList<Funcionario>();
		funcionarios.add(f1);
		funcionarios.add(f2);
		funcionarios.add(f3);
		funcionarios.add(f4);
		funcionarios.add(f5);
		
		for (Funcionario funcionario: funcionarios) {
			System.out.println(funcionario.getObterCargo());
			System.out.printf("%.2f", funcionario.getObterSalario());
			System.out.println("\n");
		}
		
	}
}
