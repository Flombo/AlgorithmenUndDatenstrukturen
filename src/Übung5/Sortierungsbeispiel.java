package Übung5;

import Übung2.Bruch;

public class Sortierungsbeispiel {

    public static void main(String[] args) {
        /**Bruch[] a=  {
                new Bruch(1,8),
                new Bruch(1, 2),
                new Bruch(5,6),
                new Bruch(1,1),
                new Bruch(1, 7),
                new Bruch(8, 10)
        };*/
        //Integer[] a=  {15, 3, 8, 9, 20, 70, 4, 6};
        //Double[] a = {0.01, 50.0, 2.0, 0.05, 100.0, 0.01};
        String[] a = {"15", "3", "8", "9", "20", "70", "4", "6"};
        Sortierung.mergesort(a);
        System.out.print("a: ");

        for (int i=0; i<a.length; ++i) {
            System.out.print(a[i] + " ");
        }

        System.out.println();
    }

}
