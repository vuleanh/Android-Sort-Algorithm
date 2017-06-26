package com.anvu.androidsortalgorithm;

/**
 * Created by vuanh on 6/15/17.
 */

public class SortUtil {


    /**
     * Bubble sort
     * - for loop all item
     *
     * @param input
     * @return
     */
    public static int[] bubbleSort(int[] input) {
        int temp;
        boolean isSwapped;

        for (int i = 0; i < input.length - 1; i++) {
            for (int j = 1; j < input.length - 1 - i; j++) {
                isSwapped = false;
                if (input[j] < input[j - 1]) {
                    temp = input[j - 1];
                    input[j - 1] = input[i];
                    input[i] = temp;
                    isSwapped = true;
                }
                if (!isSwapped) {
                    return input;
                }
            }
        }

        return input;
    }
}
