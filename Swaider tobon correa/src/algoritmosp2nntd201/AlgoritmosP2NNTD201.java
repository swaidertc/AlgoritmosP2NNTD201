/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmosp2nntd201;

import java.util.Scanner;

/**
 *
 * @author 204
 */
public class AlgoritmosP2NNTD201 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Punto 1
        
        int puntajeCorrectas = 4, 
            puntajeIncorrectas = -1, 
            puntajeBlanco = 0, 
            cantidadCorrectas, 
            cantidadIncorrectas, 
            cantidadBlanco;
        Scanner sc = new Scanner(System.in);
        
        //Proceso
        
        System.out.println("Ingrese cantidad de respuestas incorrectas");
        cantidadIncorrectas = sc.nextInt();
        
        System.out.println("Ingrese cantidad de respuestas correctas");
        cantidadCorrectas = sc.nextInt();
        
        System.out.println("Ingrese cantidad de respuestas en blanco");
        cantidadBlanco = sc.nextInt();
        
        System.out.println("////////*********/////////");
        System.out.println("Tu puntuacion");
        System.out.println("////////*********/////////");
        System.out.println(
                (cantidadBlanco * puntajeBlanco) + 
                (cantidadCorrectas * puntajeCorrectas) + 
                (cantidadIncorrectas * puntajeIncorrectas)                        
        );
        System.out.println("Total es = " + (
                (cantidadBlanco * puntajeBlanco) + 
                (cantidadCorrectas * puntajeCorrectas) + 
                (cantidadIncorrectas * puntajeIncorrectas)));
    }
    
}
