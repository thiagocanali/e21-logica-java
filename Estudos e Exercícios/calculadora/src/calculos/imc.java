package calculos;

public class imc {

	private double imc;
	
	//m�todos com retorno
	public double calculaImc (double altura, double peso) {
		imc = peso/ ( altura*altura);
		return imc;
	}
	
	//m�todos sem retorno
	public void calculaImc2 (float altura, float peso) {
		imc = peso/ ( altura*altura);
	}
}
