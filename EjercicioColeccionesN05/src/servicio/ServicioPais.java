package servicio;

import entidad.Pais;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * 5. Se requiere un programa que lea y guarde países, y para evitar que se
 * ingresen repetidos usaremos un conjunto. El programa pedirá un país en un
 * bucle, se guardará el país en el conjunto y después se le preguntará al
 * usuario si quiere guardar otro país o si quiere salir, si decide salir, se
 * mostrará todos los países guardados en el conjunto. (Recordemos hacer los
 * servicios en la clase correspondiente) Después deberemos mostrar el conjunto
 * ordenado alfabéticamente: para esto recordar cómo se ordena un conjunto. Por
 * último, al usuario se le pedirá un país y se recorrerá el conjunto con un
 * Iterator, se buscará el país en el conjunto y si está en el conjunto se
 * eliminará el país que ingresó el usuario y se mostrará el conjunto. Si el
 * país no se encuentra en el conjunto se le informará al usuario.
 *
 * @author Raul
 */
public class ServicioPais {

    private final Scanner leer;
    private final TreeSet<Pais> conjuntoPaises;
//    private Pais pais;

    public ServicioPais() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.conjuntoPaises = new TreeSet<>();
    }

    private void cargarPais() {
        Pais pais = new Pais();
        System.out.println("Ingrese el nombre de un Pais:");
        pais.setPais(leer.next().toLowerCase());
        conjuntoPaises.add(pais);
    }

    public void llenarConjunto() {
        String op;
        do {
            cargarPais();
            System.out.println("Desea cargar otro pais?");
            op = leer.next();
        } while (op.equalsIgnoreCase("S"));
    }

    public void imprimirPais() {
        for (Pais aux : conjuntoPaises) {
            System.out.println(aux);
        }
    }

    public void eliminarPais() {
        boolean borrar = false;
        System.out.println("Ingrese el nombre de un pais a buscar");
        String p1 = leer.next().toLowerCase();
        String op="";
        Iterator it = conjuntoPaises.iterator();
        while (it.hasNext()) {
            if (it.next().equals(p1)){
                System.out.println("pais encotrado: " + it.next());
                System.out.println("Desea borrar el pais" + it.next() + "?");
                op =leer.next();
            }
        }
//                if (op.equalsIgnoreCase("s")) {
//                    borrar = true;
//                
//            }
//                if (borrar) {
//                    it.remove();
//                    System.out.println("El pais ha sido eliminado");
//                } else {
//                    System.out.println("El pais no se ha eliminado");
//                }
//            }
        
//        for (Pais aux : conjuntoPaises) {
//            System.out.println(aux);
//        }
    }
}
