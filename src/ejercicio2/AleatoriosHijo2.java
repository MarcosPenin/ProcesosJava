package ejercicio2;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class AleatoriosHijo2 {

	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		try {
			String liner = null;
			while ((liner = br.readLine()) != null) {
				System.out.println((int) (Math.random() * 11));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
