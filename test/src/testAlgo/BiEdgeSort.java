package testAlgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BiEdgeSort {

    public static int[] biEdgeSort(int[] arr) {
        int n = arr.length;
        if (n == 0) return new int[0];

        int numBuckets = n / 2;
        List<List<Integer>> buckets = new ArrayList<>();
        for (int i = 0; i < numBuckets; i++) {
            buckets.add(new ArrayList<>());
        }

        Arrays.sort(arr);

        for (int i = 0; i < numBuckets; i++) {
            if (i < arr.length) {
                buckets.get(i).add(arr[i]);
            }
            if (n - 1 - i >= 0) {
                buckets.get(i).add(arr[n - 1 - i]);
            }
        }

        int[] result = new int[n];
        int index = 0;
        for (List<Integer> bucket : buckets) {
            for (int value : bucket) {
                result[index++] = value;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11, 90, 68, 58, 45, 78, 13};
        int[] sortedArr = biEdgeSort(arr);
        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.println("Sorted array: " + Arrays.toString(sortedArr));
    }
}
