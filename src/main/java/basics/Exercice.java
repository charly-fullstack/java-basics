package basics;

public class Exercice {
    /** Notre programme commence ici
     * @Charly Développeur Full-Stack Java*/
    public int width = 4;
    private int borderWith = 1;

    public static void main(String[] args) {
         int mainWidth = 28;
         System.out.println(mainWidth);
         Exercice exercice = new Exercice();
         exercice.nombreIteration();
         exercice.boucleDoWhile();
         exercice.printValues();
    }

    public void printValues() {
        final int newWidth = 12;

        if (true) {
            int pixelSize = 5;
            System.out.println(pixelSize);
        }
        // Quelle variable pourrait être utilisée ici ?
        System.out.println(width);
        System.out.println(newWidth);
        System.out.println(borderWith);
    }

    public void nombreIteration() {
        int loopLimit = 101;
        int iteration = 0;
        for (int i = 5; i < loopLimit; i++) {
            iteration += 1;
        }
        System.out.println(iteration);
    }

    public void boucleWhile() {
       int temperature = 0;
       // Prévision météo
        while (temperature < 100) {
            System.out.println("It's not too hot yet, the temperature is" + temperature + "F");
            temperature -= 1;
        }
        System.out.println("It's too hot now!");
    }

    public void boucleDoWhile() {
        int numberOfCups = 0;
        do {
            System.out.println("I'm feeling sleepy");
            numberOfCups += 1;
            System.out.println("I drunk " + numberOfCups + " cups of coffee");
        } while (numberOfCups < 10);
        System.out.println("I'm feeling awake now!");
    }
}
