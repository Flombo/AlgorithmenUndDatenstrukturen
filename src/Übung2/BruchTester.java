package Übung2;

public class BruchTester {

    public static void main(String[] args) {
        Bruch a = new Bruch(2, 2);
        Bruch b = new Bruch(1, 3);
        b.add(a);
        System.out.println("b= " + b.get());

        Bruch e = e(4);
        System.out.println(e.get());
    }

    public static Bruch e(int n) {
        int faktor = 1;
        Bruch start = new Bruch(1, faktor);
        for (int i = 1; i <= n; i++) {
            faktor *= i;
            Bruch loop = new Bruch(1, faktor);
            start.add(loop);
        }
        return start;
    }

}
