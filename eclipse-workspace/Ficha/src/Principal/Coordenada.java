/**
 * Esta clase define las coordenadas del tablero.
 * @author: Rosa Martínez
 * @version: 0.9
 */
package Principal;
	public class Coordenada {

		private char letra;
		private int numero;

	/**
	 * Crea una coordenada a partir de una letra y un numero.
	 * @param letra 
	 * @param numero
	 */
	public Coordenada(char letra, int numero) {
		this.letra = letra;
		this.numero = numero;
	}
	/**
	 * Muestra la letra y el numero.
	 */
	@Override
	public String toString() {
		return letra + "" + numero;
	}
	/**
	 * Mueve la coordenada a la derecha.
	 * @return Devuelve una nueva coordenada.
	 */
	public Coordenada moverDerecha() {
		return new Coordenada(letra, numero + 1);
	}
	/**
	 * Mueve la coordenada a la izquierda.
	 * @return Devuelve una nueva coordenada.
	 */
	public Coordenada moverIzquierda() {
		return new Coordenada(letra, numero - 1);
	}
	/**
	 * Mueve la coordenada a la arriba.
	 * @return Devuelve una nueva coordenada.
	 */
	public Coordenada moverArriba() {
		return new Coordenada((char) (letra - 1), numero);
	}
	/**
	 * Mueve la coordenada a la abajo.
	 * @return Devuelve una nueva coordenada.
	 */
	public Coordenada moverAbajo() {
		return new Coordenada((char) (letra + 1), numero);
	}
	/**
	 * Mueve la coordenada a la diagonal.
	 * @return Devuelve una nueva coordenada.
	 */
	public Coordenada moverDiagonalArribaIzquierda() {
		return (moverArriba().moverIzquierda());
	}
	/**
	 * Mueve la coordenada a la diagonal.
	 * @return Devuelve una nueva coordenada.
	 */
	public Coordenada moverDiagonalArribaDerecho() {
		return (moverArriba().moverDerecha());
	}
	/**
	 * Mueve la coordenada a la diagonal.
	 * @return Devuelve una nueva coordenada.
	 */
	public Coordenada moverDiagonalAbajoIzquierda() {
		return (moverAbajo().moverIzquierda());
	}
	/**
	 * Mueve la coordenada a la diagonal.
	 * @return Devuelve una nueva coordenada.
	 */
	public Coordenada moverDiagonalAbajoDerecho() {
		return (moverAbajo().moverDerecha());
	}
	/**
	 * Muestra la letra de la coordenada.
	 * @return Devuelve le letra.
	 */
	public char getLetra() {
		return letra;
	}
	/**
	 * Modifica la letra.
	 */
	public void setLetra(char letra) {
		this.letra = letra;
	}
	/**
	 * Muestra la numero de la coordenada.
	 * @return Devuelve el numero de la coordenada.
	 */
	public int getNumero() {
		return numero;
	}
	/**
	 * Modifica el numero.
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}
	/**
	 * Comparamos el contenido de los objetos, es decir, la letra y el numero de las coordenadas.
	 */
	public boolean equals(Object o) {

		Coordenada c = (Coordenada) o;

		if (this.letra == c.letra && this.numero == c.numero) {
			return true;
		} else
			return false;
	}

}
