package abstrata.exe2;

public class Diretor extends Gerente{
	public Diretor(double salario) {
		super(salario);
	}
	
	public String getObterCargo() {
		return "Diretor";
	}
	
}
