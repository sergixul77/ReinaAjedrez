package org.iesalandalus.programacion.reinaajedrez;

import org.iesalandalus.programacion.reinaajedrez.modelo.Color;
import org.iesalandalus.programacion.reinaajedrez.modelo.Posicion;
import org.iesalandalus.programacion.reinaajedrez.modelo.Reina;

public class MainApp {

	private static final Color Color = null;

	private Reina reina;

	public static void main(String[] args) {

		Consola.mostrarMenu();
		MainApp.ejecutarOpcion(0);

	}

	private static void ejecutarOpcion(int opcion) {
		
		switch (Consola.elegirOpcionMenu()) {
		  case 1:
		    MainApp.crearReinaDefecto();
		  
		    break;
		  case 2:
		    MainApp.crearReinaColor();
		    break;
		  case 3:
			  
			 
			  
			  
			  break;
			  
		  case 4:
			 Consola.despedirse();
			  break;
		    }

	}

	private static void crearReinaDefecto() {

		Reina reina = new Reina();

		System.out.println(reina.toString());

	}

	private static void crearReinaColor() {
		
		Reina reina = new Reina (Consola.elegirColor());
		
		System.out.println(reina);
		
	}

	private static void mover() {

	}

	private static void mostrarReina() {
				
		

	}

}
