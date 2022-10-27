package cl.generation.F20221027;

public class Auto {
	// atributos
	private String marca;
	private String color;
	private String modelo;
	private Float cilindrada;
	private Float rendimiento;
	private Float velocidad;
	
	//Constructor
	//nos permite instanciar al objeto
	//nos permite inicializar los atributos
	public Auto() {
		super();
	}

	public Auto(String marca, String color, String modelo, Float cilindrada, Float rendimiento, Float velocidad) {
		super();
		this.marca = marca;
		this.color = color;
		this.modelo = modelo;
		this.cilindrada = cilindrada;
		this.rendimiento = rendimiento;
		this.velocidad = velocidad;
	}

	//getter y setters
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Float getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(Float cilindrada) {
		this.cilindrada = cilindrada;
	}

	public Float getRendimiento() {
		return rendimiento;
	}

	public void setRendimiento(Float rendimiento) {
		this.rendimiento = rendimiento;
	}

	public Float getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(Float velocidad) {
		this.velocidad = velocidad;
	}

	//metodos objeto
	public void avanzar() {
		System.out.println("Estoy en el metodo del obejto");
	}

	@Override
	public String toString() {
		return "Auto [marca=" + marca + ", color=" + color + ", modelo=" + modelo + ", cilindrada=" + cilindrada
				+ ", rendimiento=" + rendimiento + ", velocidad=" + velocidad + ", getMarca()=" + getMarca()
				+ ", getColor()=" + getColor() + ", getModelo()=" + getModelo() + ", getCilindrada()=" + getCilindrada()
				+ ", getRendimiento()=" + getRendimiento() + ", getVelocidad()=" + getVelocidad() + "]";
	}
	
}
