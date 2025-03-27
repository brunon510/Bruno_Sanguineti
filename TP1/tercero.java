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
public class tercero {
    public static void main(String[] args) {
        System.out.println("Ingrese su nombre completo");
               Scanner daro = new Scanner(System.in);
        System.out.println("Ingrese su edad");
               Scanner daros = new Scanner(System.in);
        System.out.println("Ingrese su salario");
               Scanner darus = new Scanner(System.in);
               String nom=daro.nextLine();
               int ed=daros.nextInt();
               int suel=darus.nextInt();
               System.out.println("***FICHA DE EMPLEADO*****");
               System.out.println("Nombre del Empleado :"+nom);
               System.out.println("Edad del Empleado :"+ed);
               System.out.println("Sueldo del Empleado :"+suel);
    }
            
}
