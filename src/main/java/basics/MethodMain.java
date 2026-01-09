package basics;

public class MethodMain {

    public static void main(String[] args) {
        System.out.println();
        TestClass t = new TestClass();
        Test t1 = new Test();
        t.afficherDetails();
        t1.affcherAge();
        System.out.println("===============================");
        t1.afficherMessage();
//        System.out.println(t.firstName);
//        System.out.println(t.lastName);
    }

}
