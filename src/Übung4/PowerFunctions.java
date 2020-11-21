package Übung4;

import Übung1.Counter;

public class PowerFunctions {

    private static final Counter counterPower = new Counter();
    private static final Counter counterFastPower = new Counter();

    public static double power(double x, int n) {
        double y = 1;

        for (int i = 0; i < n; i++) {
            y *= x;
            countPower();
        }
        return y;
    }

    public static double fastPower(double x, int n) {

        double y = 1;

        while (n > 0) {

            if (n % 2 == 1) {
                y *= x;
                countFastPower();
            }

            n = n / 2;
            x = x * x;
            countFastPower();
        }
        return y;
    }

    public static void countPower() {
        counterPower.increment();
    }

    public static void countFastPower() {
        counterFastPower.increment();
    }

    public static void resetCounters() {
        counterFastPower.reset();
        counterPower.reset();
    }

    public static int getCountPower() {
        return counterPower.get();
    }

    public static int getCountFastPower() {
        return counterFastPower.get();
    }

}
