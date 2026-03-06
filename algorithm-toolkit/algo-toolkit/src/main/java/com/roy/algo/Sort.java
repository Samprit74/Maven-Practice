package com.roy.algo;

public final class Sort {

    private static final QuickSort quick = new QuickSort();
    private static final MergeSort merge = new MergeSort();
    private static final InsertionSort insertion = new InsertionSort();
    private static final SelectionSort selection = new SelectionSort();
    private static final ShellSort shell = new ShellSort();
    private static final CountingSort counting = new CountingSort();
    private static final RadixSort radix = new RadixSort();
    private static final BucketSort bucket = new BucketSort();

    private Sort() {
    }

    public static void quick(int[] arr) {
        quick.sort(arr);
    }

    public static int quickSelect(int[] arr, int k) {
        return quick.quickSelect(arr, k);
    }

    public static void merge(int[] arr) {
        merge.sort(arr);
    }

    public static void insertion(int[] arr) {
        insertion.sort(arr);
    }

    public static void selection(int[] arr) {
        selection.sort(arr);
    }

    public static void shell(int[] arr) {
        shell.sort(arr);
    }

    public static void counting(int[] arr) {
        counting.sort(arr);
    }

    public static void radix(int[] arr) {
        radix.sort(arr);
    }

    public static void bucket(int[] arr) {
        bucket.sort(arr);
    }
}