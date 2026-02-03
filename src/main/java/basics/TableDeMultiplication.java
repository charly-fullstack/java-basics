package basics;

import java.util.Scanner;

public class TableDeMultiplication {

    public static void main(String[] args) {
        TableDeMultiplication t = new TableDeMultiplication();
        t.afficherTableDeMultiplication();
    }

    void afficherTableDeMultiplication() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez un nombre : ");
        int nombre = scanner.nextInt(); 
//        scanner.close(); // facultatif ici, car System.in
        for (int i = 1; i <= 10; i++ ) {
            System.out.println(nombre + " * " + i + " = " + (nombre * i));
        }
    }
}
