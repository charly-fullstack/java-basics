package basics;

import java.util.Scanner;

public class FactorielDunNombre {

    public static void main(String[] args) {
        FactorielDunNombre f = new FactorielDunNombre();
        f.calculFactoriel();
    }

    void calculFactoriel() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Veuillez entrer un nombre : ");
        int nombre = scanner.nextInt();
        int resultat = 1;
        for (int i = 1; i <= nombre; i++) {
            resultat = resultat * i;
        }

        System.out.println(nombre + "! = " + resultat);
        scanner.close();
    }

}


