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
public class sexto {
    public static void main(String[] args) {
           String gusto;
             Scanner leer = new Scanner(System.in);
             System.out.println("Ingrese un gusto de helado");
             gusto=leer.nextLine().toLowerCase();
             
             if(gusto.equals("chocolate")
                     ||gusto.equals("dulce de leche")
                     ||gusto.equals("frutilla")
                     ||gusto.equals("vainilla")){
                 System.out.println("Si tenemos"+gusto);
             }else {
                 System.out.println("no tenemos");
     
            }
    }
 
}

