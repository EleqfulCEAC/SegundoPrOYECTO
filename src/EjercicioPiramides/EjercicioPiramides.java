package EjercicioPiramides;
	import java.util.Iterator;
import java.util.Scanner;
	
public class EjercicioPiramides {

	public static void main(String[] args) {
		//piramide(6, "*");
		piramideEquilatera(5, "x");
	
	}
	
	public static void piramide (int altura, String caracter) {
		
		String txt="";
		for (int i = 1; i <= altura; i++) {
			txt += caracter; 
			System.out.println(txt);
		}
		
		for (int i = altura -1; i >= 0; i--) {
			txt = txt.substring(0,i);
			System.out.println(txt);
		}
		
	}
	
	public static void piramideEquilatera(int altura, String caracter) {
		int espacios = altura -1; 
		String txt = caracter; 
		for (int i = 0; i < altura; i++) {
			for (int x = 0; x < espacios; x++) {
				System.out.print(" ");	
			} 
			System.out.println(txt);
			txt += caracter + caracter; 
			espacios--;
			
		}
		
		
	}

}
