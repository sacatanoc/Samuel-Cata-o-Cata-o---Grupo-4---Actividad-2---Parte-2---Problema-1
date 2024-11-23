/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parte_2_problema_1;

/**
 *
 * @author Samuel Cataño C
 */
public class Cuadrado {
    int lado;
    public Cuadrado(int lado) {
        this.lado = lado;
    }
    double calcularArea(){
        return lado*lado;
    }
    double calcularPerímetro(){
        return 4*lado;
    }
}
