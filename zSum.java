// public class zSum {
//     public static void main(String[] args) {
//         int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
//         int n = 4;
//         int sum = 0;
//         for (int i = 0; i < n; i++) {

//             if (i == 0 || i == n - 1) {
//                 for (int j = 0; j < n; j++) {
//                     sum += matrix[i][j];
//                 }
//             } else {
//                 sum += matrix[i][n - i - 1];
//             }

//         }

//         System.out.println(sum);
//     }

// }

import java.util.Scanner;

public class zSum {
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
                if (i == 0 || i == rows - 1 || i + j == rows - 1) {
                    sum = sum + matrix[i][j];
                }
            }
        }
        System.out.println(sum);
        scanner.close();
    }
}