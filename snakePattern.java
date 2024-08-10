public class snakePattern {
    public static void main(String[] args) {

        int[][] matrix = { { 1, 2, 3 }, { 5, 6, 7 }, { 9, 10, 11 } };
        int length = 3;

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length / 2; j++) {
                if (i % 2 != 0) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[i][length - j - 1];
                    matrix[i][length - j - 1] = temp;
                }

            }
        }

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
