package cl.generation.F20221102;

public class Basquetbolista extends EquipoBasquetbol {
	private Float altura;
	private Float peso;

	/*
	 * private String nombre; 
	 * private String apellido; 
	 * private int edad;
	 */
	public Basquetbolista() {
		super();
	}

	public Basquetbolista(Float altura, Float peso) {
		super();
		this.altura = altura;
		this.peso = peso;
	}

	public Float getAltura() {
		return altura;
	}

	public void setAltura(Float altura) {
		this.altura = altura;
	}

	public Float getPeso() {
		return peso;
	}

	public void setPeso(Float peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Basquetbolista [altura=" + altura + ", Nombre=" + getNombre() + ", Apellido=" + getApellido()
				+ "]";
	}
	
	@Override
	public void metodoImprimir() {
		System.out.println("Estoy en el metodo de la hija Basquetbolista");
	}
	
}
