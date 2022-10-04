package servicio;

import entidad.Tienda;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 6. Se necesita una aplicación para una tienda en la cual queremos almacenar
 * los distintos productos que venderemos y el precio que tendrán. Además, se
 * necesita que la aplicación cuente con las funciones básicas. Estas las
 * realizaremos en el servicio. Como, introducir un elemento, modificar su
 * precio, eliminar un producto y mostrar los productos que tenemos con su
 * precio (Utilizar Hashmap). El HashMap tendrá de llave el nombre del producto
 * y de valor el precio. Realizar un menú para lograr todas las acciones
 * previamente mencionadas.
 *
 * @author Raul Gomez
 */
public class ServicioTienda {

    Scanner leer;
    Map<Double, String> listaPrecios;

    public ServicioTienda() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.listaPrecios = new HashMap<>();
    }

    private void cargarProducto() {
        Tienda tienda = new Tienda();
        System.out.print("Ingrese el nombre del producto: ");
        tienda.setProducto(leer.next());
        System.out.print("Ingrese el precio del producto: $");
        tienda.setPrecio(leer.nextDouble());
        listaPrecios.put(tienda.getPrecio(), tienda.getProducto());

    }

    public void llenarLista() {
        String op = "";
        do {
            cargarProducto();
            System.out.println("Desea cargar mas productos?(s/n):");
            op = leer.next();
        } while (op.equalsIgnoreCase("s"));
    }

    public void buscarProducto() {
        String prod = "";
        String op = "";
        do {
            System.out.println("Ingrese el Nombre del producto a Buscar:");
            prod = leer.next();
            if (listaPrecios.containsValue(prod)) {
                System.out.println("Se encontro el producto [" + prod.toUpperCase() + "] en la lista");
            } else {
                System.out.println("El producto ingresado no se encuentra");
            }
            System.out.println("Desea modificar el producto?(s/n)");
            if (leer.next().equalsIgnoreCase("s")) {
                if (listaPrecios.containsValue(prod)) {

                    System.out.println("Ingrese la actualizacion del nombre");
                    System.out.print("Ingrese nuevo nombre: ");
                    String nNomb = leer.next();
                    System.out.print("Ingrese el mismo precio: ");
                    Double nPrecio = leer.nextDouble();
                    listaPrecios.replace(nPrecio, nNomb);
                }
                System.out.println("Desea buscar otro producto?(s/n)");
                op = leer.next();
            }
        } while (op.equalsIgnoreCase("s"));
    }

    public void imprimirLista() {
        for (Map.Entry<Double, String> entry : listaPrecios.entrySet()) {
            Double key = entry.getKey();
            String value = entry.getValue();
            System.out.println(value + "\t\t$" + key);
        }
    }

    public void menu() {

        boolean op = true;

        do {
            System.out.println("************** Menu **************");
            System.out.println("1.- Llenar lista de productos\n"
                    + "2.- Imprimir lista de Productos\n"
                    + "3.- Buscar y Modificar Producto\n"
                    + "4.- Salir");
            System.out.println("**********************************");
            System.out.println("Ingrese la opcion deseada");
            switch (leer.next()) {
                case "1":
                    llenarLista();
                    break;
                case "2":
                    imprimirLista();
                    break;
                case "3":
                    buscarProducto();
                    break;
                case "4":
                    op = false;
                    break;
                default:
                    System.out.println("Ingrese una opcion correcta");
                    break;
            }
        } while (op);

    }

}
