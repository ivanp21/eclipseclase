package proyecto1;

import java.io.*;

public class practica3 {
	public static void main (String[] args){
		int contador=0;
		BufferedReader filtro;
		String linea;
		try {
			filtro = new BufferedReader(new FileReader(args[0]));
			linea = filtro.readLine();
			while (linea != null){
				System.out.println(linea);
				String palabras[] = linea.split(" ");
				contador = contador + palabras.length;
				linea = filtro.readLine();
			}
			System.out.println("En el fichero hay " + contador + " palabras.");
			filtro.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("No se ha encontrado el fichero");
		}
	}
}
//"C:\prueba\ejercicio3.txt"