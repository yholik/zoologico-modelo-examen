package mains;
import java.util.Scanner;
import models.Animal;
import models.Cuidador;
import utils.Mostrador;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Mostrador mostrador = new Mostrador();
		Cuidador  cuidadores = new Cuidador();

		Animal animales[] = new Animal[2];
		
		mostrador.mensajeInicial();
		mostrador.registrarAnimales(animales);
		
		int seleccion;
		do {
		mostrador.menu();
		seleccion = sc.nextInt();
		mostrador.seleccionMenu(seleccion, animales, cuidadores);		
		}while(seleccion != 6);
		
		sc.close();
	}

}
