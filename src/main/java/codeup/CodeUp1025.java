package codeup;

import java.util.Scanner;

public class CodeUp1025 {
    public static void main(String[] args) {
        //다섯자리 정수 입력받기 (수 한 줄 통쨰로)
        Scanner sc = new Scanner(System.in);
        String eachNum = sc.nextLine();

        //각 자리의 숫자 변수선언 및 초기화
        char num1 = eachNum.charAt(0);
        char num2 = eachNum.charAt(1);
        char num3 = eachNum.charAt(2);
        char num4 = eachNum.charAt(3);
        char num5 = eachNum.charAt(4);

        //포맷팅 및 출력하기
        System.out.printf("[%s0000]\n", num1);
        System.out.printf("[%s000]\n", num2);
        System.out.printf("[%s00]\n", num3);
        System.out.printf("[%s0]\n", num4);
        System.out.printf("[%s]\n", num5);

    }
}
