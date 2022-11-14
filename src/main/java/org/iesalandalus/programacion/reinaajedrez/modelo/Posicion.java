package org.iesalandalus.programacion.reinaajedrez.modelo;

public class Posicion {
	
	private int fila ;
	
	private char columna;

	
	private static final int MIN_fila = 1;
	
	private static final int MAX_fila = 8;
	
	private static final char MIN_columna = 'a';

	
	private static final char  MAX_columna = 'h';
	
	
	
	
	
	
	
	public int getFila() {
		return fila;
	}

	private void setFila(int fila) {
		this.fila = fila;
		
		if (fila < MIN_fila) {
			throw new IllegalArgumentException("La pieza se sale del tablero.");
		} else if (fila > MAX_fila) {
			throw new IllegalArgumentException("La pieza se sale del tablero");
		}
		
		this.fila = fila;
	}

	public char getColumna() {
		return columna;
	}

	private void setColumna(char columna) {
		this.columna = columna;
		
		if (columna < MIN_columna) {
			throw new IllegalArgumentException("La pieza se sale del tablero majo , pon un valor mas grande.");
		} else if ( columna > MAX_columna) {
			throw new IllegalArgumentException("La pieza se sale del tablero , pon un valor mas pequeño IDIOTA");
		}
	}
	
	
	
	

}
