package entidad;

import java.util.Objects;

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
<<<<<<< HEAD
 */
public class Pais {

    private String pais;
=======
 *
 * @author Raul
 */
public class Pais implements Comparable<Pais> {

    private String pais;
    private String paisEliminar;
>>>>>>> escritorio

    public Pais() {
    }

<<<<<<< HEAD
    public Pais(String pais) {
        this.pais = pais;
=======
    public Pais(String pais, String paisEliminar) {
        this.pais = pais;
        this.paisEliminar = paisEliminar;
    }

    public String getPaisEliminar() {
        return paisEliminar;
    }

    public void setPaisEliminar(String paisEliminar) {
        this.paisEliminar = paisEliminar;
>>>>>>> escritorio
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public int hashCode() {
<<<<<<< HEAD
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.pais);
=======
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.pais);
        hash = 79 * hash + Objects.hashCode(this.paisEliminar);
>>>>>>> escritorio
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pais other = (Pais) obj;
        if (!Objects.equals(this.pais, other.pais)) {
            return false;
        }
<<<<<<< HEAD
=======
        if (!Objects.equals(this.paisEliminar, other.paisEliminar)) {
            return false;
        }
>>>>>>> escritorio
        return true;
    }

    @Override
    public String toString() {
<<<<<<< HEAD
        return "Pais:\t" + pais;
    }

    
=======
        return "Pais{" + "pais=" + pais + ", paisEliminar=" + paisEliminar + '}';
    }

    @Override
    public int compareTo(Pais t) {
        return pais.compareTo(t.pais);
    }

>>>>>>> escritorio
}
