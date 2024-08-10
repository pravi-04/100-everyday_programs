

import java.util.Arrays;
import java.util.Collections;

public class SortArray {

    public static void main(String[] args) {
        int[] arr = { 5, 2, 9, 1, 5, 6, 7, 3, 4 };
        int n = arr.length;
        int mid = n / 2;
        int[] firstHalf = Arrays.copyOfRange(arr, 0, mid);
        Arrays.sort(firstHalf);
        Integer[] secondHalf = new Integer[n - mid];
        for (int i = mid; i < n; i++) {
            secondHalf[i - mid] = arr[i];
        }
        Arrays.sort(secondHalf, Collections.reverseOrder());

        for (int i = 0; i < mid; i++) {
            arr[i] = firstHalf[i];
        }
        for (int i = mid; i < n; i++) {
            arr[i] = secondHalf[i - mid];
        }

        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
