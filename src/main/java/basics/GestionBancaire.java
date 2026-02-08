package basics;

public class GestionBancaire {
    public static void main(String[] args) {
        // 1. Création d'un compte
        CompteBancaire monCompte = new CompteBancaire("Charles Dang", 500.0, "FR76-12345");

        // 2. Affichage initial
        monCompte.afficherInfos();

        // 3. Test des dépôts
        System.out.println("\n--- Test Dépôt ---");
        monCompte.deposer(200.0);
        monCompte.deposer(-50.0); // Devrait afficher une erreur

        // 4. Test des retraits
        System.out.println("\n--- Test Retrait ---");
        monCompte.retirer(100.0);
        monCompte.retirer(1000.0); // Devrait afficher "Solde insuffisant"

        // 5. Affichage final
        System.out.println();
        monCompte.afficherInfos();
    }
}
