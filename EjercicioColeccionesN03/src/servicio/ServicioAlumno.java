package servicio;

import entidad.Alumno;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import utilidad.Comparadores;

/**
 * 3. Crear una clase llamada Alumno que mantenga información sobre las notas de
 * distintos alumnos. La clase Alumno tendrá como atributos, su nombre y una
 * lista de tipo Integer con sus 3 notas. En el servicio de Alumno deberemos
 * tener un bucle que crea un objeto Alumno. Se pide toda la información al
 * usuario y ese Alumno se guarda en una lista de tipo Alumno y se le pregunta
 * al usuario si quiere crear otro Alumno o no. Después de ese bucle tendremos
 * el siguiente método en el servicio de Alumno: Método notaFinal(): El usuario
 * ingresa el nombre del alumno que quiere calcular su nota final y se lo busca
 * en la lista de Alumnos. Si está en la lista, se llama al método. Dentro del
 * método se usará la lista notas para calcular el promedio final de alumno.
 * Siendo este promedio final, devuelto por el método y mostrado en el main.
 *
 * @author Raul
 */
public class ServicioAlumno {

    Scanner leer;
//    Alumno alumno;
    List<Alumno> listaAlumnos;

    public ServicioAlumno() {
        leer = new Scanner(System.in).useDelimiter("\n");
        listaAlumnos = new ArrayList<>();
    }

    public Alumno crearAlumno() {
        Alumno a1 = new Alumno();
        System.out.println("Ingrese el nombre del alumno");
        a1.setNombre(leer.next().toUpperCase());
        System.out.println("Ingrese el apellido del alumno");
        a1.setApellido(leer.next().toUpperCase());
        System.out.println("Ingrese el curso del alumno");
        a1.setCurso(leer.next().toUpperCase());
        System.out.println("Ingrese primera nota del alumno");
        a1.setNota1(leer.nextDouble());
        System.out.println("Ingrese segunda nota del alumno");
        a1.setNota2(leer.nextDouble());
        System.out.println("Ingrese tercera nota del alumno");
        a1.setNota3(leer.nextDouble());
        a1.setNotaFinal((float) (a1.getNota1() + a1.getNota2() + a1.getNota3()) / 3);
        listaAlumnos.add(a1);
        Collections.sort(listaAlumnos, Comparadores.ordenarPorApellidoAscendente);
        return a1;
    }

    public void agregarAlumno() {
        String op;
        do {
            System.out.println("Desea cargar un nuevo alumno(S/N)?");
            op = leer.next();
            if (op.equalsIgnoreCase("s")) {
                crearAlumno();
            } else {
                op = "n";
            }
        } while (op.equalsIgnoreCase("s"));
    }

    public void notaFinal(Alumno a1) {
        System.out.println("Listado de alumnos");
        for (int i = 0; i < listaAlumnos.size(); i++) {
            System.out.println((i+1)+"- " + listaAlumnos.get(i).getApellido()+ ", " + listaAlumnos.get(i).getNombre());
        }

        System.out.println("seleccione # del alumno a consultar Nota final");
        int num = leer.nextInt();
        num = num-1;
        System.out.println(listaAlumnos.get(num).getApellido()+ " " + listaAlumnos.get(num).getNombre()+ " Nota Final: " + listaAlumnos.get(num).getNotaFinal());
    }
}
