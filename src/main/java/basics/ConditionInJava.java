package basics;

/** Ceci est une implémentation du message traditionnel "Hello world"
 * @Charles Développeur full-stack Java
 */
public class ConditionInJava {
    /** Le programme commence ici */
    public static void main(String[] args) {
        ConditionInJava C = new ConditionInJava();
         comparaison();
         int quantite = 6;
         if (quantite == 0) {
             console("Bonjour");
         } else if(quantite == 1) {
             console("Bonsoir");
         } else {
             console("Hello, world!");
         }
         switch (quantite) {
             case 6:
               console("Hello");
               break;
             case 1:
                 console("Buna");
                 break;
             default:
                 System.out.println("Sorry, I don't know how to manage more than 2 names!");
         }
    }

    static void comparaison() {
        int a = -4;
        boolean number = true;
        int b = 4;
        if ( !(a > 0) && !(b < 0) ) {
            System.out.println(number + ", " + true);
        } else {
            System.out.println(number + ", " + true);
        }
    }

    static void console(String text) {
        System.out.println(text);
    }
}
