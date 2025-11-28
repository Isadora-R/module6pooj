package moduloSeisEx4;

/*
 *
 *Crie uma classe abstrata Funcionario com os atributos nome e salario. Adicione
um método abstrato calcularBonus() que será implementado por subclasses.
Crie subclasses Gerente e Analista que implementam o método calcularBonus()
de forma distinta (por exemplo, o gerente tem um bônus de 20% e o analista
10%). No método principal, crie instâncias de Gerente e Analista e calcule os
bônus de ambos.
 */

abstract class Funcionario{
	protected String nome;
	protected double salario;
	
	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}
	
	public abstract double calcularBonus();
}

class Gerente extends Funcionario{

	public Gerente(String nome, double salario) {
		super(nome, salario);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double calcularBonus() {
		return salario * 0.2;
	}
	
}

class Analista extends Funcionario{

	public Analista(String nome, double salario) {
		super(nome, salario);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double calcularBonus() {
		return salario * 0.1;
	}
}
public class ModuloSeisEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Funcionario gerente = new Gerente("João", 12345);
        Funcionario analista = new Analista("Maria", 6789);

        System.out.println("Bônus do gerente: R$ " + gerente.calcularBonus());
        System.out.println("Bônus do analista: R$ " + analista.calcularBonus());

	}

}
