/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.parte_2_problema_1;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

/**
 *
 * @author Samuel Cataño C
 */
public class Parte_2_Problema_1 {

    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        Círculo figura1 = new Círculo(2);
        Rectángulo figura2 = new Rectángulo(1,2);
        Cuadrado figura3 = new Cuadrado(3);
        TriánguloRectángulo figura4 = new TriánguloRectángulo(3,5);
        System.out.println("El área del círculo es = " + figura1.calcularÁrea());
        System.out.println("El perímetro del círculo es = " + figura1.calcularPerímetro());
        System.out.println();
        System.out.println("El área del rectángulo es = " + figura2.calcularArea());
        System.out.println("El perímetro del rectángulo es = " + figura2.calcularPerímetro());
        System.out.println();
        System.out.println("El área del cuadrado es = " + figura3.calcularArea());
        System.out.println("El perímetro del cuadrado es = " + figura3.calcularPerímetro());
        System.out.println();
        System.out.println("El área del triángulo es = " + figura4.calcularArea());
        System.out.println("El perímetro del triángulo es = " + figura4.
        calcularPerímetro());
        figura4.determinarTipoTriángulo();
    }
}
