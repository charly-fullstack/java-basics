package basics;

/**
 * Concept : Encapsulation et Logique Métier (POO)
 * Cette classe remplace l'idée de la Voiture par un concept bancaire.
 */
public class CompteBancaire {
    // 1. Attributs (Privés pour l'encapsulation)
    private String titulaire;
    private double solde;
    private String numeroCompte;

    // 2. Constructeur (Initialisation de l'objet)
    public CompteBancaire(String titulaire, double soldeInitial, String numeroCompte) {
        this.titulaire = titulaire;
        if (soldeInitial >= 0) {
            this.solde = soldeInitial;
        } else {
            this.solde = 0;
            System.out.println("Alerte : Un solde initial ne peut pas être négatif. Mis à 0.");
        }
        this.numeroCompte = numeroCompte;
    }

    // 3. Méthodes métier (Actions possibles)
    
    public void deposer(double montant) {
        if (montant > 0) {
            solde += montant;
            System.out.println("Dépôt de " + montant + " € effectué. Nouveau solde : " + solde + " €");
        } else {
            System.out.println("Erreur : Le montant du dépôt doit être positif.");
        }
    }

    public void retirer(double montant) {
        if (montant > 0 && montant <= solde) {
            solde -= montant;
            System.out.println("Retrait de " + montant + " € effectué. Solde restant : " + solde + " €");
        } else if (montant > solde) {
            System.out.println("Erreur : Solde insuffisant pour retirer " + montant + " € (Solde actuel : " + solde + " €)");
        } else {
            System.out.println("Erreur : Le montant du retrait doit être positif.");
        }
    }

    public void afficherInfos() {
        System.out.println("=== Infos Compte ===");
        System.out.println("Titulaire : " + titulaire);
        System.out.println("Numéro : " + numeroCompte);
        System.out.println("Solde : " + solde + " €");
        System.out.println("====================");
    }

    // 4. Getters (Pour lire les données privées de l'extérieur)
    public String getTitulaire() {
        return titulaire;
    }

    public double getSolde() {
        return solde;
    }

    public String getNumeroCompte() {
        return numeroCompte;
    }
}
