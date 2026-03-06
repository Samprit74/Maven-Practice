package com.roy.algo;

public class CountingSort {

    public void sort(int[] arr) {

        SortHelper.validateArray(arr);

        int max = SortHelper.max(arr);
        int[] count = new int[max + 1];

        for (int value : arr)
            count[value]++;

        int index = 0;

        for (int i = 0; i < count.length; i++) {

            while (count[i] > 0) {

                arr[index++] = i;
                count[i]--;
            }
        }
    }
}