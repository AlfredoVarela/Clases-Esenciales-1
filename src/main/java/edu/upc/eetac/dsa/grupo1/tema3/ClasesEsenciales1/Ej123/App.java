package edu.upc.eetac.dsa.grupo1.tema3.ClasesEsenciales1.Ej123;
import java.io.*;

class LeeFichero {
   public static void main(String [] arg) {
      File archivo = null;
      FileReader fr = null;
      BufferedReader br = null;
 
      try {
         // Apertura del fichero y creacion de BufferedReader para poder
         // hacer una lectura comoda (disponer del metodo readLine()).
         archivo = new File ("Dsapruebas.txt");
         fr = new FileReader (archivo);
         br = new BufferedReader(fr);
 
         // Lectura del fichero
         String linea;
         while((linea=br.readLine())!=null){
        	 String[] partes = linea.split(" ");
        	 for( int i=0; i<partes.length-1; i++){
        	 int num = Integer.parseInt(partes[i]);
        	 if (num>=1000){
        		 System.out.println("El valor "+ partes[i] +" es mayor que 1000");
        		 throw new BigNumber("Números fuera de rango");
        	 	} 
        	 }
        	 
            System.out.println(linea);
            }
      }
      catch(Exception e){
         e.printStackTrace();
      }
      
      finally{
         // En el finally cerramos el fichero, para asegurarnos
         // que se cierra tanto si todo va bien como si salta 
         // una excepcion.
         try{                    
            if( null != fr ){   
               fr.close();     
            }                  
         }catch (Exception e2){ 
            e2.printStackTrace();
         }
      }
   }
}