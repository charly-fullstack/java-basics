package basics;

public class NombresPairsAvecWhile {

    public static void main(String[] args) {

        NombresPairsAvecWhile n2 = new NombresPairsAvecWhile();
        n2.afficherNombresPairs();

    }

    void afficherNombresPairs() {
        int i = 1;
        while (i <= 100 ) {
          if (i % 2 == 0) {
              System.out.println(i + " : est un nombre pair." );
          }
          i++;
        }
    }
}
