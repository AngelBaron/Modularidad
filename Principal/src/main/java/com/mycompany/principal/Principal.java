/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.principal;

/**
 *
 * @author lucho
 */
public class Principal {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        double resultado = calc.sumar(2.0, 3.0);
        System.out.println("El resultado de la suma es: " + resultado);
    }
}
