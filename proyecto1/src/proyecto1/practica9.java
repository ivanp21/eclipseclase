package proyecto1;

import java.io.File;

public class practica9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File leer = new File(args[0]);
		System.out.println("El directorio " + args[0] + " hay:");
		File[] archivos = leer.listFiles();
		for (File archivo : archivos){
			if (archivo.isFile()){
				System.out.println("El archivo " + archivo.getName() + ".");
			}
			if (archivo.isDirectory()){
				System.out.println("El directorio " + archivo.getName() + ".");
			}
		}
	}
}
//C:\prueba