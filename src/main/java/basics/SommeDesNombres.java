package basics;

public class SommeDesNombres {

    public static void main(String[] args) {
        SommeDesNombres s = new SommeDesNombres();
        s.calculSomme();
    }

    void calculSomme() {
        int somme = 0;
        for (int i = 1; i <= 100; i++) {
            somme += i;
        }

        System.out.println("La somme des nombres de 1 à 100 est égale à : " + somme);

    }
}
