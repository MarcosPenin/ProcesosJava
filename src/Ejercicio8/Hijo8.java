package Ejercicio8;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Hijo8 {
	public static void main(String[] args) {

		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);

		try {
			String liner = null;
			while ((liner = br.readLine()) != null) {
				String reverse = new StringBuffer(liner).reverse().toString();
				if (liner.equals("")) {
					System.out.println("Cadena vacía");
				}else if (liner.equals(reverse)) {
					System.out.println("La cadena es un palíndromo");
				}else {
					System.out.println("La cadena no es un palíndromo");
				}		
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
