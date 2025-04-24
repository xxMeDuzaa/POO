package Tp3_1;
//Escriba un programa que lea tres números y si el primero es positivo calcule el producto de los otros dos,
//en otro caso calcule la suma.

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Ingrese el primer número:");
            int num1 = input.nextInt();
            
            System.out.println("Ingrese el segundo número:");
            int num2 = input.nextInt();
            
            System.out.println("Ingrese el tercer número:");
            int num3 = input.nextInt();
            
            int resultado;
            
            if (num1 > 0) {
                resultado = num2 * num3;
            } else {
                resultado = num2 + num3;
            }
            
            System.out.println("El resultado es: " + resultado);
        }
    }
}