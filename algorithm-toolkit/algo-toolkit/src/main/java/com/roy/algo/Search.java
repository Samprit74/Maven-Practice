package com.roy.algo;

import java.util.List;

public final class Search {

    private static final BinarySearch binary = new BinarySearch();
    private static final LinearSearch linear = new LinearSearch();
    private static final JumpSearch jump = new JumpSearch();
    private static final ExponentialSearch exponential = new ExponentialSearch();
    private static final InterpolationSearch interpolation = new InterpolationSearch();

    private Search() {}

    public static int binary(int[] arr, int target) {
        return binary.search(arr, target);
    }

    public static int binaryList(List<Integer> list, int target) {
        return binary.search(list, target);
    }

    public static int binary(int[][] matrix, int target) {
        return binary.search(matrix, target);
    }

    public static int binaryListMatrix(List<List<Integer>> matrix, int target) {
        return binary.searchListMatrix(matrix, target);
    }

    public static int binaryListArray(List<int[]> matrix, int target) {
        return binary.searchListArray(matrix, target);
    }

    public static int linear(int[] arr, int target) {
        return linear.search(arr, target);
    }

    public static int linearList(List<Integer> list, int target) {
        return linear.searchList(list, target);
    }

    public static int linear(int[][] matrix, int target) {
        return linear.search(matrix, target);
    }

    public static int linearListMatrix(List<List<Integer>> matrix, int target) {
        return linear.searchListMatrix(matrix, target);
    }

    public static int linearListArray(List<int[]> matrix, int target) {
        return linear.searchListArray(matrix, target);
    }

    public static int jump(int[] arr, int target) {
        return jump.search(arr, target);
    }

    public static int jumpList(List<Integer> list, int target) {
        return jump.search(list, target);
    }

    public static int exponential(int[] arr, int target) {
        return exponential.search(arr, target);
    }

    public static int exponentialList(List<Integer> list, int target) {
        return exponential.search(list, target);
    }

    public static int interpolation(int[] arr, int target) {
        return interpolation.search(arr, target);
    }

    public static int interpolationList(List<Integer> list, int target) {
        return interpolation.search(list, target);
    }
}