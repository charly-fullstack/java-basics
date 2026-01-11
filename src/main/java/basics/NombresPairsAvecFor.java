package basics;

public class NombresPairsAvecFor {

    public static void main(String[] args) {
        NombresPairsAvecFor n1 = new NombresPairsAvecFor();
        n1.afficherNombresPairs();
    }

    void afficherNombresPairs() {

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " : est pair.");
            }
        }

    }

}
