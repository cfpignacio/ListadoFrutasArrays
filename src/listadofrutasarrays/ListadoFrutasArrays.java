/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadofrutasarrays;

import java.util.Scanner;

/**
 *
 * @author Notebook
 */
public class ListadoFrutasArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          // LISTADO DE FRUTAS
   
             String[] Frutas = new String[3];
             Scanner leer = new Scanner(System.in);
             
             for(int i=0 ;i < 3;i++ ){
                 
                 System.out.print("Ingrese una fruta: ");
                 Frutas[i] = leer.next();
             
             }
             
            
            System.out.println(Frutas[0]);
            System.out.println(Frutas[1]);
            System.out.println(Frutas[2]);
    }
    
}
