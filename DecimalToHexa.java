

import java.util.Scanner;

public class DecimalToHexa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = sc.nextInt();

        String hex = decimalToHex(decimal);

        System.out.println("Hexadecimal representation: " + hex.toUpperCase());

        sc.close();
    }

    public static String decimalToHex(int decimal) {
        if (decimal == 0)
            return "0";

        StringBuilder hex = new StringBuilder();
        char[] hexDigits = "0123456789ABCDEF".toCharArray();

        while (decimal > 0) {
            int remainder = decimal % 16;
            hex.insert(0, hexDigits[remainder]);
            decimal /= 16;
        }

        return hex.toString();
    }
}
