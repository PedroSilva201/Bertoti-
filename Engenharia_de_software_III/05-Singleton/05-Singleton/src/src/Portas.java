package src;

public class Portas {

	private static Portas uniqueInstance = new Portas();

	private Portas() {
	}

	public static Portas getInstance() {
		return uniqueInstance;
	}
}
/*Codigo base:
 * package src;
public class Singleton {

	private static Singleton uniqueInstance = new Singleton();

	private Singleton() {
	}

	public static Singleton getInstance() {
		return uniqueInstance;
	}
}
referencia bibliografica: https://www.devmedia.com.br/padrao-de-projeto-singleton-em-java/26392
https://pt.wikipedia.org/wiki/Singleton#:~:text=Singleton%20%C3%A9%20um%20%28anti%20-%29%20padr%C3%A3o%20de%20projeto,conjunto%20%28entidade%20matem%C3%A1tica%29%20que%20contenha%20apenas%20um%20elemento.
https://refactoring.guru/pt-br/design-patterns/singleton*/
 
