package proyecto1;

import java.io.*;

public class practica5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		String entrada;
		String invertido = "";
		try {
			System.out.println("Introduce una cadena de caracteres: ");
			entrada = teclado.readLine();
			invertido = new StringBuffer(entrada).reverse().toString();		
			FileOutputStream fos = new FileOutputStream("C:\\prueba\\ejercicio4.txt");
			PrintWriter pr = new PrintWriter(fos);
			pr.print(invertido);
			pr.close();
			teclado.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Esto no funciona");
		}
		
	}

}
