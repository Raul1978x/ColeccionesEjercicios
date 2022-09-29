package ejerciciocoleccionesn04;

import servicio.ServicioPelicula;

/**
 * 4. Un cine necesita implementar un sistema en el que se puedan cargar
 * peliculas. Para esto, tendremos una clase Pelicula con el título, director y
 * duración de la película (en horas). Implemente las clases y métodos
 * necesarios para esta situación, teniendo en cuenta lo que se pide a
 * continuación: En el servicio deberemos tener un bucle que crea un objeto
 * Pelicula pidiéndole al usuario todos sus datos y guardándolos en el objeto
 * Pelicula. Después, esa Pelicula se guarda una lista de Peliculas y se le
 * pregunta al usuario si quiere crear otra Pelicula o no. Después de ese bucle
 * realizaremos las siguientes acciones: 22 • Mostrar en pantalla todas las
 * películas. • Mostrar en pantalla todas las películas con una duración mayor a
 * 1 hora. • Ordenar las películas de acuerdo a su duración (de mayor a menor) y
 * mostrarlo en pantalla. • Ordenar las películas de acuerdo a su duración (de
 * menor a mayor) y mostrarlo en pantalla. • Ordenar las películas por título,
 * alfabéticamente y mostrarlo en pantalla. • Ordenar las películas por
 * director, alfabéticamente y mostrarlo en pantalla.
 *
 * @author Raul Gomez
 */
public class EjercicioColeccionesN04 {

    public static void main(String[] args) {
        ServicioPelicula servPeli = new ServicioPelicula();
        servPeli.crearPeliculas();        
        System.out.println("**********TODAS***********");
        servPeli.imprimirTodasLasPeliculas();
        System.out.println("************MAS1H***********");
        servPeli.imprimirPeliculasMasUnaHora();
        System.out.println("************MENORMAYOR***********");
        servPeli.imprimirPeliculasMenorAMayorDuracion();
        System.out.println("************MAYORMENOR**********");
        servPeli.imprimirPeliculasMayorAMenorDuracion();
        System.out.println("************ALFADIR**********");
        servPeli.imprimirPeliculasAlfaDirector();
        System.out.println("************ALFATIT**********");
        servPeli.imprimirPeliculasAlfaTitulo();
    }

}
