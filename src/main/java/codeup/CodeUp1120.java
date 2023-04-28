package codeup;

import java.util.Scanner;

public class CodeUp1120 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int avr1 = sc.nextInt();
        int avr2 = sc.nextInt();
        int avr3 = sc.nextInt();

        System.out.printf("%.2f", (float) (avr1+avr2+avr3) / 3);
    }
}
