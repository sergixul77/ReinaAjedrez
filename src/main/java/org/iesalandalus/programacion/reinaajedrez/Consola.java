package org.iesalandalus.programacion.reinaajedrez;

import org.iesalandalus.programacion.reinaajedrez.modelo.Color;
import org.iesalandalus.programacion.reinaajedrez.modelo.Direccion;
import org.iesalandalus.programacion.utilidades.Entrada;

public class Consola {

	private Consola() {

	}

	public static void mostrarMenu() {

		System.out.println("1. Crear reina por defecto");
		System.out.println("2. Crear reina eligiendo el color");
		System.out.println("3. Mover");
		System.out.println("4.Salir");

	}

	public static int elegirOpcionMenu() {

		int opcionMenu;

		

		do {
			System.out.println("Introduce una opción valida por teclado");

			opcionMenu = Entrada.entero();
		} while (opcionMenu < 1 || opcionMenu > 4);

		switch (opcionMenu) {
		case 1:
			break;
		case 2:
			
			break;
		case 3:
						
			break;
		case 4:
						
			break;
		}
		return opcionMenu; // te devuelve el valor que ha introducido el usuario

	}

	public static Color elegirColor() {

		Color color = null;

		int opcionColor;

		do {

			System.out.println("Pulsa 1 para crear la reina Blanca ");
			System.out.println("Pulsa 2 para crear la reina Negra ");

			opcionColor = Entrada.entero();

		} while (opcionColor < 1 || opcionColor > 2);

		switch (opcionColor) {
		case 1:
			
			color = Color.BLANCO;

			break;
		case 2:
			
			color = Color.NEGRO;

			break;

		}
		return color;
	}

	public static void mostrarMenuDirecciones() {
		System.out.println("Estas son las siguientes opciones para moverte");
		System.out.println("1. Moverte el Norte");
		System.out.println("2. Moverte al NORESTE");
		System.out.println("3. Moverte al ESTE");
		System.out.println("4. Moverte al SURESTE");
		System.out.println("5. Moverte al SUR");
		System.out.println("6. Moverte al SUROESTE");
		System.out.println("7. Moverte al OESTE");
		System.out.println("8. Moverte al NOROESTE");

	}

	public static Direccion elegirDireccion() {

		Direccion direccion = null;

		int opcionDireccion;

		do {

			System.out.println("Introduce el número hacia donde te quieras mover");

			opcionDireccion = Entrada.entero();

		} while (opcionDireccion < 1 || opcionDireccion > 8);

		switch (opcionDireccion) {
		case 1:
			System.out.println("Has elegido moverte hacia el Norte");

			direccion = Direccion.NORTE;
			break;
		case 2:
			System.out.println("Has elegido moverte hacia el Noreste ");
			direccion = Direccion.NORESTE;
			break;
		case 3:
			System.out.println("Has elegido moverte hacia el Este");
			direccion = Direccion.ESTE;
			break;
		case 4:
			System.out.println("Has elegido moverte hacia el Sureste");

			direccion = Direccion.SURESTE;

			break;
		case 5:
			System.out.println("Has elegido moverte hacia el Sur");

			direccion = Direccion.SUR;
			break;
		case 6:
			System.out.println("Has elegido moverte hacia el Suroeste");

			direccion = Direccion.SUROESTE;
			break;
		case 7:
			System.out.println("Has elegido moverte hacia el Oeste");

			direccion = Direccion.OESTE;
			break;
		case 8:
			System.out.println("Has elegido moverte hacia el NOROESTE");

			direccion = Direccion.NOROESTE;
			break;

		}

		return direccion;

	}

	public static int elegirPasos() {

		int pasos;

		System.out.println("Elige el número de pasos para moverte el rango es (1 al 7)");

		pasos = Entrada.entero();

		return pasos;
	}

	public static void despedirse() {

		System.out.println("Hasta luego lucas!!!!");
	}

}
