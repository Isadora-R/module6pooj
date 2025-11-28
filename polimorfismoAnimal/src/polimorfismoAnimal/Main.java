package polimorfismoAnimal;

interface Animal {
	void andar();
}

class Pato implements Animal {
	@Override
	public void andar() {
		System.out.println("Pato anda como pato");
	}
}

class Gato implements Animal {
	@Override
	public void andar() {
		System.out.println("Gato anda como gato");
	}
}

class Cachorro implements Animal {
	@Override
	public void andar() {
		System.out.println("Cachorro anda como cachorro");
	}
}

public class Main {
	public static void main(String[] args) {
		Animal a1 = new Pato();
        Animal a2 = new Gato();
        Animal a3 = new Cachorro();

        a1.andar();
        a2.andar();
        a3.andar();
	}
}
