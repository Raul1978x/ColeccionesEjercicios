package ejemploarraylist;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class PruebaCollection {

    private static final String[] colores = {"MAGENTA", "ROJO", "BLANCO", "AZUL", "CYAN"};
    private static final String[] eliminarColores = {"ROJO", "BLANCO", "AZUL"};
    // crea objeto ArrayList, le agrega los colores y lo manipula

    public PruebaCollection() {
        List< String> lista = new ArrayList<>();
        List< String> eliminarLista = new ArrayList<>();

        // agrega los elementos en el arreglo colores a la lista
//        for ( String color : colores ) esta es la propuesta original del libro
//        lista.add( color );
        lista.addAll(Arrays.asList(colores));// netbeans lo modificó así en vez del for Each
        // agrega los elementos en eliminarColores a eliminarLista

//        for ( String color : eliminarColores ) esta es la propuesta original del libro
//        eliminarLista.add( eliminarColores )
        eliminarLista.addAll(Arrays.asList(eliminarColores));// netbeans lo modificó así en vez del for Each

        System.out.println("ArrayList: ");

        // imprime en pantalla el contenido de la lista
        for (int cuenta = 0; cuenta < lista.size(); cuenta++) {
            System.out.printf("%s ", lista.get(cuenta));
        }

        // elimina los colores contenidos en eliminarLista
        eliminarColores(lista, eliminarLista);

        System.out.println("\n\nArrayList despues de llamar a eliminarColores: ");

        // imprime en pantalla el contenido de la lista
//        for (String color : lista) {          // esta es la propuesta original del libro
//            System.out.printf("%s ", color);
//        }
        lista.forEach((color) -> {             // netbeans lo modificó así en vez del for Each
            System.out.printf("%s ", color);
        });
    } // fin del constructor de PruebaCollection

    // elimina de coleccion1 los colores especificados en coleccion2
    private void eliminarColores(
    Collection<String> coleccion1, Collection <String> coleccion2 )
 {
 // obtiene el iterador
 Iterator< String> iterador = coleccion1.iterator();

        // itera mientras la colección tenga elementos
        while (iterador.hasNext()) {
            if (coleccion2.contains(iterador.next())) {
                iterador.remove(); // elimina el color actual
            }
        }
    } // fin del método eliminarColores

    public static void main(String args[]) {
        new PruebaCollection();
        System.out.println("");
    } // fin de main
} // fin de la clase PruebaCollection
