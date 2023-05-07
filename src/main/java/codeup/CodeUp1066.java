package codeup;

import java.util.Scanner;

public class CodeUp1066 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    /*
    받은 정수를 if문을 사용하여 각각 짝 또는 홀수 출력하기위한 정수 받기
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

     */

        String str = sc.nextLine();

        for (int i = 0; i < str.length() / 2 + 1; i++) {
            char num = str.charAt(i * 2);
            if (num % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }

        }
/* 각각의 정수 if문으로 짝 홀 출력하기
        if (num1 % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
        if (num2 % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
        if (num3 % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }

 */
    }
}
