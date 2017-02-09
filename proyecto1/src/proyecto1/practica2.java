package proyecto1;

import java.io.*;

public class practica2 {
	public static void main(String[] args) {
		int aux=0, contador=0;
		char vocales[] = {'a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U'}; 
		FileReader fr;
		try {
			fr = new FileReader(args[0]);
			while ((aux = fr.read()) != -1){
				for (int i=0; i<vocales.length;i++){
					if ((char)aux==vocales[i]){
						contador++;
					}
				}
			}
			System.out.println("Hay " + contador + " vocales en el fichero.");
			fr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("No se ha encontrado el fichero");
		}
	}
}
//"C:\prueba\ejercicio2.txt"