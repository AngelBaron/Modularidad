/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.areacirculo;

/**
 *
 * @author lucho
 */
import java.util.Scanner;

public class AreaCirculo {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double radio;
        double area;
        
        System.out.print("Ingrese el radio del círculo: ");
        radio = entrada.nextDouble();
        
        area = calcularArea(radio);
        
        System.out.println("El área del círculo es: " + area);
    }
    
    public static double calcularArea(double r) {
        double a;
        final double PI = 3.1416;
        
        a = PI * r * r;
        
        return a;
    }
}

