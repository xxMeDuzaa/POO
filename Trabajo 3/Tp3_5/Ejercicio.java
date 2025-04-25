package Tp3_5;
import java.util.Scanner;

public class Ejercicio {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese un número: ");
            int numero = scanner.nextInt(); // Leer número del usuario
            
            // Crear objeto Entero con el número ingresado
            Entero entero = new Entero(numero);
            
            // Llamadas correctas según cómo están definidos los métodos
            System.out.println("El cuadrado del número: " + Entero.getCuadrado(entero.getNumero()));
            System.out.println("¿Es par?: " + Entero.getPar(entero.getNumero()));
            System.out.println("El factorial del número es: " + Entero.getFactorial(entero.getNumero()));
            System.out.println("¿Es primo?: " + Entero.getPrimo(entero.getNumero()));
        }
    }
}