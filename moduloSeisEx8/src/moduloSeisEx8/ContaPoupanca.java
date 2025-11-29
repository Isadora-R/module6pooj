package moduloSeisEx8;

class ContaPoupanca extends ContaBancaria {
	private double taxaRendimento = 0.05;

	public ContaPoupanca(double saldoInicial) {
		super(saldoInicial);
	}

	@Override
	public double calcularRendimento() {
		return saldo * taxaRendimento;
	}
}
