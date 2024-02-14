package org.example.codesolution.arrayrotation;

public class ArrayRotation {

    public static int[] rotateArray(int[] arr, int k) {

        int n = arr.length;

        // Handle cases where k is negative or larger than the length of the array
        k = k % n;
        if (k < 0) {
            k += n;
        }

        int[] rotatedArr = new int[n];
        for (int i = 0; i < n; i++) {
            // Calculate the new index after rotation
            int newIndex = (i + k) % n;
            rotatedArr[newIndex] = arr[i];
        }

        return rotatedArr;
    }

}
