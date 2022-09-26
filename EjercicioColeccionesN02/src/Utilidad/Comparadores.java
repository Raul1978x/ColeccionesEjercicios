package Utilidad;

import entidad.RazaPerro;
import java.util.Comparator;

/**
 *
 * @author Raul
 */
public class Comparadores {

    /**
     * Compara las razas de perros por orden descendente
     */
    public static Comparator<RazaPerro> ordenarPorRazaDescendente = new Comparator<RazaPerro>() {
        @Override
        public int compare(RazaPerro o1, RazaPerro o2) {
            return o2.getRaza().compareTo(o1.getRaza());
        }
    };
    /**
     * Compara las razas de perros por orden Ascendente
     */
    public static Comparator<RazaPerro> ordenarPorRazaAscendente = new Comparator<RazaPerro>() {
        @Override
        public int compare(RazaPerro o1, RazaPerro o2) {
            return o1.getRaza().compareTo(o2.getRaza());
        }
    };
}
