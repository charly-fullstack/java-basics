package basics;

/// Quand une fonction ou une méthode n'affiche rien ou ne retourne rien, elle est précedée du mot 'void'
/// Mais lorsqu'elle affiche ou retourne quelque chose, elle n'est pas précedée du mot clé 'void'

public class Voiture {
    private String couleur;
    private String marque;
    private String matricule;
    private int vitesseMax;

    public Voiture(String couleur, String marque, String matricule, int vitesseMax) {
        this.couleur = couleur;
        this.marque = marque;
        this.matricule = matricule;
        this.vitesseMax = vitesseMax;
    }

    public void rouler() {
        System.out.println("La voiture roule!");
    }
    public void arreter() {
        System.out.println("La voiture s'arrête!");
    }

    // Getters & Setters (l'encapsulation est le principe clé de la POO)
    public String getCouleur() {return couleur; }
    public void setCouleur(String couleur) {this.couleur = couleur; }

    public String getMarque() {return marque; }
    public void setMarque(String marque) {this.marque = marque; }

    public String getMatricule() {return matricule; }
    public void setMatricule(String matricule) {this.matricule = matricule; }

    public int getVitesseMax() {return vitesseMax; }
    public void setVitesseMax(int vitesseMax) {this.vitesseMax = vitesseMax; }
}

