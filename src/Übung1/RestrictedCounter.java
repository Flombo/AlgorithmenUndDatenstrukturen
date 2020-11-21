package Übung1;

import Übung1.Counter;

public class RestrictedCounter extends Counter {

    private int maxCapacity;
    private int x;

    public RestrictedCounter(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public int freeCapacity() {
        return this.maxCapacity;
    }



    public void increment() {
        if(x <= this.maxCapacity) {
            ++this.x;
        } else {
            System.out.println("Error: x overreached max. capacity");
        }
    } // Hochzählen

}
