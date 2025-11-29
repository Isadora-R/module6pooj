package moduloSeisEx9;

public class Tablet extends Dispositivo implements Eletronico{

	public Tablet(String marca, String modelo) {
		super(marca, modelo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void ligar() {
		// TODO Auto-generated method stub
		System.out.println("Ligando o tablet: " + marca + " " + modelo);
	}

	@Override
	public void desligar() {
		// TODO Auto-generated method stub
		System.out.println("Desligando o " + modelo);
		
	}

}
