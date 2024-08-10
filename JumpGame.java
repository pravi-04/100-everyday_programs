

import java.util.Scanner;

public class JumpGame {
    static public boolean canJump(int arr[], int n) {
        int f = n - 1;
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] + i >= f) {
                f = i;
            }
        }
        return f == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(canJump(arr, n));
        sc.close();
    }
}
