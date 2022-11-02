package cl.generation.F20221102;

import cl.generation.F20221102.poli.Gato;
import cl.generation.F20221102.poli.Mascota;
import cl.generation.F20221102.poli.Perro;

public class PoliMine {

	public static void main(String[] args) {

		Mascota mascota = new Mascota();
		mascota.emitirSonido();

		Perro kita = new Perro();
		kita.emitirSonido();

		Gato emma = new Gato();
		emma.emitirSonido();

		/* Polimorfismo */
		/*una super clase se comporta como una clase hija, pero no lo es
		debe existir herencia*/
		Mascota patana = new Perro();
		patana.emitirSonido();

		Mascota pascual = new Gato();
		pascual.emitirSonido();
		
		pascual.horasSiesta(16.2f);
	}

}
