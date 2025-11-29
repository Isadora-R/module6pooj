package moduloSeisEx8;

abstract class ContaBancaria {
	protected double saldo;

	public ContaBancaria(double saldoInicial) {
		this.saldo = saldoInicial;
	}

	public void depositar(double valor) {
		saldo += valor;
		System.out.println("Depósito de R$" + valor + " realizado. Saldo atual:: R$" + saldo);
	}

	public abstract double calcularRendimento();
}