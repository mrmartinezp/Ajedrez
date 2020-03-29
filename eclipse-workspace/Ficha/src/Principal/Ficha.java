/**
 * Esta clase define las fichas como abstractas ya que existen tipos de fichas con su forma y color.
 * @author: Rosa Martínez
 * @version: 0.9
 */

package Principal;

import java.util.ArrayList;


public abstract class Ficha {
	/**
	 * Te da el tipo de ficha, color y el nombre.
	 */
	public static enum Shape {
		White_Queen("\u2655", Color.Blanco), White_King("\u2654", Color.Blanco), White_Alfil("\u2657", Color.Blanco),
		White_Caballo("\u2658", Color.Blanco), White_Torre("\u2656", Color.Blanco), White_Peon("\u2659", Color.Blanco),

		Black_Queen("\u265B", Color.Blanco), Black_King("\u265A", Color.Blanco), Black_Alfil("\u265D", Color.Blanco),
		Black_Caballo("\u265E", Color.Blanco), Black_Torre("\u265C", Color.Blanco), Black_Peon("\u265F", Color.Blanco);

		private String forma;
		private Color color;
		/**
		 * Constructor que te devuelve la forma de la ficha junto a su color.
		 * @param forma describe la forma de la ficha 
		 * @param color nos indica el color de la ficha --Blanco,negro
		 */
		Shape(String forma, Color color) {
			this.forma = forma;
			this.color = color;
		}
		/**
		 * Muestra el nombre de la ficha.
		 */
		public String getForma() {
			return this.name();
		}
		/**
		 *  Muestra la forma de la ficha.
		 */
		public String toString() {
			return forma;
		}
	}

	/**
	 * Se establece el color de las fichas.
	 */
	public static enum Color {
		Blanco, Negro;
	}
	/**
	 * Se muestra la forma, el color y su nombre.
	 */
	@Override
	public String toString() {
		return shape.toString();
	}

	protected Shape shape;
	protected Color color;
	protected Tablero tablero;
	protected Coordenada posicion;
	/**
	 * Es una lista donde se guarda una serie de coordenadas para los movimientos de las fichas. 
	 */
	protected abstract ArrayList<Coordenada> movimientosPosibles();
	/**
	 * Se obtiene el color de la ficha 
	 */
	public Color getColor() {
		return color;
	}
	/** 
     * Se busca en la lista de movimientos posibles si existen las coordenadas introducidas.
     * @param Coordenada c Se introduce el numero y la letra de la coordenada.
     */
	public boolean calcularMovimientos(Coordenada c) {

		if (movimientosPosibles().contains(c)) {
			return true;
		} else
			return false;
	}
	/** 
     * En este metodo te devuelve si se puede mover la ficha o no mediante una coordenada y la lista de movimientos posibles,
     * si se puede mover y hay una ficha del otro color, llamas al metodo matar y si no hay ficha simplemente se mueve.
     * @param Coordenada c Se introduce el numero y la letra de la coordenada.
     */
	public boolean moverFicha(Coordenada c) {

		System.out.println(movimientosPosibles());

		if (movimientosPosibles().contains(c) == true) {

			if (tablero.getCelda(c).getFicha() != null)
				tablero.matar(tablero.getCelda(c).getFicha());

			tablero.getCelda(c).setFicha(this);
			tablero.getCelda(posicion).setFicha(null);
			posicion = c;
			return true;

		} else
			return false;
	}
}
