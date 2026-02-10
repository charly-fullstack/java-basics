package basics;


class Book {

    // Notre classe main()
    public static void main(String[] args) {
        // Initialisation et création d'un objet
        Book myBook = new Book("Jolie fleur", "Charles", 400, "Charly", "01.12.2025");

        System.out.println("Le livre est intitulé : " + myBook.titre + ".");
        System.out.println("Le nom de l'auteur est " + myBook.auteur + ".");
        System.out.println("Nombre de pages : " + myBook.nombreDePages + ".");
    }

    String titre;
    String auteur;
    int nombreDePages;
    String editeur;
    String dateDePublication;

    // Constructeur de notre classe
    public Book(String titre, String auteur, int nombreDePages, String editeur, String dateDePublication) {
        this.titre = titre;
        this.auteur = auteur;
        this.nombreDePages = nombreDePages;
        this.editeur = editeur;
        this.dateDePublication = dateDePublication;
    }


}
