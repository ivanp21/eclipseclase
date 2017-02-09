package proyecto1;

import java.io.*;

public class practica8 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String titulo="";
		int hora=0, cont=0;
		double temperatura=0.00, media=0.00, max=0.00, min=0.00;
		DataInputStream obtener = new DataInputStream(new FileInputStream("C:\\prueba\\ejercicio7.dat"));
		try{
			titulo = obtener.readUTF();
			System.out.println(titulo);
			hora = obtener.readInt();
			temperatura = obtener.readDouble();
			max=temperatura;
			min=temperatura;
			System.out.println("En la hora " + hora + " hay " + temperatura);
			while (true){
				hora = obtener.readInt();
				temperatura = obtener.readDouble();
				System.out.println("En la hora " + hora + " hay " + temperatura);
				media = media + temperatura;
				cont++;
				if (max<temperatura){
					max = temperatura;
				}
				if (temperatura<min){
					min =temperatura;
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			
			obtener.close();
		} 
		System.out.println("La media de temperaturas es: " + media/cont);
		System.out.println("La temperatura máxima es " + max);
		System.out.println("La temperatura minima es " + min);
	}

}
