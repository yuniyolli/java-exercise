package codeup;

import java.util.Scanner;

public class CodeUp1015 {
    public static void main(String[] args) {

        //실수 소수점 세번째 자리에서 반올림하여 둘째자리까지 표현하기
        Scanner sc = new Scanner(System.in);
        float num = sc.nextFloat();

        System.out.printf("%.2f", num);
    }
}
