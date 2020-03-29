/**
 * Esta clase es la ficha Torre que extiende de la clase Ficha.
 * @author: Rosa Martínez
 * @version: 0.9
 */
package Principal;

import java.util.ArrayList;

public class Torre extends Ficha {
	/**
	 * Crea una ficha a partir de los parametros: color, tablero, coordenada. 
	 * @param color indica el color de la ficha.	
	 * @param t cada ficha tiene su tablero para saber de que fichas esta rodeada.
	 * @param c Indica el numero y la letra.
	 */
	public Torre(Color color, Tablero t, Coordenada c) {
		super();
		this.posicion = c;
		this.color = color;
		this.tablero = t;
		/*
		 * Si el color de la ficha es negro, crearemos una reina negra, por lo contrario seria blanca.
		 */
		if (color == Color.Negro) {
			this.shape = shape.Black_Torre;
		} else
			this.shape = shape.White_Torre;

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
		/*
		 * Si la coordenada esta dentro del tablero y es distinta a tu color de ficha, añadiremos la coordenada a la lista.
		 */
		if(tablero.comprobarEstaDentro(c))
			if(tablero.getCelda(c).getFicha().getColor()!=this.getColor())
				lista.add(c);

		// ABAJO//
		c = posicion.moverAbajo();
		while (tablero.comprobarEstaDentro(c) == true && tablero.getCelda(c).getFicha() == null) {
			lista.add(c);
			c = c.moverAbajo();
		}
		if(tablero.comprobarEstaDentro(c))
			if(tablero.getCelda(c).getFicha().getColor()!=this.getColor())
				lista.add(c);

		// DERECHA//
		c = posicion.moverDerecha();
		while (tablero.comprobarEstaDentro(c) == true && tablero.getCelda(c).getFicha() == null) {
			lista.add(c);
			c = c.moverDerecha();
		}
		if(tablero.comprobarEstaDentro(c))
			if(tablero.getCelda(c).getFicha().getColor()!=this.getColor())
				lista.add(c);

		// IZQUIERDA//
		c = posicion.moverIzquierda();
		while (tablero.comprobarEstaDentro(c) == true && tablero.getCelda(c).getFicha() == null) {
			lista.add(c);
			c = c.moverIzquierda();
		}
		if(tablero.comprobarEstaDentro(c))
			if(tablero.getCelda(c).getFicha().getColor()!=this.getColor())
				lista.add(c);

		return lista;

	}
}
