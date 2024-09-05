package principal;

import entidade.Cachorro;
import entidade.Gato;
import entidade.Vaca;

public class Main {

	public static void main(String[] args) {
		
		Cachorro c = new Cachorro();
		System.out.println(c.emitirSom());
	
		Gato g = new Gato();
		System.out.println(g.emitirSom());
		
		Vaca v = new Vaca();
		System.out.println(v.emitirSom());
	}
}
