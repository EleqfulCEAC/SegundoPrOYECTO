package claseotra;

import java.util.Iterator;

public class Segundaclase {

	public static void main(String[] args) {
		String txt = "Hola 1m2u3ndo"; 
		boolean flag = true; 
		
		for (int i = 0; i < txt.length(); i++) {
			char c = txt.charAt(i);
			if (Character.isWhitespace(c)) {
				System.out.print(c);
			} else if (Character.isDigit(c)) {
				
			} else {
				if (flag) {
					System.out.print(Character.toUpperCase(c));
				} else {
					System.out.println(Character.toLowerCase(c));
				}
			}
			
			flag = !flag;
		}
	}

}
