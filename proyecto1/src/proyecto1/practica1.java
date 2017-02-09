package proyecto1;

import java.io.*;

public class practica1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader filtro;
		String linea;
		int contador=0;
		double suma=0;
		try {
			filtro = new BufferedReader(new FileReader(args[0]));
			linea = filtro.readLine();
			while (linea != null){
				System.out.println(linea);
				suma = suma + Double.parseDouble(linea);
				contador++;
				linea = filtro.readLine();
			}
			System.out.println("La suma de todos los numero es: " + suma + ".");
			System.out.println("La media de todos los numero es: " + suma/contador + ".");
			filtro.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Problema con el fichero");;
		}
	}
}
//"C:\prueba\ejercicio1.txt"