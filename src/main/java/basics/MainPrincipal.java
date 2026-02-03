package basics;

/** En Java, une classe est comme un modèle ou un plan pour créer des bojets
 * @Charly Développeur Full-Stack Java*/
// C'est quoi des getters et des setters en Java pro?

public class MainPrincipal {

     public static void main(String[] args) {
         Voiture maVoiture = new Voiture(); // Création d'un objet "maVoiture"
         maVoiture.couleur = "Noire";
         maVoiture.marque = "Toyota";
         maVoiture.vitesseMax = 120;
         maVoiture.matricule = "CJ234RO";
         maVoiture.rouler();
         maVoiture.arreter();

         Personne personne = new Personne();
         personne.prenom = "John";
         personne.nom = "Daniel";
         personne.age = 21;
         personne.dateDeNaissance = 2005;
         personne.marier();
         personne.nomComplet();

         Joueur joueur = new Joueur();
         joueur.nom = "Charly";
         joueur.couleur = "Noire";
         joueur.age = 23;
         joueur.vitesse = 20;
         joueur.dorsale = 10;
         joueur.jouer();
         joueur.courir();
     }
}
