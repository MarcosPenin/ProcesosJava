package EjercicioArgumentos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArgumentoHijo {

	public static void main(String[] args) {

		if (args.length < 1) {
			System.exit(1);
		} else {
			try {
				int x = Integer.parseInt((args[0]));
				if (x < 0) {
					System.exit(3);
				} else if (x>=0) {
					System.out.println(0);
				}
			} catch (Exception e) {
				System.exit(2);
			}
		}

	}
}
