package Ejercicio10;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Scanner;

public class Padre10 {
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el primer número");
		String num1=sc.nextLine();
		System.out.println("Introduce el segundo número");
		String num2=sc.nextLine();
		

		File directorio = new File(".\\bin");
		
		ProcessBuilder pb = new ProcessBuilder("java", "Ejercicio10.Hijo10", num1,num2);

		pb.directory(directorio);

		Process hijo = pb.start();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(hijo.getInputStream()));		
		
		String line;
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}
	
	}}
	
		
		
		


