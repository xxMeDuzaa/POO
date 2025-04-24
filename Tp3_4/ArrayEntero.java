package Tp3_4;
import java.util.Arrays;

public class ArrayEntero {

    private int[] numeros = {4, 2, 3, 8, 1};

    public void setNumeros(int[] arrNum){this.numeros=arrNum;} //setea el atributo con su parametro
    public int[] getNumeros(){return this.numeros;} //sin parametros porque va a retornar

    public int getCantidad() { // Método que devuelve la cantidad de números
        return numeros.length;
    }

    public int getMayor() {     // Método que devuelve el número mayor del arreglo
        int mayor = numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }
        return mayor;
    }

    public float getPromedio() {
        float sumatoria=0;
        for (int i = 0; i < numeros.length; i++) {
            sumatoria=sumatoria + numeros[i];
        }
        return (sumatoria / numeros.length);
    }

    
    public int[] getOrdenAscendente() {     // Método que devuelve el arreglo ordenado de forma ascendente
        int[] copia = Arrays.copyOf(numeros, numeros.length);
        Arrays.sort(copia); // Utilizando Arrays.sort() para ordenar el arreglo
        return copia; //HICE UNA COPIA PARA NO MODIFICAR EL ORIGINAL POR SER PRIVADO
    }

    public int[] getOrdenDescendente() {
        
        int[] copia = getOrdenAscendente(); // Obtenemos el arreglo ordenado de forma ascendente: {1, 2, 3, 4, 8}
        
        
        int[] descendente = new int[copia.length]; // Creamos un nuevo arreglo para guardar los valores en orden descendente
        
        // Recorremos el arreglo ascendente desde el principio
        for (int i = 0; i < copia.length; i++) {
            // Asignamos a cada posición de 'descendente' el valor correspondiente desde el final de 'copia'
            // Ej: copia[4 - 0] → copia[4] → 8 → descendente[0] = 8
            //     copia[4 - 1] → copia[3] → 4 → descendente[1] = 4
            descendente[i] = copia[copia.length - 1 - i]; 
        }
        return descendente; // Devolvemos el arreglo ya ordenado de forma descendente
    }
    
}