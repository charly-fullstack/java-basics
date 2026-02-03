package basics;

public class Personne {
    // Attributs (ou variables d'instance)Private String nom;
    String prenom;
    String nom;
    int age;
    int dateDeNaissance;

    public void marier() {System.out.println("Elle est mariée.");}

    public void nomComplet() {System.out.println(("Votre nom complet est " + this.nom + " " +this.prenom)
            + " et vous avez " + age + " ans.");
    }
}
