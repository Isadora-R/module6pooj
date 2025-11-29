package moduloSeisEx10;

abstract class Transacao implements MeioDePagamento {

	protected double valor;

	public Transacao(double valor) {
		this.valor = valor;
	}

	@Override
	public void pagar() {
		// TODO Auto-generated method stub

	}
	
	public abstract void executarTransacao();

}
