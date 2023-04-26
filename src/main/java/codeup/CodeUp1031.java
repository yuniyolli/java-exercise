package codeup;

import java.util.Scanner;

public class CodeUp1031 {
    public static void main(String[] args) {
        //10진수 받아 8진수로 표현하기
        Scanner decimal = new Scanner(System.in);
        int decimalIn = decimal.nextInt();
        System.out.printf("%o", decimalIn);


    }
}
