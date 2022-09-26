package ejemplos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ordenamiento3 {
    public void imprimirElementos()
 {
 List< Tiempo2 > lista = new ArrayList< Tiempo2 >(); // crea objeto List

 lista.add( new Tiempo2( 6, 24, 34 ) );
 lista.add( new Tiempo2( 18, 14, 58 ) );
 lista.add( new Tiempo2( 6, 05, 34 ) );
 lista.add( new Tiempo2( 12, 14, 58 ) );
 lista.add( new Tiempo2( 6, 24, 22 ) );

 // imprime los elementos del objeto List
 System.out.printf( "Elementos del arreglo desordenados:\n%s\n", lista );

 // ordena usando un comparador
 Collections.sort( lista, new ComparadorTiempo() );

 // imprime los elementos del objeto List
 System.out.printf( "Elementos de la lista ordenados:\n%s\n", lista );
 } // fin del método imprimirElementos

 public static void main( String args[] )
 {
 Ordenamiento3 ordenamiento3 = new Ordenamiento3();
 ordenamiento3.imprimirElementos();
 } // fin de main
 } // fin de la clase Ordenamiento3

