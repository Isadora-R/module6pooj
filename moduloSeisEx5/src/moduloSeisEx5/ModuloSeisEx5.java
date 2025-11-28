package moduloSeisEx5;

import java.util.ArrayList;

interface Pagavel {
	double calcularPagamento();
}

abstract class Pessoa {
	protected String nome;
	protected String documento;

	public Pessoa(String nome, String documento) {
		this.nome = nome;
		this.documento = documento;
	}
}

class Empregado extends Pessoa implements Pagavel {
	private double salario;

	public Empregado(String nome, String documento, double salario) {
		super(nome, documento);
		this.salario = salario;
	}

	@Override
	public double calcularPagamento() {
		return salario;
	}
}

class Fornecedor extends Pessoa implements Pagavel {
	private double valorContrato;

	public Fornecedor(String nome, String documento, double valorContrato) {
		super(nome, documento);
		this.valorContrato = valorContrato;
	}

	@Override
	public double calcularPagamento() {
		return valorContrato * 0.90;
	}
}

public class ModuloSeisEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pagavel p1 = new Empregado("Maria", "123.456.789.10", 1234);
		Pagavel p2 = new Fornecedor("Empresa X", "11.222.333/4444-55", 56789);

		ArrayList<Pagavel> lista = new ArrayList<>();
		lista.add(p1);
		lista.add(p2);

		for (Pagavel p : lista) {
			System.out.println("Pagamento: R$ " + p.calcularPagamento());
		}

	}

}
