package cl.generation.F20221102.interfaces;

public abstract class Animal {
	private Float altura;
	private float peso;

	public Animal() {
		super();
	}

	public Animal(Float altura, float peso) {
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

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	/*public void metodoEnAnimal() {
		System.err.println("Estoy en el metodo de animal");
	}*/
	public abstract void metodoEnAnimal();//definicon del metodo
	
	}
