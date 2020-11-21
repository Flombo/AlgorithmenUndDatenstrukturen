package Übung4;

public class PowerFunctionsTest {

    public static void main(String[] args) {

        PowerFunctions.resetCounters();

        double sumExp = 0.0;
        int range = 10000;

        for (int i = 0; i < range; i++) {

            double x = Math.random();
            int n = (int)(1000 * x);

            sumExp += n;

            PowerFunctions.power(x, n);
            PowerFunctions.fastPower(x, n);
        }
            System.out.println("Durchschnitt der Exponenten : " + (sumExp / range));
            System.out.println("Durchschnitt der Multiplikationen der Methode power: " + (double)PowerFunctions.getCountPower() / range);
            System.out.println("Durchschnitt der Multiplikationen der Methode fastPower: " + (double)PowerFunctions.getCountFastPower() / range);
    }

}
