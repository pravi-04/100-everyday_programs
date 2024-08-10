// import java.util.*;

// public class sumOfdiagonal {

//     public static void sumDiagonal(int n, int matrix[][]) {

//         int sum1 = 0;
//         int sum2 = 0;

//         for (int i = 0; i < n; i++) {
//             sum1 += matrix[i][i];
//             sum2 += matrix[i][n - i - 1];
//         }

//         if (sum1 == sum2)
//             System.out.println("Equal");
//         else
//             System.out.println("Not Equal");
//     }

//     public static void main(String[] args) {

//         try (Scanner sc = new Scanner(System.in)) {
//             System.out.print("Enter the n: ");
//             int n = sc.nextInt();
//             int[][] matrix = new int[n][n];
//             for (int i = 0; i < n; i++) {
//                 for (int j = 0; j < n; j++) {
//                     matrix[i][j] = sc.nextInt();
//                 }
//             }
//             sumDiagonal(n, matrix);
//         }

//     }
// }

import java.util.Scanner;

public class sumOfdiagonal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Matrix:");
        int sum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i == 0 || j == rows - 1 || i + j == rows - 1) {
                    sum = sum + matrix[i][j];
                }
                System.out.println(); // Move to the next row
            }
        }
        System.out.println(sum);
        scanner.close();
    }
}