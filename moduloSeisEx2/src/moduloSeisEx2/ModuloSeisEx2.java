package moduloSeisEx2;

/*
Crie uma interface chamada Transporte com métodos mover() e parar().
Implemente essa interface nas classes Carro e Bicicleta. Crie uma classe
Garagem que tenha um método adicionarTransporte(Transporte t). No método
principal, crie objetos Carro e Bicicleta, adicione-os à Garagem e chame os
métodos mover() e parar().
 */

interface Transporte {
	void mover();
	
	void parar();
}

class Carro implements Transporte{

	@Override
	public void mover() {
		// TODO Auto-generated method stub
		System.out.println("O carro está movendo!!");
	}

	@Override
	public void parar() {
		// TODO Auto-generated method stub
		System.out.println("O carro está parado!!");
		
	}
	
}

class Biscicleta implements Transporte{

	@Override
	public void mover() {
		// TODO Auto-generated method stub
		System.out.println("A biscicleta está se movendo!");
		
	}

	@Override
	public void parar() {
		// TODO Auto-generated method stub
		System.out.println("A biscicleta está parada!!");
		
	}
	
}

class Garagem{
	public void adicionarTransporte(Transporte t) {
		System.out.println("Transporte na garagem: " + t.getClass().getSimpleName());
        
        t.mover();
        t.parar();
        System.out.println();
	}
}

public class ModuloSeisEx2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carro carro = new Carro();
		Biscicleta biscicleta = new Biscicleta();
		
		Garagem garagem = new Garagem();
		
		garagem.adicionarTransporte(biscicleta);
		garagem.adicionarTransporte(carro);
		
	}

}
