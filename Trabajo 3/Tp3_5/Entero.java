package Tp3_5;
public class Entero {

    private int numero; // atributo privado

    // Constructor de la clase
    public Entero(int numero) {
        this.numero = numero;
    }

    // Devuelve el número
    public int getNumero() {
        return numero;
    }

    // Establece un nuevo valor al número
    public void setNumero(int numero) {
        this.numero = numero;
    }

    // Calcula el cuadrado del número
    public static long getCuadrado(int numero) {
        return (long) numero * numero;
    }

    // Determina si el número es par
    public static boolean getPar(int numero) {
         return  (numero % 2 == 0);
    }

    public static boolean impar (int numero) {
        return !getPar(numero);
    }

    public static long getFactorial(int num) { // long es un tipo de dato que almacena mucho mas que un
        if (num < 0) {
            return -1; // No se puede calcular factorial de negativos
        }
        long resultado = 1;
        for (int i = 1; i <= num; i++) {
            resultado = resultado * i;
        }
        return resultado;
    }
    public static boolean getPrimo(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}