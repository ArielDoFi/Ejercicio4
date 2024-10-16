package ejercicio4;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dame la ruta del fichero: ");
		
		File fichero = new File(sc.nextLine());
		//src\\ejercicio4\\DatosAlumnos.dat
		
		if(!fichero.exists()) {
			try {
				fichero.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		try {
			GuardarCamposAlumno.EscribirFichero(fichero);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		sc.close();

	}

}
