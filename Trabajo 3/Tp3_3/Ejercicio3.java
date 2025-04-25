package Tp3_3;
//Implemente un programa que indique si una palabra es un palíndromo. Una palabra es palidromo si se lee
//igual de izquierda a derecha que de derecha a izquierda.

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese una palabra: ");
            String palabra = scanner.nextLine();
            
            // Convertimos a minúsculas para evitar errores por mayúsculas
            palabra = palabra.toLowerCase();
            
            // Invertimos la palabra
            String palabraInvertida = new StringBuilder(palabra).reverse().toString();
            
            // Verificamos si es un palíndromo
            if (palabra.equals(palabraInvertida)) {
                System.out.println("Es un palíndromo.");
            } else {
                System.out.println("No es un palíndromo.");
            }
        }
    }
}