import java.util.Scanner;

public class Palindrome {

    public static void palindrome(String s) {
        int i = 0;
        int j = s.length() - 1;

        while (i <= j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            } else {
                System.out.println("Not a Palindrome");
                return;
            }
        }
        System.out.println("Palindrome");

    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the String: ");
            String string = sc.nextLine();
            palindrome(string);
        }
    }
};
