package proyecto1;

import java.io.*;

public class practica7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String titulo = "10 Agosto 2016 \n";
		int cambio=0;
		int[] horas = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23};
		double [] temperatura = new double[24];
		for (int i=0; i<temperatura.length; i++){
			temperatura[i] = (Math.random()*2)*1000;
			cambio = (int) temperatura[i];
			while (cambio<50){
				temperatura[i] = (Math.random()*2)*1000;
				cambio = (int) temperatura[i];
			}
			temperatura[i] = (double)cambio/100;
		}
		try {
			DataOutputStream guardar = new DataOutputStream(new FileOutputStream("C:\\prueba\\ejercicio7.dat"));
			guardar.writeUTF(titulo);
			for (int i=0; i<horas.length; i++){
				guardar.writeInt(horas[i]);
				guardar.writeDouble(temperatura[i]);
			}
			guardar.close();
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("No se puede guardar el fichero");
		}
		try {
			DataInputStream obtener = new DataInputStream(new FileInputStream("C:\\prueba\\ejercicio7.dat"));
			String t_obtenido = obtener.readUTF();
			System.out.println(t_obtenido);
			for (int i=0; i<horas.length;i++){
				int h_obtenida = obtener.readInt();
				double temp = obtener.readDouble();
				System.out.println("En la hora " + h_obtenida + " hay " + temp);
			}
			obtener.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("No se encuentra el fichero");

		}
		
	}

}
