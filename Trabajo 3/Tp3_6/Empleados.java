package Tp3_6;

import java.util.Scanner;

public class Empleados {
     public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("¿Cuántos empleados desea registrar? ");
            int cantidad = scanner.nextInt();
            scanner.nextLine(); 
            
            Ejercicio6.Empleado[] empleados = new Ejercicio6.Empleado[cantidad]; //array de empleados
            
            
            for (int i = 0; i < cantidad; i++) {
                System.out.println("Empleado #" + (i + 1));
                System.out.print("Nombre: ");
                String nombre = scanner.nextLine();
                
                System.out.print("Sueldo: ");
                double sueldo = scanner.nextDouble();
                scanner.nextLine();
                
                empleados[i] = new Ejercicio6.Empleado(nombre, sueldo); //crea nuevo objeto "empleado"
            }

            
            Ejercicio6.Empleado mejorPagado = empleados[0];
            double sumaSueldos = empleados[0].getSueldo();
            
            for (int i = 1; i < empleados.length; i++) {
                if (empleados[i].getSueldo() > mejorPagado.getSueldo()) {
                    mejorPagado = empleados[i];
                }
                sumaSueldos += empleados[i].getSueldo();
            }
            
        
            double promedio = sumaSueldos / cantidad;
            

            System.out.println("\n--- Resultados ---");
            System.out.println("Empleado que más gana: " + mejorPagado.getNombre() + " ($" + mejorPagado.getSueldo() + ")");
            System.out.println("Sueldo promedio: $" + promedio);
        }
    }
}
