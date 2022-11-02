package cl.generation.F20221102;

public class Kinesiologo extends EquipoBasquetbol{
	/*
	 * private String nombre; 
	 * private String apellido; 
	 * private int edad;
	 */
	private String titulo;
	private String especialidad;

	public Kinesiologo() {
		super();
	}

	public Kinesiologo(String titulo, String especialidad) {
		super();
		this.titulo = titulo;
		this.especialidad = especialidad;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	@Override
	public String toString() {
		return "Kinesiologo [titulo=" + titulo + ", especialidad=" + especialidad + ", Nombre=" + getNombre()
				+ ", Apellido=" + getApellido() + ", Edad=" + getEdad() + "]";
	}

	@Override
	public void metodoImprimir() {
		System.out.println("Estoy en el metodo de la hija Kinesiologo");
	}
	
}
