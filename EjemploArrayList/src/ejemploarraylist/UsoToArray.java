package ejemploarraylist;
// Uso del método toArray.

import java.util.LinkedList;
import java.util.Arrays;

public class UsoToArray 
{
    // el constructor crea un objeto LinkedList, le agrega elementos y lo convierte en arreglo

    public UsoToArray() {
        String colores[] = {"negro", "azul", "amarillo"};

        LinkedList< String> enlaces
                = new LinkedList< String>(Arrays.asList(colores));

        enlaces.addLast("rojo"); // lo agrega como último elemento
        enlaces.add("rosa"); // lo agrega al final
        enlaces.add(3, "verde"); // lo agrega en el 3er índice
        enlaces.addFirst("cyan"); // lo agrega como primer elemento

        // obtiene los elementos de LinkedList como un arreglo
        colores = enlaces.toArray(new String[enlaces.size()]);

        System.out.println("colores: ");

        for (String color : colores) {
            System.out.println(color);
        }
    } // fin del constructor de UsoToArray

    public static void main(String args[]) {
        new UsoToArray();
    } // fin de main
} // fin de la clase UsoToArray
