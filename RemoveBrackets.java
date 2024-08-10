

import java.util.Scanner;

public class RemoveBrackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String expression = sc.nextLine();
        String output = "";
        for (int i = 0; i < expression.length(); i++) {
            if (expression.charAt(i) == '(' || expression.charAt(i) == ')') {
                continue;
            }
            output += expression.charAt(i);
        }
        System.out.println(output);

        sc.close();
    }
}
