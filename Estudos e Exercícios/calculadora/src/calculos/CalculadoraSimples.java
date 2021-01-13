package calculos;

public class CalculadoraSimples {
	
	//modificadores de acesso s�o para tornar vis�veis ou n�o
	//padr�o sem nada (vis�vel dentro do mesmo pacote)
	//public (vis�vel para todos)
	//protected � o mesmo que o padr�o(vis�vel dentro do mesmo pacote)
	//private (vis�vel apenas dentro da classe)
	
	
	public double somar(double num1, double num2) { //m�todo geralmente � verbo ex: somar
		return (num1 + num2);
	}
	
	public double subtrair(double num1, double num2) {
		return (num1 - num2);
	}
	
	public double multiplicacao(double num1, double num2) {
		return (num1 * num2);
	}
	
	public double divisao(double num1, double num2) {
		return (num1 / num2);
	}
	
}
