package abstrata.exe2;

public abstract class Funcionario {
	private double salario;
	
	Funcionario(double salario){
		this.salario = salario;
	}
	
	public double getSalario() {
		return this.salario;
	}
	
	public abstract double getBonificacao();
	public abstract String getObterCargo();
	public abstract double getObterSalario();
	
}
