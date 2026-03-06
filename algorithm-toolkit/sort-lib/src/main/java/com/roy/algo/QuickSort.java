package com.roy.algo;

public class QuickSort {

    

    public void sort(int[] arr) {

        SortHelper.validateArray(arr);

        quickSort(arr, 0, arr.length - 1);
    }

    private void quickSort(int[] arr, int low, int high) {

        if (low < high) {

            int pivotIndex = SortHelper.partition(arr, low, high);

            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    

    public int quickSelect(int[] arr, int k) {

        SortHelper.validateArray(arr);

        if (k < 1 || k > arr.length)
            throw new IllegalArgumentException("k is out of bounds");

        return quickSelect(arr, 0, arr.length - 1, k - 1);
    }

    private int quickSelect(int[] arr, int low, int high, int kIndex) {

        if (low <= high) {

            int pivotIndex = SortHelper.partition(arr, low, high);

            if (pivotIndex == kIndex)
                return arr[pivotIndex];

            if (pivotIndex > kIndex)
                return quickSelect(arr, low, pivotIndex - 1, kIndex);
            else
                return quickSelect(arr, pivotIndex + 1, high, kIndex);
        }

        return -1;
    }
}