package basics;

public class Music {

    public static void main(String[] args) {
        // Création d'un objet music
        Music music = new Music("Chris Brown", "With you", "Amour", "Chris Brown music");
        System.out.println(music.nomArtiste + ".");
        music.jouer();
    }

    String nomArtiste;
    String titre;
    String genreMusical;
    String editeur;

    public void jouer() {
        System.out.println(nomArtiste + " joue à la musique.");
    }

    public Music(String nomArtiste, String titre, String genreMusical, String editeur) {
        this.nomArtiste = nomArtiste;
        this.titre = titre;
        this.genreMusical = genreMusical;
        this.editeur = editeur;
    }

}
