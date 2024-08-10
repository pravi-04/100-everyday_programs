public class maxsum {
    public int FindMaxSum(int arr[], int n)
    {
         if (n == 0) return 0;
        if (n == 1) return arr[0];
        
        int loot_prev2 = 0; // Money looted till the house before the previous house
        int loot_prev = arr[0]; // Money looted till the previous house
        
        for (int i = 1; i < n; i++) {
            int loot_current = Math.max(arr[i] + loot_prev2, loot_prev);
            loot_prev2 = loot_prev;
            loot_prev = loot_current;
        }
        
        return loot_prev;
    }
}
