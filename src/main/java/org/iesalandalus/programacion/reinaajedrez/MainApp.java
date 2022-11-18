package org.iesalandalus.programacion.reinaajedrez;

import javax.naming.OperationNotSupportedException;

import org.iesalandalus.programacion.reinaajedrez.modelo.Color;
import org.iesalandalus.programacion.reinaajedrez.modelo.Posicion;
import org.iesalandalus.programacion.reinaajedrez.modelo.Reina;

public class MainApp {

	private static Reina reina;

	public static void main(String[] args) throws OperationNotSupportedException {

		int auxiliar;

		do {

			Consola.mostrarMenu();
			auxiliar = Consola.elegirOpcionMenu();
			MainApp.ejecutarOpcion(auxiliar);
		} while (auxiliar != 4);

	}

	private static void ejecutarOpcion(int opcion) throws OperationNotSupportedException {

		switch (opcion) {
		case 1:
			crearReinaDefecto();
			mostrarReina();
			break;
		case 2:
			crearReinaColor();
			mostrarReina();

			break;
		case 3:

			mover();
			mostrarReina();

			break;

		case 4:
			Consola.despedirse();
			break;
		}

	}

	private static void crearReinaDefecto() {

		reina = new Reina();

	}

	private static void crearReinaColor() {

		reina = new Reina(Consola.elegirColor());

	}

	private static void mover() throws OperationNotSupportedException {
		if (reina == null) {
			System.out.println("No has creado una reina, tienes que crearla");
		} else {

			try {

				Consola.mostrarMenuDirecciones();

				reina.mover(Consola.elegirDireccion(), Consola.elegirPasos());

			} catch (IllegalArgumentException | OperationNotSupportedException | NullPointerException e) {
				System.out.println(e.getMessage());
			}
		}

	}

	private static void mostrarReina() {

		if (reina != null) {

			System.out.println(reina.toString());
		} 

	}

}
