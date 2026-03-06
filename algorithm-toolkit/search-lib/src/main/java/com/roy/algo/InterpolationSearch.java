package com.roy.algo;

import java.util.List;

public class InterpolationSearch {

    

    public int search(int[] arr, int target) {

        SearchHelper.validateArray(arr);

        int low = 0;
        int high = arr.length - 1;

        while (low <= high && target >= arr[low] && target <= arr[high]) {

            if (low == high) {

                if (arr[low] == target)
                    return low;

                return -1;
            }

            int pos = low + ((target - arr[low]) * (high - low)) /
                      (arr[high] - arr[low]);

            if (arr[pos] == target)
                return pos;

            if (arr[pos] < target)
                low = pos + 1;
            else
                high = pos - 1;
        }

        return -1;
    }

    

    public int search(List<Integer> list, int target) {

        SearchHelper.validateList(list);

        int low = 0;
        int high = list.size() - 1;

        while (low <= high && target >= list.get(low) && target <= list.get(high)) {

            if (low == high) {

                if (list.get(low) == target)
                    return low;

                return -1;
            }

            int pos = low + ((target - list.get(low)) * (high - low)) /
                      (list.get(high) - list.get(low));

            if (list.get(pos) == target)
                return pos;

            if (list.get(pos) < target)
                low = pos + 1;
            else
                high = pos - 1;
        }

        return -1;
    }
}