

import java.util.Scanner;

public class ReplaceWord {
    public static String replaceWord(String str, String target, String replacement) {
        String[] words = str.split(" ");
        StringBuilder sb = new StringBuilder();

        for (String word : words) {
            if (word.equals(target)) {
                sb.append(replacement);
            } else {
                sb.append(word);
            }
            sb.append(" ");
        }

        return sb.toString().trim();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a input string: ");
        String str = sc.nextLine();
        String target = sc.nextLine();
        String replacement = sc.nextLine();
        sc.close();
        System.out.println(replaceWord(str, target, replacement));
    }
}
