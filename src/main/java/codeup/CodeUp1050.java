package codeup;

import java.util.Scanner;

public class CodeUp1050 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int val1 = sc.nextInt();
        int val2 = sc.nextInt();

        if (val1 == val2) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
