package workanan1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class WorkanaN1 {

    public void crearArray() {
        int n = 4;
        List<Integer> newList = new ArrayList<>();

        Integer[] lista = new Integer[n];
        for (int i = 0; i < n; i++) {
            lista[i] = (int) (Math.random() * 10);
            System.out.println(lista[i]);
            newList.add(lista[i]);
        }

        Collections.sort(newList);
        System.out.println(newList.toString());
    }

    public void ordenarArray() {

    }

    public static void main(String[] args) {
        WorkanaN1 wn = new WorkanaN1();
        wn.crearArray();

    }

}
