/**
 * 1. Diseñar un programa que lea y guarde razas de perros en un ArrayList de
 * tipo String. El programa pedirá una raza de perro en un bucle, el mismo se
 * guardará en la lista y después se le preguntará al usuario si quiere guardar
 * otro perro o si quiere salir. Si decide salir, se mostrará todos los perros
 * guardados en el ArrayList.
 */
package servicio;

import entidad.RazaPerro;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ServicioRazaPerro {

    RazaPerro razaEj = new RazaPerro();
    Scanner leer;
    List<String> razasPerro;

    public ServicioRazaPerro() {
        leer = new Scanner(System.in).useDelimiter("\n");
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
}
