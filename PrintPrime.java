

import java.util.Scanner;

public class PrintPrime {

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < Math.pow(n, 0.5) + 1; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean pairFound = false;
        System.out.println(isPrime(4));
        for (int i = 2; i <= n; i++) {
            for (int j = i + 1; j <= n; j++) {
                if (isPrime(i) && isPrime(j) && isPrime(i + j)) {
                    System.out.println(i + " " + j);
                    pairFound = true;
                }
            }
        }
        if (!pairFound) {
            System.out.println("No prime pairs found");
        }

        sc.close();
    }
}
