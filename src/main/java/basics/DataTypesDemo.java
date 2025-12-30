package basics;

public class DataTypesDemo {

    public static void main(String[] args) {

        // Types primitifs
        int age = 28;
        double taille = 1.75;
        boolean estEmploye = false;
        char sexe = 'M';

        // Type non primitif
        String nonComplet = "Paul Martin";

        // Affichage
        System.out.println("Nom complet : " + nonComplet);
        System.out.println("Âge : " + age + " ans");
        System.out.println("Taille : " + taille + " m");
        System.out.println("Employé : " + estEmploye);
        System.out.println("Sexe : " + sexe);

        // Petite logique simple
        int ageDans5Aans = age + 5;
        System.out.println("Âge dans 5 ans : " + ageDans5Aans + " ans");

        // force git refresh
    }
}
