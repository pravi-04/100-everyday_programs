

import java.util.Scanner;

public class Capitalize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = sc.nextLine();

        String[] words = input.split(" ");
        StringBuilder output = new StringBuilder();

        for (String word : words) {
            if (word.length() > 1) {
                String capitalizedWord = word.substring(0, 1).toUpperCase() +
                        word.substring(1, word.length() - 1) +
                        word.substring(word.length() - 1).toUpperCase();
                output.append(capitalizedWord).append(" ");
            } else {

                output.append(word.toUpperCase()).append(" ");
            }
        }

        System.out.println("Result: " + output.toString().trim());

        sc.close();
    }
}
