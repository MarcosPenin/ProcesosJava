package ejercicio2;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Scanner;

public class AleatorioPadre2 {

	public static void main(String[] args) {
		
		String line;
		try {
			File directorio = new File(".\\bin");
			ProcessBuilder pb = new ProcessBuilder("java", "ejercicio2.AleatorioPadre2");
			pb.directory(directorio);
			Process hijo = pb.start();
			
			BufferedReader br = new BufferedReader(new InputStreamReader(hijo.getInputStream()));
			PrintStream ps = new PrintStream(hijo.getOutputStream());
			
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

			String lineRec;
			while ((lineRec = in.readLine()).compareTo("fin") != 0) {
				//ps.println(lineRec);
				ps.println(" "); // No es necesario escribir nada en concreto, da igual que cadena
				// de hecho la cadena tecleada por usuario no la recogemos.
				ps.flush(); // Asegura que los datos se han enviado

				if ((line = br.readLine()) != null) {
					System.out.println(line);
				}
			} // fin while
			
			System.out.println("Finalizando");
			hijo.destroy();

		} catch (IOException e) {
			System.out.println("Error ocurri� durante la ejecuci�n.Descripci�n del error:" + e.getMessage());
		}
	}
}


