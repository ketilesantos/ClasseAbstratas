package abstrata.exe2;

public class Presidente extends Funcionario{
	
	public Presidente(double salario) {
		super(salario);
	}
	public String getObterCargo() {
		return "Presidente";
	}
	
	public double getBonificacao() {
		return (getSalario() *  + 0.3) + getSalario();
	}
	
	public double getObterSalario() {
		return getBonificacao();
	}
}
