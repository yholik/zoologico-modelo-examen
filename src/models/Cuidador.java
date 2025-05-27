package models;
import utils.Mostrador;

public class Cuidador {
	Mostrador mostrador = new Mostrador();
	
	public void hacerCumplirAños(Animal animales) {
		Animal animalActual = animales;
		animalActual.cumplirAños();
	}
	
	public void alimentarAnimal(Animal animales, int comidaElegida) {
		Animal animalActual = animales;
		double nuevoPeso;
		
		switch(comidaElegida) {
		case 1: //Lechuga -2KG
			nuevoPeso = animalActual.getPesoKg() - 2;
			animalActual.alimentarse(nuevoPeso);
			break;
		case 2: //Solomillo +5KG
			nuevoPeso = animalActual.getPesoKg() + 5;
			animalActual.alimentarse(nuevoPeso);
			break;
		case 3: //Balanceado +1KG
			nuevoPeso = animalActual.getPesoKg() + 1;
			animalActual.alimentarse(nuevoPeso);
			break;
		default:
			mostrador.mensajeError();
				break;
		}
		
	}
	

	
	
}
