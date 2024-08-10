
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String expression = sc.nextLine();

        Set<Character> vowels = new HashSet<>();
        for (char c : "aeiouAEIOU".toCharArray()) {
            vowels.add(c);
        }

        StringBuilder output = new StringBuilder();
        for (int i = 0; i < expression.length(); i++) {
            char currentChar = expression.charAt(i);
            if (!vowels.contains(currentChar)) {
                output.append(currentChar);
            }
        }

        System.out.println(output.toString());
        sc.close();
    }
}
