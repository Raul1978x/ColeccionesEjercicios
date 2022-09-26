/**
 * 2. Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
 * un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
 * está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
 * ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
 * la lista ordenada.
 */
package servicio;

import Utilidad.Comparadores;
import entidad.RazaPerro;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ServicioRazaPerro {

    RazaPerro raza;
    Scanner leer;
    List<String> razasPerro;

    public ServicioRazaPerro() {
        leer = new Scanner(System.in).useDelimiter("\n");
        raza = new RazaPerro();
        razasPerro = new ArrayList();
    }

    public List<String> getRazasPerro() {
        return razasPerro;
    }

    public RazaPerro crearPerro() {
        RazaPerro raza = new RazaPerro();
        String op;

        System.out.println("Desea ingresar Razas de perros S/N");
        op = leer.next().toUpperCase();
        while ("S".equals(op)) {
            do {
                System.out.println("Ingrese una raza de perro");
                raza.setRaza(leer.next());
                razasPerro.add(raza.getRaza());
                Collections.sort(razasPerro);
                System.out.println("Desea continuar ingresando Razas de perros S/N");
                op = leer.next().toUpperCase();
            } while ("S".equals(op));
            System.out.println(razasPerro);
        }
        return raza;
    }

    public void encontrarPerro() {
        System.out.println("Ingrese una raza a eliminar");
        raza.setRazaEliminar(leer.next());
        boolean encuentra = true;
        for (int i = 0; i < razasPerro.size(); i++) {
            String r = razasPerro.get(i);
            if (r.contains(raza.getRazaEliminar())) {
                razasPerro.remove(r);
                encuentra= false;
            }
        }

        if (encuentra) {
            System.out.println("La raza " + raza.getRazaEliminar() + " no se encuentra en la lista");
            System.out.println(razasPerro);
        } else {
            System.out.println(razasPerro);
        }
    }
}
