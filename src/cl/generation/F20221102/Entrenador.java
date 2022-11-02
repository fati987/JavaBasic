package cl.generation.F20221102;

public class Entrenador extends EquipoBasquetbol { //extends estamos heredando
	/*
	 * private String nombre; 
	 * private String apellido; 
	 * private int edad;
	 */
	private int anosExperiencia;
	private String equipo;

	public Entrenador() {
		super();
	}

	public Entrenador(int anosExperiencia, String equipo) {
		super();
		this.anosExperiencia = anosExperiencia;
		this.equipo = equipo;
	}

	public Entrenador(String nombre, String apellido, int edad, int anosExperiencia, String equipo) {
		super(nombre, apellido, edad);
		this.anosExperiencia = anosExperiencia;
		this.equipo = equipo;
	}

	public int getAnosExperiencia() {
		return anosExperiencia;
	}

	public void setAnosExperiencia(int anosExperiencia) {
		this.anosExperiencia = anosExperiencia;
	}

	public String getEquipo() {
		return equipo;
	}

	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}

	@Override
	public String toString() {
		return "Entrenador [anosExperiencia=" + anosExperiencia + ", equipo=" + equipo + ", Nombre=" + getNombre()
				+ ", Apellido=" + getApellido() + ", Edad=" + getEdad() + "]";
	}
	
	/*@Override
	public void metodoImprimir() {
		System.out.println("Estoy en el metodo de la hija Entrenador");
	}*/
}
