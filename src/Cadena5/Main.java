package Cadena5;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Main {

	public static void main(String[] args) throws IOException {

		File directorio = new File(".\\bin");

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line;
		line = in.readLine();

		ProcessBuilder pb = new ProcessBuilder("java", "Cadena5.Cadena", line);
		pb.directory(directorio);
		Process hijo = pb.start();
		

		BufferedReader br = new BufferedReader(new InputStreamReader(hijo.getInputStream()));

		String line2;

		PrintStream fileOut = new PrintStream("Archivo.txt");

		System.setOut(fileOut);

		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}

	}
}
