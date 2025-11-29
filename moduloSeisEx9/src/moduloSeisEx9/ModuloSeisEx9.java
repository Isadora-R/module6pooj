package moduloSeisEx9;

import java.util.ArrayList;
import java.util.List;

public class ModuloSeisEx9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Eletronico> dispositivos = new ArrayList<>();

		dispositivos.add(new Celular("Samsung", "Galaxy S24"));
		dispositivos.add(new Tablet("Apple", "iPad"));
		dispositivos.add(new Celular("Apple", "iPhone"));
		dispositivos.add(new Tablet("Samsung", "Galaxy Tab"));

		for (Eletronico e : dispositivos) {
			e.ligar();
			e.desligar();
			System.out.println("\n");
		}

	}

}
