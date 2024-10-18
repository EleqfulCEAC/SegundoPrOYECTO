package EjercicioJuego;

import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinarNumero {

	public static void main(String[] args) {
		// Herramientas a utilizar 
			// Random 
			// Scanner 
			// Bucle While 
			// Variable para comprobar la condicion (Boolean)
			// If para comprobar la condicion y bifurcar el programa 
		
		
		Random NumRandom = new Random();
		int NumCorrecto = NumRandom.nextInt(10) +1;
		
		boolean flag = false; 
		
		Scanner input = new Scanner(System.in);
		
		int NumeroDeIntentos = 0;
		
		while(!flag) {
			System.out.println("Introduce un numero entre el 0 y el 10 ambos incluidos");
			System.out.println("Introduce el numero en la siguiente linea");
			int NumeroIntroducido = input.nextInt();
			
			if(NumeroIntroducido == NumCorrecto) {
				System.out.println("Haz Acertado el numero, el numero es: " + NumCorrecto);
				flag = true; 
				input.close();
			} else {
				System.out.println("Numero incorrecto, haz introducido: " + NumeroIntroducido + ". Intenta de nuevo");
				NumeroDeIntentos++;
				System.out.println("Llevas " + NumeroDeIntentos + " intentos, puedes conseguirlo!");
			}
			
			
		}
		
		
	}

}
