package edu.upc.eetac.dsa.grupo1.tema3.ClasesEsenciales1.Ej4;
import java.io.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Date;



public abstract class Ej4 {
	
	 public static void main(String [] arg) {
	      File archivo = null;
	      FileReader fr = null;
	      FileWriter fichero = null;
	      PrintWriter pw = null;
	      BufferedReader br = null;
	 
	      try {
	        
	         archivo = new File ("Dsapruebas.txt");
	         fr = new FileReader (archivo);
	         br = new BufferedReader(fr);
	         // Lectura del fichero
	         String linea;
	         while((linea=br.readLine())!=null){
	        	 	System.out.println("El fichero tiene " + linea.length() +" caracteres");
	        	 	
	            }
	         Date date = new Date();
	         fichero = new FileWriter("registro.txt");
	            pw = new PrintWriter(fichero);
	            pw.println(date + "  tiene "+ archivo.length() +" caracteres " +  " y su nombre es: "+ archivo.getName());
	         
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
	            if (null != fichero)
	                fichero.close();
	         }catch (Exception e2){ 
	            e2.printStackTrace();
	         }
	      }
	   }
	}

	      
