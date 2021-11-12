package EjercicioArgumentos;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class ArgumentoPadre {

	public static void main(String[] args) throws IOException {
		File directorio = new File(".\\bin");
		ProcessBuilder pb = new ProcessBuilder("java", "EjercicioArgumentos.ArgumentoHijo", "assadsadsa","ascsac");
		pb.directory(directorio);

		Process hijo = pb.start();
		
	
		
		try {
			int exitVal=hijo.waitFor();
			System.out.println(exitVal);
			
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println();
		
		

	}

}
