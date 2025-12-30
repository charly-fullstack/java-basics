package basics;

public class OperatorDemo {
    public static void main(String[] args) {
        // ===== Opérateurs arithmétiques ====
        int a = (int)(Math.random() * 100);
        int b = (int)(Math.random() * 99) + 1;

        System.out.println("Addition : " + (a + b));
        System.out.println("Soustraction : " + (a - b));
        System.out.println("Multiplication : " + (a * b));
        System.out.println("Division : " + ((double) a / b));
        System.out.println("Modulo : " + (a % b));

        // ==== Opérateurs de comparaison ====
        System.out.println("a > b : " + (a > b));
        System.out.println("a < b : " + (a < b));
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));

        // ==== Opérateurs logiques ====
        boolean aEstPositif = a > 0;
        boolean bEstPositif = b > 0;

        System.out.println("a et b positifs : " + (aEstPositif && bEstPositif));
        System.out.println("a ou b positifs : " + (aEstPositif || bEstPositif));
        System.out.println("a et b positifs : " + (!aEstPositif));
    }
}
