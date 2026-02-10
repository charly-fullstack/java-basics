package basics;

public class DevJava {
    public static void main(String[] args) {
        Marque yamaha = new Marque("yamaha");
        Moto moto = new Moto(6, "Noire", yamaha);
        System.out.println("La moto a la couleur " + moto.couleur + ".");
        System.out.println("La vitesse maximale de la moto est de " + moto.nombreDeVitesse + " vitesses.");
        System.out.println("La marque de votre moto est " + yamaha.nom + ".");
        moto.rouler();
        moto.arreter();
        Film film = new Film("L'art de créer", "Technologique", "Jet Lee");
        System.out.println(film.genreDeFilm);
        System.out.println(film.realisateur);
    }
}

class Moto {
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
    String nom;

    // Constructeur de la classe Marque
    public Marque(String nom) {
        this.nom = nom;
    }
}

class Film {

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