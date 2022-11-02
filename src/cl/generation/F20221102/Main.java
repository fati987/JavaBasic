package cl.generation.F20221102;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// herencia en Java
		//instanciando objetos
		Entrenador entrenador = new Entrenador ();
		entrenador.setNombre("Jhon");
		entrenador.setApellido("Doe");
		entrenador.setEdad(55);
		entrenador.setAnosExperiencia(10);
		entrenador.setEquipo("Valdivia");
		
		System.out.println(entrenador.toString());
		
		Kinesiologo kine = new Kinesiologo();
		kine.setNombre("Jane");
		kine.setApellido("Doe");
		kine.setEdad(52);
		kine.setTitulo("Kinesiologia");
		kine.setEspecialidad("Musculo");
		
		System.out.println(kine.toString());
		
		ArrayList<Basquetbolista> listaJugadores = new ArrayList<Basquetbolista>();

		Basquetbolista basket = new Basquetbolista();
		basket.setNombre("Michel");
		basket.setApellido("Pipen");
		basket.setAltura(2.15f);
		
		listaJugadores.add(basket);//agregando un objeto a la lista
		
		Basquetbolista basket2 = new Basquetbolista();
		basket2.setNombre("Steve");
		basket2.setApellido("Curry");
		basket2.setAltura(2.05f);
		
		listaJugadores.add(basket2);
		
		//recorrer lista
		for (Basquetbolista jugador : listaJugadores) {
			System.out.println(jugador.toString());
		}
	}

}
