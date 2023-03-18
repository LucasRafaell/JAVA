package entities;

public class ContaBancaria {
	
	private final int NUMERODACONTA;
	private String nomeDoTitular;
	private double saldo;
	private final double TAXA = 5.00;
		
	public ContaBancaria(int numeroDaConta, String nomeDoTitular) {
		NUMERODACONTA = numeroDaConta;
		this.nomeDoTitular = nomeDoTitular;
	}
	
	public ContaBancaria(int numeroDaConta, String nomeDoTitular, double depInicial) {
		NUMERODACONTA = numeroDaConta;
		this.nomeDoTitular = nomeDoTitular;
		deposito(depInicial);
	}

	public String getNomeDoTitular() {
		return nomeDoTitular;
	}

	public void setNomeDoTitular(String nomeDoTitular) {
		this.nomeDoTitular = nomeDoTitular;
	}

	public double getSaldo() {
		return saldo;
	}	

	public int getNUMERODACONTA() {
		return NUMERODACONTA;
	}

	public void deposito(double valor) {
		saldo += valor;
	}
	
	public void saque(double valor) {
		saldo -=  valor + TAXA;
	}
	
	

	@Override
	public String toString() {
		return "Account " + NUMERODACONTA 
				+ ", Holder: " + nomeDoTitular 
				+ ", Balance: $ " + String.format("%.2f", saldo);
	}
	
	
	
	
}
