package models;

public class Animal {
	private String nombre;
	private String especie;
	private int edad;
	private double pesoKg;
	private int vecesComidas;
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getPesoKg() {
		return pesoKg;
	}

	public void setPesoKg(double pesoKg) {
		this.pesoKg = pesoKg;
	}

	public int getVecesComidas() {
		return vecesComidas;
	}

	public void setVecesComidas(int vecesComidas) {
		this.vecesComidas = vecesComidas;
	}

	public void alimentarse(double comidaElegida) {
		this.pesoKg = comidaElegida;
	}
	
	public void cumplirAños() {
		this.edad++;
	}
	
	
}
