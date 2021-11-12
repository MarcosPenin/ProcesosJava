package Ejercicio7;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Padre7 {
	
	public static void main(String[] args) throws IOException {
	try {
		File directorio = new File(".\\bin");
		ProcessBuilder pb = new ProcessBuilder("java", "Ejercicio7.Hijo7");
		pb.directory(directorio);
		Process hijo = pb.start();
		String line;

		BufferedReader br = new BufferedReader(new InputStreamReader(hijo.getInputStream()));
		PrintStream ps = new PrintStream(hijo.getOutputStream());

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		String lineRec;
		System.out.println("Introduce frases. * para salir");
		while ((lineRec = in.readLine()).compareTo("*") != 0) {
			ps.println(lineRec);
			ps.flush(); //

			if ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		}
		System.out.println("Finalizando");
		hijo.destroy();
	} catch (IOException e) {
		System.out.println("Error ocurrió durante la ejecución.Descripción del error:" + e.getMessage());
	}
}
}
