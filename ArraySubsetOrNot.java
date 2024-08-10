

import java.util.Arrays;

public class ArraySubsetOrNot {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5 };
        int[] arr2 = { 2, 4, 5 };

        if (isSubsetWithoutFunctions(arr1, arr2)) {
            System.out.println("arr2 is a subset of arr1");
        } else {
            System.out.println("arr2 is not a subset of arr1");
        }
    }

    public static boolean isSubsetWithoutFunctions(int[] arr1, int[] arr2) {

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int i = 0, j = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr1[i] == arr2[j]) {
                i++;
                j++;
            } else {
                return false;
            }
        }

        return j == arr2.length;
    }
}
