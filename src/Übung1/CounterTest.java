package Übung1;

import Übung1.Counter;

public class CounterTest {

    public static void main(String[] args) {
        Counter counter = new Counter();

        for (int i = 0; i < 5; i++) {
            counter.increment();
            System.out.println(counter.get());
        }

        for(int j = 0; j < 5; j++) {
            counter.decrement();
            System.out.println(counter.get());
        }

        counter.save();
        counter.restore();
    }

}
