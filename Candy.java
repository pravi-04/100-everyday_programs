

import java.util.*;

public class Candy {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int candies = n;
            int i = 0;
            for (i = 0; i < n - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    candies += 1;
                } else if (i > 0 && arr[i] > arr[i - 1]) {
                    candies += 1;
                }
            }
            if (arr[i] > arr[i - 1]) {
                candies += 1;
            }
            System.out.println(candies);
        }
    }
}