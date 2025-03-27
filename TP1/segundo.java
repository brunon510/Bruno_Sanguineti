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
public class segundo {
    public static void main(String[] args) {
        System.out.println("Ingrese su nombre completo");
               Scanner daro = new Scanner(System.in);
        System.out.println("Ingrese el nombre de su empresa");
               Scanner daros = new Scanner(System.in);
        System.out.println("Ingrese el dominio de la empresa");
               Scanner darus = new Scanner(System.in);
               String nom=darus.nextLine();
               String empe=daro.nextLine();
               String dom=daros.nextLine();
               String nombe=nom.strip();
               nombe=nombe.replace(" ", "_");
               System.out.println("***GENERADOR DE EMAIL*****");
               System.out.println("Nombre de Usuaria :"+nom);
               System.out.println("Nombre de Empresa :"+empe);
               System.out.println("Nombre de Dominio :"+dom);
               System.out.println("");
               System.out.println("");
               System.out.println("Creando Email.......");
               System.out.println(nombe+"@"+dom);
               
    }
      
            
}
