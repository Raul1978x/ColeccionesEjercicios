package utilidad;

import entidad.Pelicula;
import java.util.Comparator;

public class ComparadorAscendenteDirector implements Comparator<Pelicula> {

    @Override
    public int compare(Pelicula t, Pelicula t1) {
        return t.getDirector().compareTo(t1.getDirector());
    }
}
