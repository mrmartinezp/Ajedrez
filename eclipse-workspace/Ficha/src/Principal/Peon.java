/**
 * Esta clase es la ficha Peon que extiende de la clase Ficha.
 * @author: Rosa Martínez
 * @version: 0.9
 */
package Principal;

import java.util.ArrayList;
import java.util.Iterator;

import Principal.Ficha.Color;
import Principal.Ficha.Shape;

public class Peon extends Ficha {
	/**
	 * Crea una ficha a partir de los parametros: color, tablero, coordenada. 
	 * @param color indica el color de la ficha.	
	 * @param t cada ficha tiene su tablero para saber de que fichas esta rodeada.
	 * @param c Indica el numero y la letra.
	 */
	public Peon(Color color, Tablero t, Coordenada c) {
		super();
		this.posicion = c;
		this.color = color;
		this.tablero = t;
		/*
		 * Si el color de la ficha es negro, crearemos una reina negra, por lo contrario seria blanca.
		 */
		if (color == Color.Negro) {
			this.shape = shape.Black_Peon;
		} else
			this.shape = shape.White_Peon;

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
		c = posicion.moverArriba();
		while (tablero.comprobarEstaDentro(c) == true && tablero.getCelda(c).getFicha() == null) {
			lista.add(c);
			c = c.moverArriba();
		}
		return lista;
	}
	
	
	
}
