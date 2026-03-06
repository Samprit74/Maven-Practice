package com.roy.prac;

import java.util.List;

public class Search {
    public int binary(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int mid = 0;
        while (left <= right) {
            mid = left + (right - left) / 2;

            if (arr[mid] == target)
                return mid;

            else if (arr[mid] > target)
                right = mid - 1;
            else
                left = mid + 1;

        }
        return -1;
    }

    public int binary(List<Integer> arr, int target) {
        int left = 0;
        int right = arr.size() - 1;
        int mid = 0;
        while (left <= right) {
            mid = left + (right - left) / 2;

            if (arr.get(mid) == target)
                return mid;

            else if (arr.get(mid) > target)
                right = mid - 1;
            else
                left = mid + 1;

        }
        return -1;
    }

    public int linear(int[] arr, int t) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == t)
                return i;
        }
        return -1;
    }

    public int linear(List<Integer> arr, int t) {
        int n = arr.size();
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == t)
                return i;
        }
        return -1;
    }
}
