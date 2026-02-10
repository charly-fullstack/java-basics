package basics;

public class Utilisateur {

    // Déclaration des attributs
    private final String nomUtilisateur;
    private final String email;// final signifie obligatoire
    private final String motDePasse; // final signifie obligatoire
    private String photo; // Optionnel

    // Création du constructeur
    public Utilisateur (final String nomUtilisateur, final String email, String motDePasse, String photo) {
        this.nomUtilisateur = nomUtilisateur;
        this.email = email;
        this.motDePasse = motDePasse;
        this.photo = photo;
    }

    public void afficherNomUtilisateur() {
        System.out.println("Votre nom complet est " + nomUtilisateur.toUpperCase() + " et votre mot de passe est " + motDePasse);
    }

    // Getters & Setters
    // Getters
    public String getNomUtilisateur() {return nomUtilisateur; }
    public String getEmail() {return this.email; }

    // Setters
    public void setNomUtilisateur(String nomUtilisateur) {
        this.photo = photo;
    }
}
