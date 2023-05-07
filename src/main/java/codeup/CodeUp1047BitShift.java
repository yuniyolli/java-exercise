package codeup;

import java.util.Scanner;

public class CodeUp1047BitShift {
    //  비트시프트연산 <<, >>
    //a << n : a * 2 ^ n (입력값 a에 2의n승을 곱한 값)
    //a >> n : a / 2 ^ n (입력값 a에 2의n승을 나눈 값)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();

        System.out.println(val<<1);
    }
}
