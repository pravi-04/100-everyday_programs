

import java.util.*;

public class MinimumDiffernce {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            int minDiff = Integer.MAX_VALUE;
            for (int i = 0; i < n - 1; i++) {
                minDiff = Math.min(minDiff, Math.abs(arr[i + 1] - arr[i]));
            }
            for (int i = 0; i < n - 1; i++) {
                if (Math.abs(arr[i + 1] - arr[i]) == minDiff) {
                    System.out.print(arr[i] + " " + arr[i + 1]);
                }
            }
        }
    }
}
