import java.util.HashSet;

public class PairSum {
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, -1, 5};
        int targetSum = 6;
        findPairsWithGivenSum(arr, targetSum);
    }

    public static void findPairsWithGivenSum(int[] arr, int targetSum) {
        
        HashSet<Integer> seenNumbers = new HashSet<>();
        
        System.out.println("Pairs with sum " + targetSum + ":");
        
        for (int number : arr) {
            int complement = targetSum - number;
            
            
            if (seenNumbers.contains(complement)) {
                System.out.println("(" + complement + ", " + number + ")");
            }
            
            
            seenNumbers.add(number);
        }
    }
}
