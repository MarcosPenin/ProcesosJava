package Ejercicio3;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class MayusculasHijo {

	public static void main(String[] args) throws IOException {
		InputStreamReader in = new InputStreamReader(System.in);

		try {
			InputStreamReader is = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(is);
			String liner = null;
			while ((liner = br.readLine()) != null) {
				System.out.println(liner.toUpperCase());
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
