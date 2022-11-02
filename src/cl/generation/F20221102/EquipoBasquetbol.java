package cl.generation.F20221102;

public class EquipoBasquetbol {
	private String nombre;
	private String apellido;
	private int edad;

	public EquipoBasquetbol() {
		super();

	}

	public EquipoBasquetbol(String nombre, String apellido, int edad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "EquipoBasquetbol [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + "]";
	}

	public void metodoImprimir() {
		System.out.println("Estoy en el metodo de la super clase");
	}
	
}
