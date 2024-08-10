public class ncr {
    static int nCr(int n, int r) {
        if (r > n) {
            return 0;
        }
        if (r == 0 || r == n) {
            return 1;
        }
        
        r = Math.min(r, n - r); // Since C(n, r) == C(n, n-r)
        
        long result = 1;
        for (int i = 0; i < r; i++) {
            result = result * (n - i) / (i + 1);
        }
        
        return (int) result;
    }
    
}
