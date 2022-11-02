package cl.generation.F20221102.poli;

public class Mascota {
	// atributo
	private String raza;
	private String nombre;
	private String sexo;

	// constructores
	public Mascota() {
		super();
	}

	public Mascota(String raza, String nombre, String sexo) {
		super();
		this.raza = raza;
		this.nombre = nombre;
		this.sexo = sexo;
	}

	// getter and setter
	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	// toString

	@Override
	public String toString() {
		return "Mascota [raza=" + raza + ", nombre=" + nombre + ", sexo=" + sexo + "]";
	}

	public void emitirSonido() {
		System.out.println("El sonido es ...");
	}

	//polimorfismo parametrico o SOBRECARGA DE METODO
	public void horasSiesta() {
		System.out.println("la mascota no duerme");
	}

	public void horasSiesta(int horas) {
		System.out.println("la mascota duerme " + horas + " horas");
	}
	
	public void horasSiesta(float horas) {
		System.out.println("la mascota duerme " + horas + " horas");
	}
}
