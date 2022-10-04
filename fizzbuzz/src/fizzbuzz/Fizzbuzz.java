package fizzbuzz;

/**
 * imprimir un listado de 100 numeros donde los multiplos de 3 se muestre el
 * mensaje "fizz" en los multiplos de 5 se muestre el mensaje "buzz" y en los
 * multiplos de ambos debe mostrarse el mensaje fizzbuzz
 *
 * @author Raul
 */
public class Fizzbuzz {

    public void crearBucle() {
        for (int i = 1; i <= 100; i++) {
            if(i%3==0&&i%5==0){
                System.out.println("fizzbuzz");
            }else if (i%3==0){
                System.out.println("fizz");
            }else if(i%5==0){
                System.out.println("buzz");
        }else {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        Fizzbuzz f= new Fizzbuzz();
        f.crearBucle();
    }
}
