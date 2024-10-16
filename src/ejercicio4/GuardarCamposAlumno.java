package ejercicio4;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class GuardarCamposAlumno {

	static void EscribirFichero(File fichero) throws IOException {

		FileOutputStream ficheroSalida = new FileOutputStream(fichero, true);
		DataOutputStream salida = null;
		
		Scanner scNia = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);

		for (int i = 1; i <= 5; i++) {

			System.out.println("informacion del Alumno: " + i);

			System.out.println("NIA:");

			int nia = scNia.nextInt();

			System.out.println("Nombre:");

			String name = sc.nextLine();

			System.out.println("Apellido:");

			String apellido = sc.nextLine();

			System.out.println("Ciclo:");

			String ciclo = sc.nextLine();

			System.out.println("Grupo:");

			String grupo = sc.nextLine();

			System.out.println("Curso:");

			String curso = sc.nextLine();

			System.out.println("Genero: (H/M)");

			char gender = sc.nextLine().charAt(0);

			System.out.println("Fecha de Nacimiento dd/mm/yyy:");

			SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
			Date fechaNac = null;

			try {

				fechaNac = dateFormat.parse(sc.nextLine());
			} catch (ParseException e) {
				e.printStackTrace();
			}
			
			
			salida = new DataOutputStream(ficheroSalida);

			salida.write(nia);
			salida.writeUTF(name);
			salida.writeBytes(apellido);
			salida.writeBytes(ciclo);
			salida.writeBytes(grupo);
			salida.writeBytes(curso);
			salida.writeByte(gender);
			salida.writeUTF(fechaNac.toString());

		}
		salida.close();
		sc.close();
		scNia.close();
	}
}
