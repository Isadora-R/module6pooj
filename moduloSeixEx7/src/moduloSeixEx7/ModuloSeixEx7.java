package moduloSeixEx7;

/*
 * 
 * Crie uma interface Ferramenta com métodos usar() e manter(). Crie as classes
Martelo, Serra e ChaveDeFenda que implementam essa interface de maneiras
diferentes. Crie um método que receba um array de Ferramenta e invoque os
métodos usar() e manter() em cada ferramenta, demonstrando o uso de
polimorfismo.
 */

interface Ferramenta {
	void usar();

	void manter();
}

class Martelo implements Ferramenta {

	@Override
	public void usar() {
		// TODO Auto-generated method stub
		System.out.println("Martelando prego!!");

	}

	@Override
	public void manter() {
		// TODO Auto-generated method stub
		System.out.println("Checando o martello!");

	}

}

class Serra implements Ferramenta {

	@Override
	public void usar() {
		// TODO Auto-generated method stub
		System.out.println("Serrando madeira!");

	}

	@Override
	public void manter() {
		// TODO Auto-generated method stub
		System.out.println("Checando a serra!");

	}

}

class ChaveDeFenda implements Ferramenta {

	@Override
	public void usar() {
		// TODO Auto-generated method stub
		System.out.println("Parafusando!");

	}

	@Override
	public void manter() {
		// TODO Auto-generated method stub
		System.out.println("Checando chave de fenda.");

	}

}

public class ModuloSeixEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ferramenta[] ferramentas = {

			new Martelo(),
			new Serra(),
			new ChaveDeFenda(),
				
		};
		

		for (Ferramenta f : ferramentas) {
            f.usar();
            f.manter();
            System.out.println("----");
        }
	}

}
