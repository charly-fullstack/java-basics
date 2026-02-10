package basics;

public class Joueur {
    private String nomJoueur;
    private String couleur;
    private int age;
    private int dorsale;
    private int poids;
    private float vitesse;

    public Joueur(String nomJoueur, String couleur, int ageJoeur, int dorsale, int poids, int vitesse) {
        this.nomJoueur = nomJoueur;
        this.couleur = couleur;
        this.age = ageJoeur;
        this.dorsale = dorsale;
        this.poids = poids;
        this.vitesse = vitesse;
    }
    public void courir() {
        System.out.println(nomJoueur + " est en train de courir.");
    }
    public void jouer() {
        System.out.println(nomJoueur + " est en train de jouer.");
    }

    // Getters & Setters
    public String getNomJoueur(String nomJoueur) {return nomJoueur; }
    public void setNomJoueur(String nomJoueur) {this.nomJoueur = nomJoueur; }

    public String getCouleur(String couleur) {return couleur; }
    public void setCouleur(String couleur) {this.couleur = couleur; }

    public int getAge(int age) {return age; }
    public void setAge(int age) {this.age = age; }

    public int getDorsale(int dorsale) {return dorsale; }
    public void setDorsale(int dorsale) {this.dorsale = dorsale; }

    public int getPoids(int poids) {return poids; }
    public void setPoids(int poids) {this.poids = poids; }

    public float getVitesse(float vitesse) {return vitesse; }
    public void setVitesse(float vitesse) {this.vitesse = vitesse;}

}

