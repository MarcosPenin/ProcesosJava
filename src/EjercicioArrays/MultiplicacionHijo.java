package EjercicioArrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultiplicacionHijo {

	public static void main(String[] args) throws IOException {
		
	try {
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		
		String liner = null;
		while ((liner = br.readLine()) != null) {
			System.out.println(liner.toUpperCase());
		}

	} catch (Exception e) {
		e.printStackTrace();
	}

}
	
	
	
	
}
