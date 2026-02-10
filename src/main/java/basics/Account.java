package basics;

public class Account {

    private int balance = 1000; // private protège les données

    public void afficherSolde() {
        System.out.println("Votre solde est : " + balance);
    }

    public void retirer(int montant) {
        // On applique la "
        double solde = 100;
        if (montant > 0) {
            System.out.println("Vous pouvez retirer de l'argent");
        }
        else if (montant > solde) {
            System.out.println("Solde insufisant");
        }
        else {
            System.out.println("Veuillez retirer votre argent");
        }
    }
}
