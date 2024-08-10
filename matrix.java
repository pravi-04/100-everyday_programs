
public class matrix {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 0, 0 }, { 2, 3, 0 }, { 1, 2, 3 } }; // Lower triangle
        int length = 3;

        // for (int i = 0; i < length; i++) {
        // for (int j = 0; j < i; j++) {
        // if (matrix[i][j] != 0) {
        // System.out.println("Not Upper Triangle Matrix");
        // return;
        // }
        // }
        // }

        // System.out.println("Upper Triangle Matrix");

        for (int i = 0; i < (length / 2) + 1; i++) {
            for (int j = i + 1; j < length; j++) {
                if (matrix[i][j] != 0) {
                    System.out.println("Not Lower Triangle Matrix");
                    return;
                }
            }
        }

        System.out.println("Lower Triangle Matrix");
    }
}