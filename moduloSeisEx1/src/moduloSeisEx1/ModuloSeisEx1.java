package moduloSeisEx1;

abstract class Animal {
    abstract void fazerSom();
}


class Cachorro extends Animal {
    @Override
    void fazerSom() {
        System.out.println("Cachorro faz som de cachorro: auauau");
    }
}

class Gato extends Animal {
    @Override
    void fazerSom() {
        System.out.println("Gato faz som de gato: miauu");
    }
}

class Pato extends Animal {
    @Override
    void fazerSom() {
        System.out.println("Pato faz som de pato: quack");
    }
}

class SomDosAnimais {
    void emitirSom(Animal animal) {
        animal.fazerSom();
    }
}


public class ModuloSeisEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SomDosAnimais som = new SomDosAnimais();

        Animal c = new Cachorro();
        Animal g = new Gato();
        Animal p = new Pato();

        som.emitirSom(c);
        som.emitirSom(g);
        som.emitirSom(p);

	}

}
