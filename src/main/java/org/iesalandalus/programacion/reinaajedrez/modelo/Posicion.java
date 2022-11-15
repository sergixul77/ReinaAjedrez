package org.iesalandalus.programacion.reinaajedrez.modelo;

import java.util.Objects;

public class Posicion {

	private int fila;

	private char columna;

	private static final int MIN_FILA = 1;

	private static final int MAX_FILA = 8;

	private static final char MIN_COLUMNA = 'a';

	private static final char MAX_COLUMNA = 'h';

	public Posicion(int fila, char columna) {
		setFila(fila);
		setColumna(columna);

	}

	// Constructor copia

	public Posicion(Posicion posicion) {

		fila = posicion.getFila();
		columna = posicion.getColumna();
	}

	// Fin del constructor copia

	public int getFila() {
		return fila;
	}

	private void setFila(int fila) {
		

		if (fila < MIN_FILA) {
			throw new IllegalArgumentException("La pieza se sale del tablero.");
		} else if (fila > MAX_FILA) {
			throw new IllegalArgumentException("La pieza se sale del tablero");
		}

		this.fila = fila;
	}

	public char getColumna() {
		return columna;
	}

	private void setColumna(char columna) {
		
		if (columna < MIN_COLUMNA) {
			throw new IllegalArgumentException("La pieza se sale del tablero majo , pon un valor mas grande.");
		} else if (columna > MAX_COLUMNA) {
			throw new IllegalArgumentException("La pieza se sale del tablero , pon un valor mas pequeño por favor");
		}

		this.columna = columna;
	}

	@Override
	public int hashCode() {
		return Objects.hash(columna, fila);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Posicion other = (Posicion) obj;
		return columna == other.columna && fila == other.fila;
	}

	@Override
	public String toString() {
		return String.format("fila=%s, columna=%s", fila, columna);
	}

}
