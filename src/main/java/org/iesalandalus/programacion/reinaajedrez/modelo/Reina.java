package org.iesalandalus.programacion.reinaajedrez.modelo;

public class Reina {

	private Color color;

	private Posicion posicion;
	
	
	
	
	
	public Reina () {
		
		color = new Color ("blaco");
	}
	
	
	
	
	
	

	public Color getColor() {
		return color;
	}

	private void setColor(Color color) {

		if (color == null) {
			throw new IllegalArgumentException("El color que has puesto es nulo");
		}

		this.color = color;
	}

	public Posicion getPosicion() {
		return posicion;
	}

	private void setPosicion(Posicion posicion) {
		if (posicion == null) {

			throw new IllegalArgumentException("La posicion que has introducido es nula");
		}
		this.posicion = posicion;
	}
	
	

}
