/**
 * 2. Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
 * un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
 * está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
 * ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
 * la lista ordenada.
 */
package entidad;

public class RazaPerro {

    private String raza;
    private String razaEliminar;

    public RazaPerro() {
    }

    public RazaPerro(String raza, String razaEliminar) {
        this.raza = raza;
        this.razaEliminar = razaEliminar;
    }


    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getRazaEliminar() {
        return razaEliminar;
    }

    public void setRazaEliminar(String razaEliminar) {
        this.razaEliminar = razaEliminar;
    }

    @Override
    public String toString() {
        return "RazaPerro{" + "raza=" + raza + ", razaEliminar=" + razaEliminar + '}';
    }
}
