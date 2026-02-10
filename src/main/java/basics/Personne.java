package basics;

public class Personne {
    // Attributs (ou variables d'instance)Private String nom;
    private String prenom;
    private String nom;
    private int age;
    private int anneeNaissance;

    // Le constructeur. Toute classe a un constructeur soit créé par le développeur soit créé par defaut par Java
    public Personne(String prenom, String nom, int age, int anneeNaissance) {
        this.prenom = prenom;
        this.nom = nom;
        this.age = age;
        this.anneeNaissance = anneeNaissance;
    }

    // Getters & Setters
    public String getPrenom() {return prenom; }
    public void setPrenom(String prenom) {this.prenom = prenom; }

    public String getNom() {return nom; }
    public void setNom(String nom) {this.nom = nom; }

    public int getAge(int age) {return age; }
    public void setAge(int age) {this.age = age; }

    public int getAnneeNaissance(int anneeNaissance) {return anneeNaissance; }
    public void setAnneeNaissance(int anneeNaissance) {this.anneeNaissance = anneeNaissance; }

    public void seMarier() {System.out.println("Elle est mariée.");}

    public void afficherNomComplet() {System.out.println(("Votre nom complet est " + this.nom + " " +this.prenom)
            + " et vous avez " + age + " ans.");
    }
}
