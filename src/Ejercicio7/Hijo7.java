package Ejercicio7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hijo7 {

	public static void main(String[] args) throws IOException {

		try {
			InputStreamReader is = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(is);
			String liner = null;
			while ((liner = br.readLine()) != null) {
				System.out.println(liner);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
