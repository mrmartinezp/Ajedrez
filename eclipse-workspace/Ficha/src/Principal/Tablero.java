/**
 * Esta clase define que un tablero contiene celdas, y en las celdas hay fichas.
 * @author: Rosa Martínez
 * @version: 0.9
 */
package Principal;

import java.util.ArrayList;

import Principal.Ficha.Shape;

public class Tablero {

	private static ArrayList<Ficha> blancas = new ArrayList<Ficha>();
	private static ArrayList<Ficha> negras = new ArrayList<Ficha>();

	Celda[][] t;
	private Coordenada posicion;
	/**
	 * Se crea el tablero con las fichas negras y blancas con sus coordenadas iniciales.
	 */
	public Tablero() {
		this.t = new Celda[8][8];
		/* 
		 * Se hace un recorrido del vector para las celdas.
		 */
		for (int i = 0; i < t.length; i++) {
			for (int j = 0; j < t.length; j++) {
				t[i][j] = new Celda();
			}
		}

		negras = new ArrayList<Ficha>();
		blancas = new ArrayList<Ficha>();

		negras.add(new Torre(Ficha.Color.Negro, this, new Coordenada('A', 1)));
		negras.add(new Caballo(Ficha.Color.Negro, this, new Coordenada('A', 2)));
		negras.add(new Alfil(Ficha.Color.Negro, this, new Coordenada('A', 3)));
		negras.add(new Reina(Ficha.Color.Negro, this, new Coordenada('A', 4)));
		negras.add(new Rey(Ficha.Color.Negro, this, new Coordenada('A', 5)));
		negras.add(new Alfil(Ficha.Color.Negro, this, new Coordenada('A', 6)));
		negras.add(new Caballo(Ficha.Color.Negro, this, new Coordenada('A', 7)));
		negras.add(new Torre(Ficha.Color.Negro, this, new Coordenada('A', 8)));

		for (int i = 1; i < 9; i++) {
			negras.add(new Peon(Ficha.Color.Negro, this, new Coordenada('B', i)));
		}

		for (int i = 1; i < 9; i++) {
			blancas.add(new Peon(Ficha.Color.Blanco, this, new Coordenada('G', i)));
		}

		blancas.add(new Torre(Ficha.Color.Blanco, this, new Coordenada('H', 1)));
		blancas.add(new Caballo(Ficha.Color.Blanco, this, new Coordenada('H', 2)));
		blancas.add(new Reina(Ficha.Color.Blanco, this, new Coordenada('H', 3)));
		blancas.add(new Rey(Ficha.Color.Blanco, this, new Coordenada('H', 4)));
		blancas.add(new Torre(Ficha.Color.Blanco, this, new Coordenada('H', 5)));
		blancas.add(new Alfil(Ficha.Color.Blanco, this, new Coordenada('H', 6)));
		blancas.add(new Caballo(Ficha.Color.Blanco, this, new Coordenada('H', 7)));
		blancas.add(new Torre(Ficha.Color.Blanco, this, new Coordenada('H', 8)));

	}
	/**
	 * Se comprueba si la coordenada que se ha introducido esta dentro del tablero o no.
	 * @param c numero y letra
	 * @return false si se ha salido del tablero
	 */
	public boolean comprobarEstaDentro(Coordenada c) {
		/*
		 * Si el numero y la letra no se encuentra en el tablero devuelve false, al contrario devuelve true.
		 */
		if (c.getNumero() > 8 || c.getNumero() < 1 || c.getLetra() < 'A' || c.getLetra() > 'H')
			return false;
		else
			return true;
	}
	/**
	 * Te muestra la posicion del vector.
	 * @return t
	 */
	public Celda[][] getT() {
		return t;
	}
	/**
	 * Muestra lo que contiene la celda.
	 * @param c
	 * @return Devuelve la letra y el numero.
	 */
	public Celda getCelda(Coordenada c) {
		return t[c.getLetra() - 'A'][c.getNumero() - 1];
	}
	/**
	 * Muestra la ficha.
	 * @param c letra y numero.
	 * @return Devuelve la letra y el numero.
	 */
	public Ficha getFicha(Coordenada c) {
		return t[c.getLetra()][c.getNumero()].getFicha();
	}
	/**
	 * Muestra el tablero junto a las fichas creadas.
	 */
	public String toString() {

		String salida = "";

		salida += "  ╔═══╤═══╤═══╤═══╤═══╤═══╤═══╤═══╗\n";
		salida += "A ║ " + t[0][0] + " │ " + t[0][1] + " │ " + t[0][2] + " │ " + t[0][3] + " │ " + t[0][4] + " │ "
				+ t[0][5] + " │ " + t[0][6] + " │ " + t[0][7] + " ║\n";
		salida += "  ╟───┼───┼───┼───┼───┼───┼───┼───╢\n";
		salida += "B ║ " + t[1][0] + " │ " + t[1][1] + " │ " + t[1][2] + " │ " + t[1][3] + " │ " + t[1][4] + " │ "
				+ t[1][5] + " │ " + t[1][6] + " │ " + t[1][7] + " ║\n";
		salida += "  ╟───┼───┼───┼───┼───┼───┼───┼───╢\n";
		salida += "C ║ " + t[2][0] + " │ " + t[2][1] + " │ " + t[2][2] + " │ " + t[2][3] + " │ " + t[2][4] + " │ "
				+ t[2][5] + " │ " + t[2][6] + " │ " + t[2][7] + " ║\n";
		salida += "  ╟───┼───┼───┼───┼───┼───┼───┼───╢\n";
		salida += "D ║ " + t[3][0] + " │ " + t[3][1] + " │ " + t[3][2] + " │ " + t[3][3] + " │ " + t[3][4] + " │ "
				+ t[3][5] + " │ " + t[3][6] + " │ " + t[3][7] + " ║\n";
		salida += "  ╟───┼───┼───┼───┼───┼───┼───┼───╢\n";
		salida += "E ║ " + t[4][0] + " │ " + t[4][1] + " │ " + t[4][2] + " │ " + t[4][3] + " │ " + t[4][4] + " │ "
				+ t[4][5] + " │ " + t[4][6] + " │ " + t[4][7] + " ║\n";
		salida += "  ╟───┼───┼───┼───┼───┼───┼───┼───╢\n";
		salida += "F ║ " + t[5][0] + " │ " + t[5][1] + " │ " + t[5][2] + " │ " + t[5][3] + " │ " + t[5][4] + " │ "
				+ t[5][0] + " │ " + t[5][6] + " │ " + t[5][7] + " ║\n";
		salida += "  ╟───┼───┼───┼───┼───┼───┼───┼───╢\n";
		salida += "G ║ " + t[6][0] + " │ " + t[6][1] + " │ " + t[6][2] + " │ " + t[6][3] + " │ " + t[6][4] + " │ "
				+ t[6][5] + " │ " + t[6][6] + " │ " + t[6][7] + " ║\n";
		salida += "  ╟───┼───┼───┼───┼───┼───┼───┼───╢\n";
		salida += "H ║ " + t[7][0] + " │ " + t[7][1] + " │ " + t[7][2] + " │ " + t[7][3] + " │ " + t[7][4] + " │ "
				+ t[7][5] + " │ " + t[7][6] + " │ " + t[7][7] + " ║\n";
		salida += "  ╚═══╧═══╧═══╧═══╧═══╧═══╧═══╧═══╝\n";
		salida += "    1   2   3   4   5   6   7   8  \n";

		return salida;
	}
	/**
	 * Modifica el valor de la celda.
	 * @param c
	 */
	public void setCelda(Coordenada c) {
		this.posicion = c;
	}
	
	/**
	 * Nos dice si se puede matar una ficha o no.
	 * @param f
	 */
	public void matar(Ficha f) {
		/*
		 * Si nuestro color es igual que la ficha negra, entonces eliminaremos de la lista de fichas negras la ficha,
		 * por lo contrario, eliminaremos la ficha de la lista de las fichas blancas.
		 */
		if(f.getColor() == Ficha.Color.Negro) {
			negras.remove(f);
		}else {
			blancas.remove(f);
		}
	}

}
