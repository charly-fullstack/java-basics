package basics;

// Les annotations en Java (surcharge (modification des méthodes de la classe mère par la classe fille))
// L'héritage et le polymorphisme en Java

public class HeritageEnJava {
    public static void main(String[] args) {
        System.out.println("Welcome to Heritage!!");
        // Crée un chien sans arguments
        Chien chien = new Chien();

        // Crée un animal avec des arguments
        Animal animal = new Animal("Chien", "Mammifère");

        chien.courir();
        chien.chasser();
        chien.manger();
        animal.courir();
        animal.chasser();
        animal.manger();
        animal.manger("viande");
        chien.aboyer();
        chien.afficherNomAnimal();
    }
}

class Animal{
    // Les attributs
    String nom;
    String genre;

    // Les méthodes de la classe
    public void courir() {
          System.out.println("L'animal court.");
      }

      public void manger() {
          System.out.println("L'animal mange.");
    }

    // Surcharge (overloading): même méthode que manger mais avec un paramètre
    public void manger(String typeDeNourriture) {
        System.out.println("L'animal mange " + typeDeNourriture);
    }

      public void chasser() {
          System.out.println("L'animal chasse.");
      }

    // Le constructeur de la classe Animal par défaut (sans argurments)
    public Animal() {
          this.nom = "Chien";
          this.genre = "Mammifère";
    }

    // Constructeur avec deux arguments
    public Animal(String nomAnimal, String genreAnimal) {
              this.nom = nomAnimal;
              this.genre = genreAnimal;
          }
}

class Chien extends Animal {

    void aboyer() {
        System.out.println("Le chien aboie.");
    }

    void afficherNomAnimal() {
        System.out.println(nom);
        System.out.println("Le " + nom + " est l'animal le plus beau du monde et c'est un animal de type " + genre + ".");
    }

    // Redéfinition (overriding)
    @Override // annotation. Le compilateur te vérifie que c'est bien une redéfinition de la méthode chasser de la classe mère Animal dans la classe fille Chien
    public void chasser() { // Méthode redéfinie dans Chien (classe fille)
        System.out.println("Le chien chasse sa proie.");
    }
    public void manger() {
        System.out.println("Le chien mange sa nourriture.");
    }
}
