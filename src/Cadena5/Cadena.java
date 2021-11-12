package Cadena5;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Cadena {

	public static void main(String[] args) throws FileNotFoundException {

		
			
		if (args[0] != null) {
			for (int i = 0; i<5; i++) {
				System.out.println(args[0]);			
			}
		}else {
			System.exit(1);
		}

	}

}
