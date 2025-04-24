import java.util.Scanner;

public class Ejercicio2 {
public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
        System.out.println("Ingrese una nota (1 al 10): ");
        int nota = scanner.nextInt();
        
        
        if (nota < 1  || nota > 10) {
            System.out.println("Su nota no esta en el rango permitido ");

        }else if (nota >= 8){
            System.out.println("Su nota es sobresaliente "); }
        else if (nota >= 6){
            System.out.println("Su nota es regular ");
        } else {
            System.out.println("Su nota es desaprobado ");
        }
    }

    }
    
}