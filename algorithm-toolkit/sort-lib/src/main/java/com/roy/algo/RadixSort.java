package com.roy.algo;

public class RadixSort {

    public void sort(int[] arr) {

        SortHelper.validateArray(arr);

        int max = SortHelper.max(arr);

        for (int exp = 1; max / exp > 0; exp *= 10)
            countSort(arr, exp);
    }

    private void countSort(int[] arr, int exp) {

        int n = arr.length;
        int[] output = new int[n];
        int[] count = new int[10];

        for (int i = 0; i < n; i++)
            count[(arr[i] / exp) % 10]++;

        for (int i = 1; i < 10; i++)
            count[i] += count[i - 1];

        for (int i = n - 1; i >= 0; i--) {

            int index = (arr[i] / exp) % 10;
            output[count[index] - 1] = arr[i];
            count[index]--;
        }

        for (int i = 0; i < n; i++)
            arr[i] = output[i];
    }
}