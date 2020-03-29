/**
 * Esta clase define el juego, esta sin acabar.
 * @author: Rosa Martínez
 * @version: 0.9
 */
package Principal;

import java.util.Scanner;

import Principal.Ficha.Color;
import Principal.Ficha.Shape;

public class Test {

	public Coordenada posicion;
	public Ficha ficha;

	/**
	 * Se creará el juego.
	 * @param args
	 */
	public static void main(String[] args) {

		Tablero t = new Tablero();
		System.out.println(t.toString());
		showMenu();
                System.out.println("Comienza el juego");
	}
	/**
	 * Muestra el menu del juego.
	 */
	public static void showMenu() {

		Scanner sc = new Scanner(System.in);

		System.out.println();
		System.out.println("BIENVENIDO AL JUEGO DEL AJEDREZ");
		System.out.println("");
		System.out.println("  |___|___|___|___|___|___|___|");
		System.out.println();
		System.out.println("QUIERES JUGAR?  SI(1)/NO(2)");
		int opcion = sc.nextInt();
		System.out.println();
		System.out.println("SALIR PULSA 0");
		System.out.println();
	}
	/**
	 * Pide las coordenadas a los jugadores.
	 * @return Devuelve las coordenadas de destino.
	 */
	public Coordenada turno() {

		Coordenada origen;
		char letra ;
		int numero;
		
		Coordenada destino;
		char letra1;
	
		do {
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Dame la posicion de la ficha que quiere mover (A-H/1-8)");
				letra=sc.next().charAt(0);
				numero=sc.nextInt();
				origen = new Coordenada(letra,numero);
			
			System.out.println("Dame la nueva posicion (A-H/1-8)");
				letra1=sc.next().charAt(0);
				numero1=sc.nextInt();
				destino = new Coordenada(letra1,numero1);
			
		}while( letra < 'A' && letra > 'H' && letra1 < 'A' && letra1 > 'H' && numero<1 && numero>8 && numero1<1 && numero1>8);
		
		return destino;
	}

}
