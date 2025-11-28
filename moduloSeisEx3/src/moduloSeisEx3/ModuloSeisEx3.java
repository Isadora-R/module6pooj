package moduloSeisEx3;

/* 
Crie uma interface chamada Voar com um método decolar() e outra interface
chamada Nadar com um método mergulhar(). Crie uma classe Pato que
implemente ambas as interfaces. Implemente os métodos para que o pato possa
voar e nadar. No método principal, crie uma instância de Pato e invoque ambos
os métodos, demonstrando o uso de múltiplas interfaces.
 */

interface Voar{
	void decolar();
}

interface Nadar{
	void mergulhar();
}

class Pato implements Voar, Nadar{

	@Override
	public void mergulhar() {
		// TODO Auto-generated method stub
		System.out.println("O pato está mergulhando");
	}

	@Override
	public void decolar() {
		// TODO Auto-generated method stub
		System.out.println("O pato está decolando");
		
	}
	
}
public class ModuloSeisEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pato p = new Pato();
		
		p.decolar();
		p.mergulhar();
	}

}
