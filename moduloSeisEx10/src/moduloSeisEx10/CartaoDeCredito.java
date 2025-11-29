package moduloSeisEx10;

public class CartaoDeCredito extends Transacao {

	public CartaoDeCredito(double valor) {
		super(valor);
		// TODO Auto-generated constructor stub
	}
	
	@Override
    public void pagar() {
        System.out.println("Pagando R$" + valor + " com Cartão de Crédito.");
    }

    @Override
    public void executarTransacao() {
        System.out.println("Transação de crédito aprovada.");
    }

}
