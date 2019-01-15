package utilities;

public class CurrencyConverter {
	public double valorDollar;
	public int qtdDollar;
	public static final double IOF = 0.06;
	
	public double converterDollarForReal() {
		return valorDollar * qtdDollar;
	}
	
	public double valorComImposto(double valPago) {
		return valPago * IOF + valPago;
	}
	
	
}
