package com.roy.algo;

import java.util.List;

public class JumpSearch {

   

    public int search(int[] arr, int target) {

        SearchHelper.validateArray(arr);

        int n = arr.length;
        int step = (int) Math.sqrt(n);
        int prev = 0;

        while (prev < n && arr[Math.min(step, n) - 1] < target) {

            prev = step;
            step += (int) Math.sqrt(n);

            if (prev >= n)
                return -1;
        }

        for (int i = prev; i < Math.min(step, n); i++) {

            if (arr[i] == target)
                return i;
        }

        return -1;
    }

    

    public int search(List<Integer> list, int target) {

        SearchHelper.validateList(list);

        int n = list.size();
        int step = (int) Math.sqrt(n);
        int prev = 0;

        while (prev < n && list.get(Math.min(step, n) - 1) < target) {

            prev = step;
            step += (int) Math.sqrt(n);

            if (prev >= n)
                return -1;
        }

        for (int i = prev; i < Math.min(step, n); i++) {

            if (list.get(i) == target)
                return i;
        }

        return -1;
    }
}