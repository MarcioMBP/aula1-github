package entidades;

public class Bank {
	private int numConta;
	private String titular;
	private double saldo;
	
	
	public Bank(int numConta, String titular, double depositoInicial) {
		this.numConta = numConta;
		this.titular = titular;
		depositar(depositoInicial);
	}
	
	public Bank(int numConta, String titular) {
		this.numConta = numConta;
		this.titular = titular;
	}

	public int getNumConta() {
		return numConta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}


	public void depositar(double valor) {
		saldo+=valor;
	}
	
	public void saque(double valor) {
		saldo-=valor+5.00;
	}

	public String toString() {
		return "Account: " + numConta + ", Holder: " + titular +
				String.format(", Balance: $%.2f", saldo);
	}
}
