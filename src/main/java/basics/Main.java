package basics;

public class Main {

    public static void main(String[] args){
        Account a = new Account();
//        System.out.print(a.balance); // error: balance has private access in basics.Account
        a.afficherSolde(); // accès autorisé via méthode publique
    }

}
