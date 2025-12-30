package basics;

public class VariablesDemo {
    public static void main(String[] args) {

        //Déclaration et initialisation de variables
        int age = 25;
        double taille = 1.75;
        boolean estEtudiant = true;
        char initiale ='J';
        String nom= "Jean";

        // Affichage des variables
        System.out.println("Nom : " + nom);
        System.out.println("Initiale : " + initiale);
        System.out.println("Âge : " + age + " ans.");
        System.out.println("Taille : "  + taille);
        System.out.println("Est étudiant ? " + estEtudiant);

        //Modification des variables
        age = 26;
        estEtudiant = false;

        System.out.println("\nAprès mise à jour :");
        System.out.println("Âge : " + age);
        System.out.println("Est étudiant ? " + estEtudiant);

        //Quelques opérateurs sur les variables
        int somme = age + 10;
        double taillleDouble = taille * 2;

        System.out.println("\nOpérations :");
        System.out.println("ÂGE + 10 = " + somme);
        System.out.println("Taille x 2 = " + taillleDouble);


    }
}
