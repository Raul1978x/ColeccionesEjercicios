package ejemplos;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ordenamiento1 {

    private static final String palos[] = {"Corazones", "Diamantes", "Bastos", "Espadas"};
//    muestra los elementos del arreglo

    public void inmprimirElementos() {
        List<String> lista = Arrays.asList(palos);// crea objeto list
//        imprime lista
        System.out.printf("Elementos del arreglo desordenados:\n" + lista + "\n");
        Collections.sort(lista);//ordena Arraylist
        //imprime lista
        System.out.printf("Elementos del arreglo ordenados:\n" + lista + "\n");

    }// fin del método imprimirElementos

    public static void main(String[] args) {
        Ordenamiento1 orden1 = new Ordenamiento1();
        orden1.inmprimirElementos();
    }//fin de main
}// fin de la clase ordenamiento1
