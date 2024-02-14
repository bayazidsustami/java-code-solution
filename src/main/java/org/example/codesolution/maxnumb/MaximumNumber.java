package org.example.codesolution.maxnumb;

public class MaximumNumber {

    public static int findMaxNumber(int[] arr) {
        var result = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                result = arr[i];
            }
        }
        return result;
    }

}
