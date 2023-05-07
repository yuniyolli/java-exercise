package codeup;

import java.util.Scanner;

public class CodeUp1046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val1 = sc.nextInt();
        int val2 = sc.nextInt();
        int val3 = sc.nextInt();

        int valSum = val1 + val2 + val3;

        System.out.println(valSum);
        System.out.printf("%.1f", (float)valSum/3);
    }
}
