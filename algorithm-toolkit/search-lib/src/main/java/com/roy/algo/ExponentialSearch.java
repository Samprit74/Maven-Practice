package com.roy.algo;

import java.util.List;

public class ExponentialSearch {

   

    public int search(int[] arr, int target) {

        SearchHelper.validateArray(arr);

        if (arr[0] == target)
            return 0;

        int i = 1;

        while (i < arr.length && arr[i] <= target)
            i *= 2;

        int left = i / 2;
        int right = Math.min(i, arr.length - 1);

        return binarySearch(arr, target, left, right);
    }

    

    public int search(List<Integer> list, int target) {

        SearchHelper.validateList(list);

        if (list.get(0) == target)
            return 0;

        int i = 1;

        while (i < list.size() && list.get(i) <= target)
            i *= 2;

        int left = i / 2;
        int right = Math.min(i, list.size() - 1);

        return binarySearch(list, target, left, right);
    }

    private int binarySearch(int[] arr, int target, int left, int right) {

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (arr[mid] == target)
                return mid;

            if (arr[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return -1;
    }

    private int binarySearch(List<Integer> list, int target, int left, int right) {

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (list.get(mid) == target)
                return mid;

            if (list.get(mid) < target)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return -1;
    }
}