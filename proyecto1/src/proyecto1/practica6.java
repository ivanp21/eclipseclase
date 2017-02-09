package proyecto1;

import java.io.*;

public class practica6 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String origen, destino;
		FileInputStream archivo_origen;
		FileOutputStream archivo_destino;
		int i=0;
		System.out.println("Introduce la direccion de un fichero");
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		try {
			origen = teclado.readLine();
			System.out.println("Introduce la direccion de destino del fichero");
			destino = teclado.readLine();
			archivo_origen = new FileInputStream(origen);
			archivo_destino = new FileOutputStream(destino, true);
			i = archivo_origen.read();
			while (i != -1){
				archivo_destino.write(i);
				i = archivo_origen.read();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("No se puede acceder al fichero de origne o destino");
		}
	}

}
//"C:\prueba\ejercicio3.txt" (ORIGEN)
//"C:\prueba\ejercicio6.txt" (DESTINO)