package abstrata.exe2;

public class SecretariaAdministrativa extends Secretaria {
	
	public SecretariaAdministrativa(double salario) {
		super(salario);
	}
	
	public String getObterCargo() {
		return "Secretaria Administrativa";
	}
	
	public double getObterSalario() {
		return getBonificacao();
	}
	
	public double getBonificacao() {
		return (getSalario() *  + 0.1) + getSalario();
	}
}
