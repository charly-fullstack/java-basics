package basics;

public class TestClass {

   private String firstName = "Ali";
   private String lastName = "Bob";
   int age = 25;
   double taille = 1.80;
   String couleurPreferee = "Noir";

    public void afficherDetails() {
        System.out.println("Je m'appelle " +lastName + " " + firstName + ".");
        System.out.println("J'ai " + age + " ans.");
        System.out.println("Je mesure " + taille + " m.");
        System.out.println(couleurPreferee + " est ma couleur préférée.");
    }
}

class Test {

    int age = 36;
    public void affcherAge() {
        System.out.println("Mon âge est " + age + " ans.");
    }

    public static int addition(int a, int b) {
        return a + b;
    }

    static void afficherMessage() {
        int [] tableau = {10, 20, 45, 78, 83, 21};
        for (int i = 0; i < 5; i++) {
            System.out.println("Bonjour tout le monde.");
        }

        System.out.println("================================");

        for (int i = 0; i < tableau.length; i++) {
            System.out.println(tableau[i]);
        }

        System.out.println("======================================");

        for (int valeur : tableau) {
            System.out.println(valeur);
        }
    }
}
