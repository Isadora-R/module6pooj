package moduloSeisEx6;

import java.util.ArrayList;
import java.util.List;

/*
 * 
 * Crie uma classe abstrata Forma com um método abstrato calcularArea(). Crie as
classes concretas Circulo e Retangulo que herdam de Forma e implementam o
cálculo da área. Crie uma lista de Forma e adicione objetos de Circulo e
Retangulo. Implemente um método que receba essa lista e imprima a área de
cada forma, demonstrando o uso de polimorfismo com coleções.
 */

abstract class Forma {
	public abstract double calcularArea();
}

class Circulo extends Forma {
	private double raio;

	public Circulo(double raio) {
		this.raio = raio;
	}

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return Math.PI * raio * raio;
	}
}

class Retangulo extends Forma {
	private double base;
	private double altura;

	public Retangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return base * altura;
	}
}

public class ModuloSeisEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Forma> formas = new ArrayList<>();
		formas.add(new Circulo(3));
		formas.add(new Retangulo(4, 5));
		formas.add(new Circulo(6));
		formas.add(new Retangulo(7, 8));

		for (Forma f : formas) {
			System.out.println("Área: " + f.calcularArea());
		}

	}

}
