package basics;

public class Eleve {
    private String nom;
    private String prenom;
    private String matricule;
    private int age;

    // Constructeur n'est pas une méthode
    public Eleve(String nom, String prenom, String matricule, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.matricule = matricule;
        this.age = age;
    }

    public void afficherNomComlet() {
        System.out.println("Votre nom est " + nom.toUpperCase() + " " + prenom.toUpperCase());
    }

    public void chanter() {
        System.out.println(nom.toUpperCase() + " " + prenom.toUpperCase() + " est en train de chanter.");
    }

    public void majeurMineur() {
        if (age >= 18) {
            System.out.println(nom + " vous êtes majeur.");
        } else {
            System.out.println(nom + " vous êtes mineur.");
        }
    }

    public void afficherHello() {
        int i = 1;
        while ( i < 5){
            System.out.println("Bonjour tout le monde" + nom + " " + prenom + " vous avez " + age + " ans.");
            i += 1;
        }
    }
}
