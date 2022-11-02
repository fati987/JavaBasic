package cl.generation.F20221102.interfaces;

public class Main {

	public static void main(String[] args) {
		// interfaces
		// clases abstractas (no se puede instanciar)
		// Animal animal = new Animal();
		Caballo caballo = new Caballo();
		caballo.setAltura(2.05f);

		Humano humano = new Humano();
		humano.metodoEnAnimal();

		Leon leon = new Leon();
		leon.setAltura(0.8f);
		leon.setPeso(200f);
		// imprimir come carne
		leon.metodoEnAnimal();
		leon.comer();
		// imprimir los valores seteados
		System.out.println("Altura " + leon.getAltura());
		System.out.println("Peso " + leon.getPeso());
		System.out.println(leon.toString());

		Persona persona = new Persona();
		persona.metodoEnAnimal();
	}

}
