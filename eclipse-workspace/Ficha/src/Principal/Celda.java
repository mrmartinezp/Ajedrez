/**
 * Esta clase define las celdas de las fichas.
 * @author: Rosa Martínez
 * @version: 0.9
 */
package Principal;

public class Celda {

	private Ficha ficha;

	/**
	 * Crea una celda a partir de una ficha.
	 * @param ficha
	 */
	public Celda(Ficha ficha) {
		this.ficha = ficha;

	}
	/**
	 * Crea una celda con una ficha a null.
	 */
	public Celda() {

		this.ficha = null;
	}
	/**
	 * Nos dice si hay ficha o no.
	 * @returnctrue si no hay ficha.
	 */
	public boolean isEmpty() {
		/*
		 * Si no hay ficha devuelve un true, y si no devuelve false.
		 */
		if (ficha == null)
			return true;
		else
			return false;
	}
	/**
	 * Modifica la ficha.
	 * @param ficha 
	 */
	public void setFicha(Ficha ficha) {
		this.ficha = ficha;
	}
	/**
	 * Muetra la ficha.
	 * @return ficha.
	 */
	public Ficha getFicha() {
		return ficha;
	}
	/**
	 * Si esta vacia muestra un espacio en blanco y si no pinta la ficha.
	 */
	@Override
	public String toString() {
		if (isEmpty())
			return " ";
		else
			return ficha.toString();
	}

}
