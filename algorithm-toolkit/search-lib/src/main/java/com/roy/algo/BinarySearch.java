package com.roy.algo;

import java.util.List;

public class BinarySearch {

    // 1D Array
    public int search(int[] arr, int target) {

        SearchHelper.validateArray(arr);

        int left = 0;
        int right = arr.length - 1;

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

    // List
    public int search(List<Integer> list, int target) {

        SearchHelper.validateList(list);

        int left = 0;
        int right = list.size() - 1;

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

    // 2D Array
    public int search(int[][] matrix, int target) {

        SearchHelper.validateMatrix(matrix);

        for (int i = 0; i < matrix.length; i++) {

            int left = 0;
            int right = matrix[i].length - 1;

            while (left <= right) {

                int mid = left + (right - left) / 2;

                if (matrix[i][mid] == target)
                    return mid;

                if (matrix[i][mid] < target)
                    left = mid + 1;
                else
                    right = mid - 1;
            }
        }

        return -1;
    }

    // List of List
    public int searchListMatrix(List<List<Integer>> matrix, int target) {

        SearchHelper.validateListMatrix(matrix);

        for (List<Integer> row : matrix) {

            int left = 0;
            int right = row.size() - 1;

            while (left <= right) {

                int mid = left + (right - left) / 2;

                if (row.get(mid) == target)
                    return mid;

                if (row.get(mid) < target)
                    left = mid + 1;
                else
                    right = mid - 1;
            }
        }

        return -1;
    }

    // List of Arrays
    public int searchListArray(List<int[]> matrix, int target) {

        SearchHelper.validateListArray(matrix);

        for (int[] row : matrix) {

            int left = 0;
            int right = row.length - 1;

            while (left <= right) {

                int mid = left + (right - left) / 2;

                if (row[mid] == target)
                    return mid;

                if (row[mid] < target)
                    left = mid + 1;
                else
                    right = mid - 1;
            }
        }

        return -1;
    }
}