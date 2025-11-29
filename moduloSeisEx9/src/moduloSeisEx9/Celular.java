package moduloSeisEx9;

public class Celular extends Dispositivo implements Eletronico {

	public Celular(String marca, String modelo) {
		super(marca, modelo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void ligar() {
		// TODO Auto-generated method stub
		System.out.println("Ligando o celular: " + marca + " " + modelo);
	}

	@Override
	public void desligar() {
		// TODO Auto-generated method stub
		System.out.println("Desligando o " + modelo);
		
	}

}
