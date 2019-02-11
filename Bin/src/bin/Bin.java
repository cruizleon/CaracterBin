/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bin;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 *
 * @author Cristhian Ruiz, Andrés Sánchez
 * Fdtos. Prog. Web NRC:7953
 */
public class Bin {

 /**
  * @param args the command line arguments
  */
 
 static BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ) );
 static BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
 
 static String caracteres, nuevo;
 static int posicion=0;
 
 public static void cadena() throws IOException
 {
  bw.write("Digite cadena de caracteres\n");
  bw.flush();
  
  caracteres= br.readLine();
  
 } 
 public static void archivo() throws IOException
 {
   FileWriter archivo = new FileWriter("Archivo.umd");
   BufferedWriter txt = new BufferedWriter( archivo );
  
   
   for(int i =0 ; i<caracteres.length();i++)
  {
   posicion=caracteres.charAt(i);
   nuevo=Integer.toBinaryString(posicion);
   //bw.write(nuevo+"\n");
   //bw.flush();
   
  
   txt.write( caracteres.charAt(i)+"="+nuevo+", ");
   txt.flush();
  }
 } 
 public static void main(String[] args) throws IOException {
  // TODO code application logic here
  cadena();
  archivo();
 }
 
}
