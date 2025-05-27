package utils;

import java.util.Scanner;
import models.Animal;
import models.Cuidador;

public class Mostrador {
	Scanner sc = new Scanner(System.in);

	// Mensaje de bienvenida
	public void mensajeInicial() {
		System.out.println("Bienvenido al sistema de gestion de bicharracos");
		System.out.println("Tenes que registrarlos para avanzar");
	}

	public void mensajeError() {
		System.out.println("Ha ocurrido un error, opción invalida");

	}

	public void menu() {
		System.out.println(
				"1- Listado de Animales \n" + "2- Registrar año cumplido de animal \n" + "3- Alimentar animal \n"
						+ "4- Mostrar un animal especificooo \n" + "5- Peso promedio \n" + "6- Salir");
	}

	public void registrarAnimales(Animal animales[]) {
		for (int i = 0; i < animales.length; i++) {
			Animal animalActual = new Animal();
			String ingresoString;
			int ingresoInt;
			double ingresoDou;

			// Ingreso nombre del animal
			System.out.println("Nombre del bixito");
			ingresoString = sc.next();
			animalActual.setNombre(ingresoString);

			// Ingreso Especie
			System.out.println("Especie?");
			ingresoString = sc.next();
			animalActual.setEspecie(ingresoString);

			// Ingreso Edad
			System.out.println("Edad?");
			ingresoInt = sc.nextInt();
			animalActual.setEdad(ingresoInt);

			// Ingreso Peso
			System.out.println("Peso?");
			ingresoDou = sc.nextDouble();
			animalActual.setPesoKg(ingresoDou);

			animales[i] = animalActual;
		}
	}

	public void seleccionMenu(int seleccion, Animal animales[], Cuidador cuidadores) {
		int opcion = seleccion;
		int indiceIngresado;
		int comidaElegida;
		Animal animalActual;

		switch (opcion) {
		case 1: // Mostrar lista
			System.out.println("Listado de animales:");
			for (int i = 0; i < animales.length; i++) {
				animalActual = animales[i];
				System.out.println("Nº " + (i + 1) + " "+animalActual.getNombre() + " - " + animalActual.getEspecie() + " - "
						+ animalActual.getPesoKg() + "kg" + animalActual.getEdad() + "años");
			}
			break;
		case 2: // Registrar que cumplio años un animal
			System.out.println("A que animal queres registar que cumplio años?");
			System.out.println("Ingresa el numero de lista");
			indiceIngresado = sc.nextInt() - 1;
			animalActual = animales[indiceIngresado];
			cuidadores.hacerCumplirAños(animalActual);
			System.out.println("Registraste un año mas a " + animalActual.getNombre());
			break;
		case 3: // Alimentar un animal
			System.out.println("A que animal de la lista vas a alimentar? Pone su numero");
			indiceIngresado = sc.nextInt() - 1;
			animalActual = animales[indiceIngresado];
			System.out.println("Con que queres alimentarlo?");
			System.out.println("Cuando le des estos alimentos va a aumentar de peso:");

			System.out.println("1- Lechuga -2KG");
			System.out.println("2- Solomillo +5KG");
			System.out.println("3- Balanceado +1KG");
			comidaElegida = sc.nextInt();
			cuidadores.alimentarAnimal(animalActual, comidaElegida);
			
			System.out.println("Alimentaste a " + animalActual.getNombre());
			break;
		case 4: // Mostrar animal especifico
			System.out.println("Que animal queres mostrar?");
			indiceIngresado = sc.nextInt() - 1;
			animalActual = animales[indiceIngresado];
			System.out.println(
					animalActual.getNombre() + " - " + animalActual.getEspecie() + " - " + animalActual.getEdad()+ "años" +  " - " + animalActual.getPesoKg()+"Kgs");
			break;
		case 5: // Peso promedio
			System.out.println("Ingresa la edad");
			int edad = sc.nextInt();
			double pesoTotal = 0;
			int cantidadEncontrada = 0;
			double promedio;
			for (int i = 0; i < animales.length; i++) {
				Animal animalActualB = animales[i];
				if (animalActualB.getEdad() == edad) {
					pesoTotal = pesoTotal + animalActualB.getPesoKg();
					cantidadEncontrada++;
				}
			}
			promedio = pesoTotal / cantidadEncontrada;

			System.out.println("Promedio de peso de los animales que tienen " + edad + " = " + promedio);
		break;
		case 6: //Mensaje Salida
			System.out.println("Gracias por usar el sistema");
			break;
		default:
			this.mensajeError();
			break;
	}
}
}
