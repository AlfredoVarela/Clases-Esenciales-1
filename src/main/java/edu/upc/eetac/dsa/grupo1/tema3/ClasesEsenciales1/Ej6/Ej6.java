package edu.upc.eetac.dsa.grupo1.tema3.ClasesEsenciales1.Ej6;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Date;

public class Ej6 {

	public static void main(String [] arg) {
	      
	      File archivo2 = null;
	      
	      FileReader fr2 = null;
	      
	      
	      BufferedReader br = null;
	      BufferedReader br2 = null;
	 
	      try {
	            archivo2 = new File ("registro.txt");
		        fr2 = new FileReader (archivo2);
		        br2 = new BufferedReader(fr2); 
	      }
	      catch(Exception e){
	         e.printStackTrace();
	      }
	      
	      finally{
	         // En el finally cerramos el fichero, para asegurarnos
	         // que se cierra tanto si todo va bien como si salta 
	         // una excepcion.
	         try{                    
	            if( null != fr2 ){   
	               fr2.close();     
	            }  
	            
	         }catch (Exception e2){ 
	            e2.printStackTrace();
	         }
	      }
	   

	
	 
	     
	      File archivo3 = null;
	      
	      FileReader  fr4 = null;
	      
	      BufferedReader br4 = null;
	      FileWriter fichero2 = null;
	      PrintWriter pw2 = null;
	      
	      try {
	      
	    	         archivo3 = new File ("registro2.txt");
	 		        fr4 = new FileReader (archivo3);
	 		        br4 = new BufferedReader(fr4);  
	        	 	
	      }
	      catch(Exception e){
		         e.printStackTrace();
		      }
	      try{                    
	            if( null != fr4 )   
	               fr4.close(); 
	            
	      }catch (Exception e2){ 
	            e2.printStackTrace();
	         }
	      
	 if ( archivo3.length()< archivo2.length()){
		 
		 System.out.println("El registro del Ej4 es más largo");
		 
	 }
	 if ( archivo3.length()> archivo2.length()){
		 
		 System.out.println("El registro del Ej5 es más largo");
		 
	 }
	 if ( archivo3.length()== archivo2.length()){
		 
		 System.out.println("El registro del Ej5 es más largo");
		 
	 }
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	
	
