package com.roy.algo;

import java.util.List;

public class SearchHelper {

    public static void validateArray(int[] arr) {

        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }
    }

    public static boolean isSorted(int[] arr) {

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] < arr[i - 1])
                return false;
        }

        return true;
    }

    public static void validateList(List<Integer> list) {

    if (list == null || list.isEmpty()) {
        throw new IllegalArgumentException("List cannot be null or empty");
    }
}

public static void validateMatrix(int[][] matrix) {
    if (matrix == null || matrix.length == 0)
        throw new IllegalArgumentException("Matrix cannot be null or empty");
}

public static void validateListMatrix(List<List<Integer>> matrix) {
    if (matrix == null || matrix.isEmpty())
        throw new IllegalArgumentException("Matrix cannot be null or empty");
}

public static void validateListArray(List<int[]> matrix) {
    if (matrix == null || matrix.isEmpty())
        throw new IllegalArgumentException("Matrix cannot be null or empty");
}
}