package moduloSeisEx10;

public class Boleto extends Transacao {

	public Boleto(double valor) {
		super(valor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void pagar() {
		System.out.println("Gerando boleto no valor de R$" + valor + ".");
	}

	@Override
	public void executarTransacao() {
		System.out.println("Boleto pago.");
	}

}
