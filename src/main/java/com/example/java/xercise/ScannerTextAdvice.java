package com.example.java.xercise;

import java.util.Scanner;

public class ScannerTextAdvice {
    public void inputTwoNumbersAndPlus() {
        Scanner sc = new Scanner(System.in);
        System.out.println("두 개의 숫자를 입력하세요. 입력 엔터 입력 엔터");
        System.out.print("첫번째 숫자: ");
        System.out.println("첫번쨰 숫자는 " + sc.nextInt() + "입니다.");
        System.out.print("두번째 숫자: ");
        System.out.println("두번째 숫자는 " + sc.nextInt() + "입니다.");

    }
}
