package abstrata.exe2;

public class Gerente extends Funcionario {
	public Gerente(double salario) {
		super(salario);
	}
	public String getObterCargo() {
		return "Gerente";
	}
	
	public double getObterSalario() {
		return getBonificacao();
	}
	
	public double getBonificacao() {
		return (getSalario() *  + 0.2) + getSalario();
	}
}
