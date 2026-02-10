package basics;

/** En Java, une classe est comme un modèle ou un plan pour créer des bojets
 * @Charly Développeur Full-Stack Java*/
// C'est quoi des getters et des setters en Java pro? et c'est quoi un constructeur en Java?

public class MainPrincipal {

     public static void main(String[] args) {

         // Création d'un objet "maVoiture"
         Voiture maVoiture = new Voiture("Toyota", "Noire", "CJ234RO", 120);
         maVoiture.rouler();
         maVoiture.arreter();

         // Création d'un objet "maPersonne"
         Personne maPersonne = new Personne("John", "Daniel", 21, 2005);
         maPersonne.seMarier();
         maPersonne.afficherNomComplet();

         // Création d'un objet "Joueur"
         Joueur joueur = new Joueur("Charly", "Noire", 25, 10, 20, 120);
         joueur.jouer();
         joueur.courir();

         // Création d'un objet "Eleve"
         Eleve eleve = new Eleve("Daniel","Charles", "UI34UN", 34);
         Eleve eleve1 = new Eleve("Gabriel", "Charly", "UI26UTCN", 25);

         eleve1.afficherHello();
         eleve1.afficherNomComlet();
         eleve1.majeurMineur();
         eleve1.chanter();
         System.out.println("=========================");
         eleve.afficherHello();
         eleve.afficherNomComlet();
         eleve.chanter();
         eleve.majeurMineur();

         System.out.println("=============================");

         // Création d'un objet "Utilisateur"
         Utilisateur utilisateur = new Utilisateur("Charly", "modeDePasse!123", "a@mail.com", "maPhoto");
         utilisateur.afficherNomUtilisateur();
     }
}
