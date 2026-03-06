package com.roy.algo;

public class SortHelper {

    public static void validateArray(int[] arr) {

        if (arr == null || arr.length == 0)
            throw new IllegalArgumentException("Array cannot be null or empty");
    }

    public static void swap(int[] arr, int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int partition(int[] arr, int low, int high) {

        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {

            if (arr[j] < pivot) {

                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, high);

        return i + 1;
    }

    public static int max(int[] arr) {

        int max = arr[0];

        for (int value : arr)
            if (value > max)
                max = value;

        return max;
    }
}