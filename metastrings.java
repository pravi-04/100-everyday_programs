public class metastrings {
    boolean metaStrings(String S1, String S2) 
    { 
        if (S1.length() != S2.length()) {
            return false;
        }

        int n = S1.length();
        int firstMismatch = -1;
        int secondMismatch = -1;

        // Traverse both strings and find the mismatched positions
        for (int i = 0; i < n; i++) {
            if (S1.charAt(i) != S2.charAt(i)) {
                if (firstMismatch == -1) {
                    firstMismatch = i;
                } else if (secondMismatch == -1) {
                    secondMismatch = i;
                } else {
                    // More than two mismatched positions
                    return false;
                }
            }
        }

        // If there are exactly two mismatched positions, check the swap condition
        if (secondMismatch != -1) {
            return S1.charAt(firstMismatch) == S2.charAt(secondMismatch) &&
                   S1.charAt(secondMismatch) == S2.charAt(firstMismatch);
        }

        // If strings are already equal or only one mismatch found
        return false;

    }
    
}
