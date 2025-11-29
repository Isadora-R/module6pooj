package moduloSeisEx10;

import java.util.ArrayList;
import java.util.List;

public class ModuloSeisEx10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Transacao> transacoes = new ArrayList<>();

		transacoes.add(new CartaoDeCredito(123.0));
		transacoes.add(new Boleto(456.0));
		transacoes.add(new CartaoDeCredito(78.9));
		transacoes.add(new Boleto(1000.0));

		for (Transacao t : transacoes) {
			t.pagar();
			t.executarTransacao();
			System.out.println("\n");
		}

	}

}
