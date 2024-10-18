package IntroducirDatosScanner;

import java.util.Scanner;

public class ClaseScanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in); 
		
		System.out.println("Introduce un numero");
		int num = sc.nextInt(); //Metodo next int convierte un numero a entero siempre que se pueda
		System.out.println("El numero es: "+ num);
		
		System.out.println("Introduce un numero 2");
		Double num2 = sc.nextDouble(); //Metodo next double convierte un numero a double siempre que se pueda
		System.out.println("El numero es: "+ num2);
		
		System.out.println("Introduce un texto");
		String text1 = sc.nextLine(); //Metodo next line ignora la lectura por teclado de la linea
		System.out.println("El numero es: "+ text1);
		
		System.out.println("Introduce un texto");
		String text2 = sc.next(); //Metodo next line ignora la lectura por teclado de la linea
		System.out.println("El texto: "+ text2);
		
		sc.close();
		

	}

}
