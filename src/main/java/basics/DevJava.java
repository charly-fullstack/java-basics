package basics;

public class DevJava {
    // La méthode principale main()
    public static void main(String[] args) {
        // Instanciation de la classe Marque
        Marque yamaha = new Marque("yamaha");

        // Instanciation de la classe Moto
        Moto moto = new Moto(6, "Noire", yamaha);
        System.out.println("La moto a la couleur " + moto.couleur + ".");
        System.out.println("La vitesse maximale de la moto est de " + moto.nombreDeVitesse + " vitesses.");
        System.out.println("La marque de votre moto est " + yamaha.nom + ".");
        moto.rouler();
        moto.arreter();

        // Instanciation de la classe Film
        Film film = new Film("L'art de créer", "Technologique", "Jet Lee");
        System.out.println(film.genreDeFilm);
        System.out.println(film.realisateur);
    }
}

class Moto {
    // Les attributs de ma classe Moto
    int nombreDeVitesse;
    String couleur;
    Marque marque;
    public void rouler() {System.out.println("La moto roule.");}
    public void arreter() {System.out.println("La moto s'arrête.");}

    // Le constructeur de la classe Moto
    public  Moto(int nombreDeVitesse, String couleur, Marque marque) {
        this.couleur = couleur;
        this.nombreDeVitesse = nombreDeVitesse;
        this.marque = marque;
    }
}

class Marque {
    // Les attributs de ma classe Marque
    String nom;

    // Constructeur de la classe Marque
    public Marque(String nom) {
        this.nom = nom;
    }
}

class Film {
    // Les attributs de ma classe Film
    String title;
    String genreDeFilm;
    String realisateur;

    // Constructeur de Film
    public Film(String title, String genreDeFilm, String realisateur) {
        this.title = title;
        this.genreDeFilm = genreDeFilm;
        this.realisateur = realisateur;
    }
}