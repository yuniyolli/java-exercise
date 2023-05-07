package codeup;

import java.util.Scanner;

public class CodeUp1045 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val1 = sc.nextInt();
        int val2 = sc.nextInt();

        System.out.printf("%d\n", val1 + val2);
        System.out.printf("%d\n", val1 - val2);
        System.out.printf("%d\n", val1 * val2);
        System.out.printf("%d\n", val1 / val2);
        System.out.printf("%d\n", val1 % val2);
        System.out.printf("%.2f\n", (float)val1 / val2);

    }

}
