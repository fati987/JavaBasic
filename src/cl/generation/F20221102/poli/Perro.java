package cl.generation.F20221102.poli;

public class Perro extends Mascota {

	private String sonido;

	public Perro() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Perro(String raza, String nombre, String sexo) {
		super(raza, nombre, sexo);
		// TODO Auto-generated constructor stub
	}

	public Perro(String sonido) {
		super();
		this.sonido = sonido;
	}

	public Perro(String raza, String nombre, String sexo, String sonido) {
		super(raza, nombre, sexo);
		this.sonido = sonido;
	}

	public String getSonido() {
		return sonido;
	}

	public void setSonido(String sonido) {
		this.sonido = sonido;
	}

	@Override
	public String toString() {
		return "Perro [sonido=" + sonido + "]";
	}


	public void emitirSonido() {
		System.out.println("El sonido (ladrido) del perro es guau");
	}
}
