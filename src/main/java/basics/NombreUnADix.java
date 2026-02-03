package basics;

public class NombreUnADix {

    public static void main(String[] args) {
        afficherNombreUnADix();
    }

    static void afficherNombreUnADix() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    System.out.println("==========================");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
