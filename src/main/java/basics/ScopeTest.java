package basics;

public class ScopeTest {

    static String message = "Bonjour";

    public static void main(String[] args) {
        afficher();
        System.out.println(message); 

    }

    static void afficher() {
        String nom = "Jean";
        System.out.println(message + " " + nom);
    }
}
