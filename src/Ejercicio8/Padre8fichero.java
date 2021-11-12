package Ejercicio8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;

public class Padre8fichero {
	public static void main(String[] args) {
		try {
			File directorio = new File(".\\bin");
			ProcessBuilder pb = new ProcessBuilder("java", "Ejercicio8.Hijo8");
			pb.directory(directorio);
			Process hijo = pb.start();
			String line;

			BufferedReader br = new BufferedReader(new InputStreamReader(hijo.getInputStream()));
			PrintStream ps = new PrintStream(hijo.getOutputStream());

			File archivo = new File("archivo.txt");
			FileReader fr = new FileReader(archivo);
			BufferedReader br2 = new BufferedReader(fr);

			String lineRec;
			while ((lineRec = br2.readLine()) != null) {
				ps.println(lineRec);
				ps.flush(); //

				if ((line = br.readLine()) != null) {
					System.out.println(line+" ("+lineRec+")");
				}
			}
			System.out.println("Finalizando");
			hijo.destroy();

			FileOutputStream fos = new FileOutputStream("error.txt");
			PrintWriter pw = new PrintWriter(fos);

			InputStream is = hijo.getErrorStream();
			BufferedReader br3 = new BufferedReader(new InputStreamReader(is));
			String linea;
			while ((linea = br3.readLine()) != null) {
				pw.println(linea);
			}
			br.close();
			pw.close();

			int exitVal;

			exitVal = hijo.waitFor();
			System.out.println("Valor de Salida: " + exitVal);
			switch (exitVal) {
			case (1):
				System.out.println("FINAL CORRECTO...");
				break;
			case (0):
				System.out.println("FINAL INCORRECTO...");
				break;
			}

		} catch (IOException e) {
			System.out.println("Error ocurrió durante la ejecución.Descripción del error:" + e.getMessage());
		}

		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
