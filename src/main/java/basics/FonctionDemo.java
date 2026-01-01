package basics;

public class FonctionDemo {

/** Démonstration de l'écriture et de l'utilisation
 * des méthodes et des classes en Java
 * @author Charles-backend
 */
    private static int randomNumber() {
        return (int)(Math.random() * 100);
    }

    private static void sayHelloTo(String name) {
        System.out.println("Hello, " + name.toUpperCase());
    }

    private static void addition(int a, int b) {
        System.out.println("a + b = " + (a + b));
    }

    private static void soustraction(int a, int b) {
        System.out.println("a - b = " + (a - b));
    }

    private static void multiplication(int a, int b) {
        System.out.println("a * b = " + (a * b));
    }

    private static void division(int a, int b) {
        if (b == 0) {
            System.out.println("Division par zéro impossible");
        } else {
            System.out.println("a / b = " + (a / b));
        }
    }

    public static void main(String[] args) { // point d'entrée de notre programme
        String name = "Charles";
        sayHelloTo(name);
        int x = randomNumber();
        int y = randomNumber();
        addition(x, y);
        soustraction(x, y);
        multiplication(x, y);
        division(x, y);
    }
}
