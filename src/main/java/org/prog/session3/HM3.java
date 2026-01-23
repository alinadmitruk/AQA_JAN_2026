package org.prog.session3;

import java.util.Arrays;

public class HM3 {

    public static void main(String[] agrs) {
        int[] array = new int[]{2, 5, 7, 5, 6, 4, 4, 12, 1, 9, 10};
        boolean swapped = true;

        while (swapped) {
            swapped = false;

            {
                for (int i = 0; i < array.length - 1; i++) {
                    if (array[i] > array[i + 1]) {
                        int current = array[i];
                        array[i] = array[i + 1];
                        array[i + 1] = current;
                        swapped = true;
                    }

                }
            }

        }
        for (int value : array) {
            System.out.println(value);
        }
    }
}
