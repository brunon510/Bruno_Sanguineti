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
public class quinti {
    public static void main(String[] args) {
                System.out.println("Ingrese su edad");
               Scanner ed = new Scanner(System.in);
               int edad=ed.nextInt();
               if (edad>16){
                   System.out.println("tienes edad para conducir");
               }
               else  {
                   System.out.println("no tienes edad para conducir");}
    }
}
