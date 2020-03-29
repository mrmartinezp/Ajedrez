/**
 * Esta clase es la ficha Caballo que extiende de la clase Ficha.
 * @author: Rosa Martínez
 * @version: 0.9
 */
package Principal;

import java.util.ArrayList;

import Principal.Ficha.Color;
import Principal.Ficha.Shape;

public class Caballo extends Ficha{
	/**
	 * Crea una ficha a partir de los parametros: color, tablero, coordenada. 
	 * @param color indica el color de la ficha.	
	 * @param t cada ficha tiene su tablero para saber de que fichas esta rodeada.
	 * @param c Indica el numero y la letra.
	 */
	public Caballo(Color color,Tablero t, Coordenada c) {
		super();
		this.posicion=c;
		this.color=color;
		this.tablero=t;
		/*
		 * Si el color de la ficha es negro, crearemos una reina negra, por lo contrario seria blanca.
		 */
		if(color == Color.Negro) {
			this.shape= shape.Black_Caballo;
		}else
			this.shape= shape.White_Caballo;		
	
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
		// IZQUIERDAARRIBA//
		c = posicion.moverIzquierda().moverArriba();
		while (tablero.comprobarEstaDentro(c) == true && tablero.getCelda(c).getFicha() == null) {
			lista.add(c);
			c = c.moverIzquierda().moverArriba();
		}
		/*
		 * Si la coordenada esta dentro del tablero y es distinta a tu color de ficha, añadiremos la coordenada a la lista.
		 */
		if(tablero.comprobarEstaDentro(c))
			if(tablero.getCelda(c).getFicha().getColor()!=this.getColor())
				lista.add(c);

		// ARRIBAIZQUIERDA//
		c = posicion.moverArriba().moverIzquierda();
		while (tablero.comprobarEstaDentro(c) == true && tablero.getCelda(c).getFicha() == null) {
			lista.add(c);
			c = c.moverArriba().moverIzquierda();
		}
		if(tablero.comprobarEstaDentro(c))
			if(tablero.getCelda(c).getFicha().getColor()!=this.getColor())
				lista.add(c);

		// IZQUIERDAABAJO//
		c = posicion.moverIzquierda().moverAbajo();
		while (tablero.comprobarEstaDentro(c) == true && tablero.getCelda(c).getFicha() == null) {
			lista.add(c);
			c = c.moverIzquierda().moverAbajo();
		}
		if(tablero.comprobarEstaDentro(c))
			if(tablero.getCelda(c).getFicha().getColor()!=this.getColor())
				lista.add(c);
				
		// ABAJOIZQUIERDA//
		c = posicion.moverAbajo().moverIzquierda();
		while (tablero.comprobarEstaDentro(c) == true && tablero.getCelda(c).getFicha() == null) {
			lista.add(c);
			c = c.moverAbajo().moverIzquierda();
		}
		if(tablero.comprobarEstaDentro(c))
			if(tablero.getCelda(c).getFicha().getColor()!=this.getColor())
				lista.add(c);
		
		
		// ARRIBADERECHA//
		c = posicion.moverArriba().moverDerecha();
		while (tablero.comprobarEstaDentro(c) == true && tablero.getCelda(c).getFicha() == null) {
			lista.add(c);
			c = c.moverArriba().moverDerecha();
		}
		if(tablero.comprobarEstaDentro(c))
			if(tablero.getCelda(c).getFicha().getColor()!=this.getColor())
				lista.add(c);
		
		// DERECHAARRIBA//
		c = posicion.moverDerecha().moverArriba();
		while (tablero.comprobarEstaDentro(c) == true && tablero.getCelda(c).getFicha() == null) {
			lista.add(c);
			c = c.moverDerecha().moverArriba();
		}
		if(tablero.comprobarEstaDentro(c))
			if(tablero.getCelda(c).getFicha().getColor()!=this.getColor())
				lista.add(c);
		
		
		// DERECHAABAJO//
		c = posicion.moverDerecha().moverAbajo();
		while (tablero.comprobarEstaDentro(c) == true && tablero.getCelda(c).getFicha() == null) {
			lista.add(c);
			c = c.moverDerecha().moverAbajo();
		}
		if(tablero.comprobarEstaDentro(c))
			if(tablero.getCelda(c).getFicha().getColor()!=this.getColor())
				lista.add(c);
		
		// ABAJODERECHA//
		c = posicion.moverAbajo().moverDerecha();
		while (tablero.comprobarEstaDentro(c) == true && tablero.getCelda(c).getFicha() == null) {
			lista.add(c);
			c = c.moverAbajo().moverDerecha();
		}		
		if(tablero.comprobarEstaDentro(c))
			if(tablero.getCelda(c).getFicha().getColor()!=this.getColor())
				lista.add(c);
		
		return lista;

	}
}
