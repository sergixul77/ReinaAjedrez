package org.iesalandalus.programacion.reinaajedrez.modelo;

import javax.naming.OperationNotSupportedException;

public class Reina {

	private Color color;

	private Posicion posicion;

	public Reina() {

		setColor(color.BLANCO);
	}

	public Reina(Color color) {
		setColor(color);

		if (color == null) {
			throw new NullPointerException("ERROR: El color no puede ser nulo.");
		}
		setColor(color);
	}

	public Color getColor() {
		return color;
	}

	private void setColor(Color color) {

		if (color == Color.BLANCO) {
			this.posicion = new Posicion(1, 'd');
		}
		if (color == Color.NEGRO) {
			this.posicion = new Posicion(8, 'd');
		}

		this.color = color;
	}

	public Posicion getPosicion() {
		return new Posicion(posicion);
	}

	private void setPosicion(Posicion posicion) {

		this.posicion = new Posicion(posicion);
	}

	public void mover(Direccion direccion, int pasos) throws OperationNotSupportedException {

		if (direccion == null) {
			throw new NullPointerException("ERROR: La dirección no puede ser nula.");
		}

		if (pasos < 1 || pasos > 7) {

			throw new NullPointerException("Los pasos que has introducido son erroneos, te sales del tablero ");

		}
		

	}

	@Override
	public String toString() {
		return String.format("color=%s, posicion=%s", color, posicion);
	}

}
