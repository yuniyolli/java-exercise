package codeup;

import java.util.Scanner;

public class CodeUp1116 {
    //입력받은 값 연산자 활용하기
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();

        System.out.printf("%d+%d=%d\n", num1, num2, num1+num2);
        System.out.printf("%d-%d=%d\n", num1, num2, num1-num2);
        System.out.printf("%d*%d=%d\n", num1, num2, num1*num2);
        System.out.printf("%d/%d=%d\n", num1, num2, num1/num2);


    }

}
