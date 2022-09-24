/**
 * 2. Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
 * un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
 * está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
 * ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
 * la lista ordenada.
 */
package servicio;

import entidad.RazaPerro;
import java.util.ArrayList;
import java.util.Iterator;
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

    public RazaPerro crearPerro() {
        RazaPerro Raza = new RazaPerro();
        String op;
        System.out.println("Desea ingresar Razas de perros S/N");
        op = leer.next().toUpperCase();
        while ("S".equals(op)) {
            do {
                System.out.println("Ingrese una raza de perro");
                Raza.setRaza(leer.next());
                razasPerro.add(Raza.getRaza());
                System.out.println("Desea continuar ingresando Razas de perros S/N");
                op = leer.next().toUpperCase();
            } while ("S".equals(op));
            System.out.println(razasPerro);
        }
        return Raza;
    }

    public void encontrarPerro() {
        System.out.println("Ingrese una raza a eliminar");
        raza.setRazaEliminar(leer.next());
        Iterator< String> iterador = razasPerro.iterator();
        if (!iterador.equals(raza.getRazaEliminar())) {
        } else { 
            iterador.remove();
        }
        System.out.println(razasPerro);

    }
}
