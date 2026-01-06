package basics;

public class Account {

    private int balance = 1000; // private protège les données

    public void afficherSolde() {
        System.out.println("Votre solde est : " + balance);
    }
}
