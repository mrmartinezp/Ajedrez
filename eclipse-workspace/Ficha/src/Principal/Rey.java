/**
 * Esta clase es la ficha Rey que extiende de la clase Ficha.
 * @author: Rosa Martínez
 * @version: 0.9
 */
package Principal;

import java.util.ArrayList;

import Principal.Ficha.Color;
import Principal.Ficha.Shape;

public class Rey extends Ficha{
	/**
	 * Crea una ficha a partir de los parametros: color, tablero, coordenada. 
	 * @param color indica el color de la ficha.	
	 * @param t cada ficha tiene su tablero para saber de que fichas esta rodeada.
	 * @param c Indica el numero y la letra.
	 */
	public Rey(Color color,Tablero t, Coordenada c) {
		super();
		this.posicion=c;
		this.color=color;
		this.tablero=t;
		/*
		 * Si el color de la ficha es negro, crearemos una reina negra, por lo contrario seria blanca.
		 */
		if(color == Color.Negro) {
			this.shape= shape.Black_King;
		}else
			this.shape= shape.White_King;		
	
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
		/*
		 * Si la coordenada esta dentro del tablero y es distinta a tu color de ficha, añadiremos la coordenada a la lista.
		 */
		if(tablero.comprobarEstaDentro(c))
			if(tablero.getCelda(c).getFicha().getColor()!=this.getColor())
				lista.add(c);

		// ARRIBA//
		c = posicion.moverDiagonalArribaDerecho();
		while (tablero.comprobarEstaDentro(c) == true && tablero.getCelda(c).getFicha() == null) {
			lista.add(c);
			c = c.moverDiagonalAbajoDerecho();
		}
		if(tablero.comprobarEstaDentro(c))
			if(tablero.getCelda(c).getFicha().getColor()!=this.getColor())
				lista.add(c);

		// ABAJO//
		c = posicion.moverDiagonalAbajoIzquierda();
		while (tablero.comprobarEstaDentro(c) == true && tablero.getCelda(c).getFicha() == null) {
			lista.add(c);
			c = c.moverDiagonalAbajoIzquierda();
		}
		if(tablero.comprobarEstaDentro(c))
			if(tablero.getCelda(c).getFicha().getColor()!=this.getColor())
				lista.add(c);

		// ABAJO//
		c = posicion.moverDiagonalArribaDerecho();
		while (tablero.comprobarEstaDentro(c) == true && tablero.getCelda(c).getFicha() == null) {
			lista.add(c);
			c = c.moverDiagonalAbajoDerecho();
		}
		if(tablero.comprobarEstaDentro(c))
			if(tablero.getCelda(c).getFicha().getColor()!=this.getColor())
				lista.add(c);

		// ARRIBA//
		c = posicion.moverArriba();
		while (tablero.comprobarEstaDentro(c) == true && tablero.getCelda(c).getFicha() == null) {
			lista.add(c);
			c = c.moverArriba();
		}
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
