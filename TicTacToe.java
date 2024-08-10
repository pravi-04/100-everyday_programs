import java.util.Scanner;

public class TicTacToe {

    public static void func(int n, int matrix[][], int element) {
        int i = (element - 1) / n; // 9 - 1 = 8 / 3 = 2
        int j = (element - 1) % n; // 9 - 1 = 8 % 3 = 2
        System.out.println(i);
        System.out.println(j);
    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the n: ");
            int n = sc.nextInt();
            System.out.print("Enter the element to get index: "); // Elements needs to sequenced
            int element = sc.nextInt();

            int[][] matrix = new int[n][n];
            int count = 1;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = count;
                    count += 1;
                }
            }
            func(n, matrix, element);
        }

    }
}
