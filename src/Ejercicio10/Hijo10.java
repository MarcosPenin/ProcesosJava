package Ejercicio10;

import java.io.IOException;

public class Hijo10 {
	public static void main(String[] args) {
		if (args.length != 2) {
			System.out.println("Lor argumentos deben ser dos números enteros");
			System.exit(1);
		}

		try {

			int num1 = Integer.valueOf(args[0]);
			int num2 = Integer.valueOf(args[1]);
			int num3 = 0;
			for (int i = num1; i <= num2; i++) {
				num3=num3+i;
				
			}
			System.out.println(num3);

			System.exit(0);

		} catch (NumberFormatException e) {
			System.out.println("Lor argumentos deben ser dos números enteros");
			System.exit(1);
		}

	}
	
	}

