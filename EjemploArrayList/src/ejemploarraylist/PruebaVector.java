package ejemploarraylist;

import java.util.Vector;
import java.util.NoSuchElementException;

public class PruebaVector {
// Uso de la clase Vector.

    private static final String colores[] = {"rojo", "blanco", "azul"};

    public PruebaVector() {
        Vector< String> vector = new Vector< String>();
        imprimirVector(vector); // imprime el vector

        // agrega elementos al vector
        for (String color : colores) {
            vector.add(color);

            imprimirVector(vector); // imprime el vector

            // imprime los elementos primero y último
            try {
                System.out.printf("Primer elemento: %s\n", vector.firstElement());
                System.out.printf("Ultimo elemento: %s\n", vector.lastElement());
            } // fin de try
            // atrapa la excepción si el vector está vacío
            catch (NoSuchElementException excepcion) {
                excepcion.printStackTrace();
            } // fin de catch

            // ¿el vector contiene "rojo"?
            if (vector.contains("rojo")) 
                System.out.printf("\se encontro \"rojo\" en el indice %d\n\n",
                        vector.indexOf("rojo"));
            else 
                System.out.println("\no se encontro \"rojo\"\n");
            }

        vector.remove("rojo"); // elimina la cadena "rojo"
        System.out.println("se elimino \"rojo\");
            imprimirVector(vector); // imprime el vector

        // ¿el vector contiene "rojo" después de la operación de eliminación?
        if (vector.contains("rojo")) {
            System.out.printf("se encontro \"rojo\" en el indice %d\n", vector.indexOf("rojo") );
        else
            System.out.println( "no se encontro \"rojo\"" );

            // imprime el tamaño y la capacidad del vector
            System.out.printf("\nTamanio: %d\nCapacidad: %d\n", vector.size(),
                    vector.capacity());
        } // fin del constructor de PruebaVector

        private void imprimirVector(Vector< String> vectorAImprimir) 
        {
        if (vectorAImprimir.isEmpty()) {
            System.out.print("el vector esta vacio"); // vectorAImprimir está vacío
        } else // itera a través de los elementos
        {
            System.out.print("el vector contiene: ");

            // imprime los elementos
            for (String elemento : vectorAImprimir) {
                System.out.printf("%s ", elemento);
            }
        } // fin de else

        System.out.println("\n");
    } // fin del método imprimirVector

//    public static void main(String args[]) {
//        new PruebaVector(); // crea objeto y llama a su constructor
//    } // fin de main
//} // fin de la clase PruebaVector

public class TestPrint {   
public static void main(String[] args) {  
    int i = 4;
    double j = 5;
         System.out.print ("print i:" + i);
         System.out.println ("Use println para generar i:" + i);
         System.out.printf ("El valor de i es% d, el valor de j es% f", i, j);
    }
}