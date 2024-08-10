public class FirstNonRepeat {
    public static void main(String[] args) {
        String s = "teeterson";
        int n = s.length();
        int count = 0;

        for (int i = 0; i < n; i++) {
            count = 0;
            for (int j = 0; j < n; j++) {
                if (s.charAt(i) == s.charAt(j) && i != j) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println(s.charAt(i));
                break;
            }

        }
    }

}
