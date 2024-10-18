package Funciones;
import java.util.Iterator;
import java.util.Scanner;
public class Funciones {

	public static void main(String[] args) {
		System.out.println("Introduce una palabra y salsdra 10 veces");
		Scanner saludo = new Scanner(System.in);
		String palabra = saludo.next();
		for (int i = 0; i < 5; i++) {
			input(palabra, i);
		}
	}
	
	public static void input(String palabra, int num) {
		for (int i = 0; i < num; i++) {
			System.out.print(palabra);
			
		}
		
	}

}
