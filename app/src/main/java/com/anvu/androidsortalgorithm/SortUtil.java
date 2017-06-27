package com.anvu.androidsortalgorithm;

/**
 * Created by vuanh on 6/15/17.
 */

public class SortUtil {


    /**
     * Bubble sort
     * <p>
     * Best case O(n)
     * Worst cae O(n^2)
     *
     * @param input
     * @return
     */
    public static int[] bubbleSort(int[] input) {
        int temp;
        boolean isSwapped;
        for (int i = 0; i < input.length - 1; i++) {
            isSwapped = false;
            for (int j = 1; j < input.length - 1 - i; j++) {
                if (input[j] < input[j - 1]) {
                    temp = input[j - 1];
                    input[j - 1] = input[j];
                    input[j] = temp;
                    isSwapped = true;
                }
            }
            if (!isSwapped) {
                return input;
            }
        }
        return input;
    }

    /**
     * Selection
     * <p>
     * Best case: O(n^2)
     * Worst case: O(n^2)
     *
     * @param input
     * @return
     */
    public static int[] selectionSort(int[] input) {
        int temp;
        int min;
        for (int i = 0; i < input.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < input.length; j++) {
                if (input[j] < input[min]) {
                    min = j;
                }
            }

            if (min != i) {
                temp = input[min];
                input[min] = input[i];
                input[i] = temp;
            }
        }
        return input;
    }

    /**
     * Insertion sort
     *
     * @param input
     * @return
     */
    public static int[] insertionSort(int[] input) {
        int valueToInsert;
        int holePosition;
        for (int i = 1; i < input.length; i++) {
            holePosition = i;
            valueToInsert = input[i];

            while (holePosition > 0 && input[holePosition - 1] > valueToInsert) {
                input[holePosition] = input[holePosition - 1];
                holePosition = holePosition - 1;
            }

            input[holePosition] = valueToInsert;
        }
        return input;
    }


}
