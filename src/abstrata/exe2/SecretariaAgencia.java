package abstrata.exe2;

public class SecretariaAgencia extends Secretaria {
	
	public SecretariaAgencia(double salario) {
		super(salario);
	}
	
	public String getObterCargo() {
		return "Secretaria Agencia";
	}
	
	public double getObterSalario() {
		return getBonificacao();
	}
	
	public double getBonificacao() {
		return (getSalario() *  0.05) + getSalario();
	}
}
