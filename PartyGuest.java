

import java.util.Scanner;

public class PartyGuest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] enter = new int[t];
        int[] leaving = new int[t];
        for (int i = 0; i < t; i++) {
            enter[i] = sc.nextInt();
        }
        for (int i = 0; i < t; i++) {
            leaving[i] = sc.nextInt();
        }
        int guest = enter[0] - leaving[0];
        int maxGuest = Integer.MIN_VALUE;
        for (int i = 1; i < t; i++) {
            guest = guest + enter[i] - leaving[i];
            maxGuest = Math.max(guest, maxGuest);
        }
        System.out.println(maxGuest);
        sc.close();
    }
}
