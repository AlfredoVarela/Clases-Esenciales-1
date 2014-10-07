package edu.upc.eetac.dsa.grupo1.tema3.ClasesEsenciales1.Ej5;

import java.io.*;
import java.util.Date;



public class Ej5 {
	
	 public static void main(String [] arg) {
	      File imagen = null;
	      FileInputStream fr = null;
	      BufferedInputStream br = null;
	      FileWriter fichero2 = null;
	      PrintWriter pw = null;
	      
	      try {
	      imagen = new File ("Arbol.jpg");
	         fr = new FileInputStream (imagen);
	         br = new BufferedInputStream(fr);
	         
	         //int linea;
	         //while((linea=br.read())!=null){
	        	 	System.out.println("El fichero tiene " + imagen.length() +" caracteres");
	        	 	
	         //}
	        	 	 Date date = new Date();
	    	         fichero2 = new FileWriter("registro2.txt");
	    	         pw = new PrintWriter(fichero2);
	    	         pw.println(date + "  tiene "+ imagen.length() +" caracteres " +  " y su nombre es: "+ imagen.getName());
	    	         
	        	 	
	      }
	      catch(Exception e){
		         e.printStackTrace();
		      }
	      try{                    
	            if( null != fr )   
	               fr.close(); 
	            if (null != fichero2)
	                fichero2.close();
	              
	      }catch (Exception e2){ 
	            e2.printStackTrace();
	         }
	      
	 }
}

