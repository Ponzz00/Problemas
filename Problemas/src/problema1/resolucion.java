package problema1;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class resolucion {
	
			static String cadena;//CREAMOS LA VARIABLE EN (Static) PARA AHORRAR CODIGO
			
	    public static void leerContenido(String archivo) throws FileNotFoundException, IOException {
	      
	        FileReader f = new FileReader(archivo); //LEE EL ARCHIVO (TIPO)
	        BufferedReader b = new BufferedReader(f); //LEE LOS VALORES DE DENTRO DEL ARCHIVO
	        while((cadena = b.readLine())!=null) {
	            System.out.println(cadena);
	        }
	        b.close(); //METODO QUE SIRVE PARA CERRAR EL BUFFER QUE SE ESTA EJECUTANDO
	    }
	    public static void almacenarContenido() {
	    	
	        char[] car = new char[25];
	        car=cadena.toCharArray();
	        for(int i = 0; i<car.length; i++)
	            System.out.print(car[i]+ " ");
	    }
	    public void ordenarContenido(String archivo) {
		}
	 
	}

