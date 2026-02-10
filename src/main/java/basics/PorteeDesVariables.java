package basics;

public class PorteeDesVariables {
    protected static String nomUniversite = "Université Technique de Cluj-Napoca";
    static String name = "charly";
    static String message = "Bonjour";

//    PorteeDesVariables P = new PorteeDesVariables();

    static {
        System.out.println(name);
        System.out.println(message);
    }

    public static void main(String[] args) {
       fonction1();
       fonction2();
       fonction3(3, 6);
       System.out.println(name);
       System.out.println(message);
       System.out.println(nomUniversite);
    }

    public static void fonction3(int a, int b) {
        String nomEtudiant = "Jean";
        System.out.println(nomEtudiant);
        System.out.println("Addition = " + (a + b));
        System.out.println(message);
    }

    public static void fonction1() {
        System.out.println(message + ", " + name + ".");
    }

    public static void fonction2() {
        System.out.println(message + ", " + name + ".");
    }

}

class Exemple {
        static String nom = "charly";

        void afficher() {
            System.out.println("Hello, monsieur " + nom + ".");
        }

         public static void main(String[] args){
            Exemple e = new Exemple();
            e.afficher();
         }

         private static  String text = "hello";
         static void printText(){System.out.println(text);
             }
        }
class Etudiant {
    static String firstName = "charly";
    static String lastName = "Jean";
    static int age = 30;
    static double taille = 1.76;
    static String sexe = "masculin";
    static String filiere = "informatique";

    public static void main(String[] args) {
        Etudiant etudiant = new Etudiant();
        etudiant.afficher();

    }

    void afficher() {
        System.out.println("First Name : " + firstName);
        System.out.println("Last Name : " + lastName);
        System.out.println("Âge : " + age + " ans.");
        System.out.println("Taille : " + taille + " m." );
        System.out.println("Sexe : " + sexe);
        System.out.println("Filière : " + filiere);
    }

}