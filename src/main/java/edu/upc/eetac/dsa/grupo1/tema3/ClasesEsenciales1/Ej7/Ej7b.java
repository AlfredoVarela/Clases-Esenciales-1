package edu.upc.eetac.dsa.grupo1.tema3.ClasesEsenciales1.Ej7;

import java.io.*;



public class Ej7b {
	
	public static void main(String args[]){
		
		Ej7 persona = new Ej7(5,"Paco",'H'); 
		Ej7 e = null;
	      
	      try
	      {
	         FileOutputStream fileOut = new FileOutputStream("PruebaEj7.ser");
	         ObjectOutputStream out = new ObjectOutputStream(fileOut);
	         out.writeObject(persona);
	         out.close();
	         fileOut.close();
	         System.out.printf("Se guarda el fichero en el workspace\n");
	         
	         FileInputStream fileIn = new FileInputStream("PruebaEj7.ser");
	         ObjectInputStream in = new ObjectInputStream(fileIn);
	         e = (Ej7) in.readObject();
	         in.close();
	         fileIn.close();
	         
	         
	      }catch(IOException i)
	      {
	          i.printStackTrace();
	      }
	      catch(ClassNotFoundException c)
	      {
	         System.out.println("Employee class not found");
	         c.printStackTrace();
	         return;
	      }
	      
	      System.out.println("Edad: " + e.edad);
	      System.out.println("Nombre: " + e.Nombre);
	      System.out.println("Sexo: " + e.Sexo);
	      
	}
}
