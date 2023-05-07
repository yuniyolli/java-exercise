package codeup;

import java.util.Scanner;

public class CodeUp1620 {
    //자릿수의 합 구하기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numSc = sc.nextInt();
        int sumRemain = 0;

        while (numSc > 0) {
            sumRemain += numSc % 10;
            numSc = numSc / 10;
        }
        System.out.println(sumRemain);
    }
}


