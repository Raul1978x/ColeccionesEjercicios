package utilidad;

import entidad.Pais;
import java.util.Comparator;

public class Comparadores {

    Pais pais = new Pais();
    public static Comparator<Pais> ordenAscendente = new Comparator<Pais>() {
        @Override
        public int compare(Pais t1, Pais t2) {
            return t1.getPais().compareTo(t2.getPais());
        }
    };
}
