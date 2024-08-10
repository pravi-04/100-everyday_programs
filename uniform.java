import java.util.Scanner;

public class uniform {
    public static void uniformMAtrix(int n, int matrix[][]) {
        int eflag = 0;
        int oflag = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] % 2 == 0) {
                    eflag += 1;
                } else {
                    oflag += 1;
                }

            }
        }
        if (eflag == n * n || oflag == n * n) {
            System.out.println("Yes");
            return;
        }
        System.out.println("No");
    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the n: ");
            int n = sc.nextInt();
            int[][] matrix = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }
            uniformMAtrix(n, matrix);
        }

    }
}
