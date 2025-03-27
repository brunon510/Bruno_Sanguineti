/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP1;

import java.util.Scanner;

/**
 *
 * @author IK
 */
public class Cuarto_01 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre de la receta");
        String Receta=leer.nextLine();
        
        System.out.println("Ingresa los ingredientes");
        String ingre=leer.nextLine();
        
 
        System.out.println("Tiempo receta: ");
        int min=Integer.parseInt(leer.nextLine());
        System.out.println(min);
    
        System.out.println("Ingresa la dificultad");
        String dif=leer.nextLine();
        
        System.out.println("***RECETARIO*****");
        System.out.println("Nombre de la receta :" + Receta);
        System.out.println("Nombre de los ingredientes principales:" + ingre);

    }
    
}
