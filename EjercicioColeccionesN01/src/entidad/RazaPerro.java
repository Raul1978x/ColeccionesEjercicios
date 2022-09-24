package entidad;

public class RazaPerro {

    private String raza;

    public RazaPerro() {
    }

    public RazaPerro(String raza) {
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "RazaPerro{" + "raza=" + raza + '}';
    }

}
