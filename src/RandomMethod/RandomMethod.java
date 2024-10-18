package RandomMethod;
import java.util.Random;

public class RandomMethod {
	public static void main(String[] args) {
		
		//Random es un objeto 
		Random rd = new Random(); 
		
		// Clase math es una clase estatica
		
		System.out.println(Math.random());
		System.out.println(Math.PI);
		System.out.println(Math.E);
		System.out.println(Math.pow(15, 6));
		System.out.println(Math.sqrt(10));
		System.out.println(Math.floor(15.62));
		System.out.println(Math.round(3.65));
		
		// Cuando algo es static es porque solo hay uno en el sistema o en el programa 
	}

}
