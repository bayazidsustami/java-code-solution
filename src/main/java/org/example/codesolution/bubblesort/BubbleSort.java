package org.example.codesolution.bubblesort;

import java.util.Arrays;

public class BubbleSort {

    public static int[] bubbleSortInt(int[] arr) {
        int length = arr.length;
        int[] sortedArray = Arrays.copyOf(arr, length);

        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (sortedArray[j] > sortedArray[j + 1]) {
                    int temp = sortedArray[j];
                    sortedArray[j] = sortedArray[j + 1];
                    sortedArray[j + 1] = temp;
                }
            }
        }
        return sortedArray;
    }

    public static String[] bubbleSortString(String[] arr) {
        int length = arr.length;
        String[] sortedArray = Arrays.copyOf(arr, length);

        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (sortedArray[j].compareTo(sortedArray[j + 1]) > 0) {
                    String temp = sortedArray[j];
                    sortedArray[j] = sortedArray[j + 1];
                    sortedArray[j + 1] = temp;
                }
            }
        }
        return sortedArray;
    }
}
