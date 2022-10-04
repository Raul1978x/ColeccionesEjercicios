package servicio;

import entidad.Pais;
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
    private final Set<String> conjuntoPaises;

    public ServicioPais() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.conjuntoPaises = new TreeSet<>();
    }

    private void cargarPais() {
        Pais pais = new Pais();

        System.out.println("Ingrese el nombre de un Pais:");
        String p1 = leer.next();
        pais.setPais(p1);
        conjuntoPaises.add(p1);
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
        for (String aux : conjuntoPaises) {
            System.out.println(aux);
        }
    }

    public void eliminarPais() {
        boolean encontrado = false;
        Pais pais = new Pais();
        Iterator it = conjuntoPaises.iterator();
        String op = "";

        System.out.println("Ingrese el nombre de un pais a buscar");
        String paisElim = leer.next();
        pais.setPaisEliminar(paisElim);

        while (it.hasNext()) {
            if (it.next().equals(paisElim)) {
                System.out.println("pais encotrado: " + paisElim);
                System.out.println("Desea borrar el pais " + paisElim + "?");
                op = leer.next();
                if (op.equalsIgnoreCase("s")) {
                    it.remove();
                    System.out.println("El pais ha sido eliminado");
                } else {
                    System.out.println("El pais no se ha eliminado");
                }
            }
        }
        it = conjuntoPaises.iterator();

        while (it.hasNext()) {
            if (!it.next().equals(paisElim)) {
                encontrado = true;
            }else {
                encontrado=false;
            }
        }
        if (encontrado) {
            System.out.println("pais no encontrado");
        }
    }

    public void menu() {
        System.out.println("----------Llenar Conjunto----------");
        llenarConjunto();
        System.out.println("----------Imprimir Conjunto----------");
        imprimirPais();
        System.out.println("----------Eliminar Pais----------");
        eliminarPais();
        System.out.println("----------Imprimir Nuevo Conjunto----------");
        imprimirPais();
    }
}
