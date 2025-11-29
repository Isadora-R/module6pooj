package moduloSeisEx8;

class ContaCorrente extends ContaBancaria {

	public ContaCorrente(double saldoInicial) {
		super(saldoInicial);
	}

	@Override
	public double calcularRendimento() {
		return 0;
	}
}