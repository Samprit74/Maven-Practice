package com.roy.algo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BucketSort {

    public void sort(int[] arr) {

        SortHelper.validateArray(arr);

        int max = SortHelper.max(arr);
        int n = arr.length;

        List<List<Integer>> buckets = new ArrayList<>(n);

        for (int i = 0; i < n; i++)
            buckets.add(new ArrayList<>());

        for (int value : arr) {

            int index = (value * n) / (max + 1);
            buckets.get(index).add(value);
        }

        int k = 0;

        for (List<Integer> bucket : buckets) {

            Collections.sort(bucket);

            for (int value : bucket)
                arr[k++] = value;
        }
    }
}