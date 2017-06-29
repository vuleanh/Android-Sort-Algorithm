package com.anvu.androidsortalgorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
     * <p>
     * Best case: O(n)
     * Worst case: O(n^2)
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


    /**
     * Merge Sort
     *
     * @param input
     * @return
     */
    public static List<Integer> mergeSort(List<Integer> input) {

        if (input.size() <= 1) return input;

        System.out.println(input.size());

        List<Integer> list1 = input.subList(0, input.size() / 2);
        List<Integer> list2 = input.subList(input.size() / 2 + 1, input.size() - 1);


        list1 = mergeSort(list1);
        list2 = mergeSort(list2);

        return merge(list1, list2);

    }


    public static List<Integer> merge(List<Integer> array1, List<Integer> array2) {

        List<Integer> result = new ArrayList<>();

        while (array1.size() > 0 && array2.size() > 0) {
            if (array1.get(0) > array2.get(0)) {
                result.add(array2.get(0));
                array2.remove(0);
            } else {
                result.add(array1.get(0));
                array1.remove(0);
            }
        }

        while (array1.size() > 0) {
            result.addAll(array1);
        }

        while (array2.size() > 0) {
            result.addAll(array2);
        }

        return result;
    }
}
