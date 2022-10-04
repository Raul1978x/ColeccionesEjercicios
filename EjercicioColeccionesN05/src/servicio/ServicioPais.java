package servicio;

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
 */
import entidad.Pais;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import utilidad.Comparadores;

public class ServicioPais {

    private final Scanner leer;
    private Pais pais;
    private final Set<Pais> listaPaises;

    public ServicioPais() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.listaPaises = new HashSet<>();
    }

    private void crearPais() {
        pais = new Pais();
        System.out.println("Ingrese el nombre de un pais");
        pais.setPais(leer.next());
    }

    public void llenarListaPaises() {
        String op;
        do {
            crearPais();
            listaPaises.add(pais);
            System.out.println("Desea agregar otro pais?(S/N)");
            op = leer.next();
        } while (op.equalsIgnoreCase("s"));
    }

    public void imprimirLista() {
        for (Pais aux : listaPaises) {
            System.out.println(aux);
        }
    }

    public void ordenarAlfabetic() {
        Collections.sort(listaPaises, Comparadores.ordenAscendente);
        for (Pais aux : listaPaises) {
            System.out.println(aux.getPais());
        }
    }
}
