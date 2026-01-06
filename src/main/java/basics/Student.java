
package basics;

public class Student {

    String name = "Alice"; // <-- instance, pas static
    int age = 30;
    double taille = 1.80;
    double poids = 75;

    public static void main(String[] args) {
        Student s1 = new Student(); // création de l'objet
        Student s2 = new Student();
        s1.afficherInfos();        // appel via l'objet
        s2.afficherInfos();        // appel via l'objet
        System.out.println("==============================");
        s2.name = "Bob";
        s2.age = 25;

    }

    void afficherInfos() {
        System.out.println("Mon nom est : " + name.toUpperCase() + ".");
        System.out.println("Mon âge est : " + age + " ans.");
        System.out.println("Ma taille est : " + taille + " m");
        System.out.println("Mon poids est : " + poids + " kg.");
    }
}