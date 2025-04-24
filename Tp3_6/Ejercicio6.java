package Tp3_6;
public class Ejercicio6 {

    static class Empleado { //atributos
        String nombre;
        double sueldo;

        public Empleado(String nombre, double sueldo) {
            this.nombre = nombre;
            this.sueldo = sueldo;
        }

        public String getNombre() { //metodos para obtener datos en el cuerpo principal
            return nombre;
        }

        public double getSueldo() {
            return sueldo;
        }
    }
    
}