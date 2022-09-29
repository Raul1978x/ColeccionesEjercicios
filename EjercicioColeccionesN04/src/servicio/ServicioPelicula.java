package servicio;

import entidad.Pelicula;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import utilidad.Comparadores;

/**
 * 4. Un cine necesita implementar un sistema en el que se puedan cargar
 * peliculas. Para esto, tendremos una clase Pelicula con el título, director y
 * duración de la película (en horas). Implemente las clases y métodos
 * necesarios para esta situación, teniendo en cuenta lo que se pide a
 * continuación: En el servicio deberemos tener un bucle que crea un objeto
 * Pelicula pidiéndole al usuario todos sus datos y guardándolos en el objeto
 * Pelicula. Después, esa Pelicula se guarda una lista de Peliculas y se le
 * pregunta al usuario si quiere crear otra Pelicula o no. Después de ese bucle
 * realizaremos las siguientes acciones: 
 * • Mostrar en pantalla todas las películas. 
 * • Mostrar en pantalla todas las películas con una duración mayor a 1 hora. 
 * • Ordenar las películas de acuerdo a su duración (de mayor a menor) y 
 * mostrarlo en pantalla. 
 * • Ordenar las películas de acuerdo a su duración (de menor a mayor) y 
 * mostrarlo en pantalla. 
 * • Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla. 
 * • Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 *
 * @author Raul Gomez
 */
public class ServicioPelicula {

    private Scanner leer;
    private ArrayList<Pelicula> listaPeliculas;
    private Pelicula pelicula;

    public ServicioPelicula() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.listaPeliculas = new ArrayList<>();

    }

    private void cargarPelicula() {

        pelicula = new Pelicula();
        System.out.print("Ingrese el titulo de la pelicula: ");
        pelicula.setTitulo(leer.next());
        System.out.print("Ingrese el director de la pelicula: ");
        pelicula.setDirector(leer.next());
        System.out.println("Ingrese la duracion de la pelicula(horas: ");
        pelicula.setDuracion(leer.nextInt());

    }

    public void crearPeliculas() {
        String opcion;
        do {
            cargarPelicula();
            listaPeliculas.add(pelicula);
            System.out.print("Desea Ingresar otra pelicula(S/N)? ");
            opcion = leer.next();
        } while (opcion.equalsIgnoreCase("S"));
    }

    public void imprimirTodasLasPeliculas() {
        listaPeliculas.forEach((aux) -> {
            System.out.println(aux);
        });
    }
    
    public void imprimirPeliculasMasUnaHora() {
        Collections.sort(listaPeliculas, Comparadores.comparadorAscendenteDeDuracion);
        for (Pelicula peli : listaPeliculas) {
            if(peli.getDuracion()>=1)
            System.out.print(peli.toString());
        }
    }
    public void imprimirPeliculasMayorAMenorDuracion() {
        Collections.sort(listaPeliculas, Comparadores.comparadorAscendenteDeDuracion);
        for (Pelicula peli : listaPeliculas) {
            System.out.print(peli.toString());
        }
    }
    public void imprimirPeliculasMenorAMayorDuracion() {
        Collections.sort(listaPeliculas, Comparadores.comparadorDescendenteDeDuracion);
        for (Pelicula peli : listaPeliculas) {
            System.out.print(peli.toString());
        }
    }
    public void imprimirPeliculasAlfaDirector() {
        Collections.sort(listaPeliculas, Comparadores.comparadorAscendenteDeDirector);
        for (Pelicula peli : listaPeliculas) {
            System.out.print(peli.toString());
        }
    }
    public void imprimirPeliculasAlfaTitulo() {
        Collections.sort(listaPeliculas, Comparadores.comparadorAscendenteDeTitulo);
        for (Pelicula peli : listaPeliculas) {
            System.out.print(peli.toString());
        }
    }
}
