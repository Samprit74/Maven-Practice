package com.roy.algo;

import java.util.List;

public class LinearSearch {

    // 1D Array
    public int search(int[] arr, int target) {

        SearchHelper.validateArray(arr);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
                return i;
        }

        return -1;
    }

    // List
    public int searchList(List<Integer> list, int target) {

        SearchHelper.validateList(list);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == target)
                return i;
        }

        return -1;
    }

    // 2D Array
    public int search(int[][] matrix, int target) {

        SearchHelper.validateMatrix(matrix);

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {

                if (matrix[i][j] == target)
                    return j;
            }
        }

        return -1;
    }

    // List of List
    public int searchListMatrix(List<List<Integer>> matrix, int target) {

        SearchHelper.validateListMatrix(matrix);

        for (List<Integer> row : matrix) {

            for (int i = 0; i < row.size(); i++) {

                if (row.get(i) == target)
                    return i;
            }
        }

        return -1;
    }

    // List of Arrays
    public int searchListArray(List<int[]> matrix, int target) {

        SearchHelper.validateListArray(matrix);

        for (int[] row : matrix) {

            for (int i = 0; i < row.length; i++) {

                if (row[i] == target)
                    return i;
            }
        }

        return -1;
    }
}