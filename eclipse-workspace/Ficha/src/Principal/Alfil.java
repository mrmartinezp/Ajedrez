/**
 * Esta clase es la ficha Alfil que extiende de la clase Ficha.
 * @author: Rosa Martínez
 * @version: 0.9
 */
package Principal;

import java.util.ArrayList;

import Principal.Ficha.Color;
import Principal.Ficha.Shape;

public class Alfil extends Ficha {
	/**
	 * Crea una ficha a partir de los parametros: color, tablero, coordenada. 
	 * @param color indica el color de la ficha.	
	 * @param t cada ficha tiene su tablero para saber de que fichas esta rodeada.
	 * @param c Indica el numero y la letra.
	 */
	public Alfil(Color color, Tablero t, Coordenada c) {
		super();
		this.posicion = c;
		this.color = color;
		this.tablero = t;
		/*
		 * Si el color de la ficha es negro, crearemos una reina negra, por lo contrario seria blanca.
		 */
		if (color == Color.Negro) {
			this.shape = shape.Black_Alfil;
		} else
			this.shape = shape.White_Alfil;

		t.getCelda(posicion).setFicha(this);
	}
	/**
	 * Obtenemos una lista de coordenadas posibles que las calculamos a partir de las coordenadas.
	 */
	public ArrayList<Coordenada> movimientosPosibles() {

		ArrayList<Coordenada> lista = new ArrayList<Coordenada>();
		Coordenada c;
		/*
		 * Movemos en diagonal, arriba e izquierda, y mientras que no se haya salido del tablero y no haya ninguna ficha, añadiremos
		 * en la lista las coordenadas posibles.
		 */
		// ARRIBA//
		c = posicion.moverDiagonalArribaIzquierda();
		while (tablero.comprobarEstaDentro(c) == true && tablero.getCelda(c).getFicha() == null) {
			lista.add(c);
			c = c.moverDiagonalAbajoIzquierda();
		}

		// ARRIBA//
		c = posicion.moverDiagonalArribaDerecho();
		while (tablero.comprobarEstaDentro(c) == true && tablero.getCelda(c).getFicha() == null) {
			lista.add(c);
			c = c.moverDiagonalAbajoDerecho();
		}

		// ABAJO//
		c = posicion.moverDiagonalAbajoIzquierda();
		while (tablero.comprobarEstaDentro(c) == true && tablero.getCelda(c).getFicha() == null) {
			lista.add(c);
			c = c.moverDiagonalAbajoIzquierda();
		}

		// ABAJO//
		c = posicion.moverDiagonalArribaDerecho();
		while (tablero.comprobarEstaDentro(c) == true && tablero.getCelda(c).getFicha() == null) {
			lista.add(c);
			c = c.moverDiagonalAbajoDerecho();
		}

		return lista;

	}
}
