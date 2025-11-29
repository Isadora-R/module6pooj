package moduloSeisEx8;

public class ModuloSeisEx8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ContaBancaria poupanca = new ContaPoupanca(1000);
	     ContaBancaria corrente = new ContaCorrente(1000);

	     System.out.println(":Teste Conta Poupança:");
	     poupanca.depositar(500);
	     System.out.println("Rendimento: R$" + poupanca.calcularRendimento());

	     System.out.println("\nTeste na Conta Corrente:");
	     corrente.depositar(500);
	     System.out.println("Rendimento: R$" + corrente.calcularRendimento());

	}

}
