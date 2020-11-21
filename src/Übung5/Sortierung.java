package Übung5;

import java.util.ArrayList;
import java.util.Arrays;

public class Sortierung {

    private static Comparable leftElement;
    private static Comparable rightElement;

    public static void mergesort(Comparable[] x) {
        int center = x.length / 2;

        Comparable[] left = splitArrayIntoHalves(0, center, x);
        Comparable[] right = splitArrayIntoHalves(center, x.length, x);

        System.out.println(center + " " + Arrays.toString(left) + " " + Arrays.toString(right));

        sort(0, 1, left);
        sort(0, 1, right);

        merge(left, right, x);
    }

    private static void merge(Comparable[] left, Comparable[] right, Comparable[] x) {
        int j = 0;
        int i = 0;
        while (j < x.length) {
            if (i < left.length) {
                Comparable l = left[i];
                Comparable r = right[i];

                if (l.compareTo(r) > 0) {
                    x[j] = r;
                    x[j + 1] = l;
                } else if (r.compareTo(l) > 0) {
                    x[j] = l;
                    x[j + 1] = r;
                }

                //checks, if precursor is greater than successor.
                if(j > 0) {
                    if(x[j-1].compareTo(x[j]) > 0) {
                        Comparable xl = x[j-1];
                        Comparable xr = x[j];

                        x[j-1] = xr;
                        x[j] = xl;
                    }
                }

                i++;
            }
            j+=2;
        }
    }

    private static void sort(int l, int r, Comparable[] halfArray) {
        //array will be checked if sorted in every method-call.
        if(!checkIfSorted(halfArray)) {
            leftElement = halfArray[l];
            rightElement = halfArray[r];

            System.out.println("Array : " + Arrays.toString(halfArray) + " l : " + l + " r : " + r);

            //checks if left-element is greater than right-element
            if (leftElement.compareTo(rightElement) > 0) {
                //switches order between right- and left-element
                halfArray[l] = rightElement;
                halfArray[r] = leftElement;

                //if indices r and l aren't greater than array-length they'll be incremented.
                if (r < halfArray.length - 1 && l < halfArray.length - 2) {
                    r++;
                    l++;
                    sort(l, r, halfArray);
                    //else they will be reset.
                } else {
                    r = 1;
                    l = 0;
                    sort(l, r, halfArray);
                }

                //checks if right-element is greater than left-element. This means the indices must be incremented.
            } else if (rightElement.compareTo(leftElement) > 0) {
                //if indices didn't reach the last array position they will be incremented.
                if (r < halfArray.length - 1) {
                    r++;
                    l++;
                    sort(l, r, halfArray);
                    //if they reached the last position they will be reset.
                } else {
                    r = 1;
                    l = 0;
                    sort(l, r, halfArray);
                }
            }
        }
    }

    private static boolean checkIfSorted(Comparable[] halfArray) {
        boolean isSorted = true;

        for (int i = 0; i < halfArray.length - 1; i++) {
            if (halfArray[i].compareTo(halfArray[i + 1]) > 0) {
                isSorted = false;
                break;
            }
        }

        return isSorted;
    }

    private static Comparable[] splitArrayIntoHalves(int start, int end, Comparable[] referenceArray) {
        ArrayList<Comparable>halfArray = new ArrayList<>();

        for (int i = start; i < end; i++) {
            halfArray.add(referenceArray[i]);
        }

        return halfArray.toArray(new Comparable[halfArray.size()]);
    }

}
