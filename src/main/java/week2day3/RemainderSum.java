package week2day3;

import java.util.Scanner;

public class RemainderSum {
    public static void main(String[] args) {
        System.out.println("세자리 수를 입력하세요.");

        Scanner sc = new Scanner(System.in);
        //10으로 나눈 값의 나머지: 가장 마지막에 남은 1의 자리만 알 수 있다
        // -> 활용: 나머지를 알아낸 후, 다시 10으로 나누고 정수로 받을 경우, 소수점없이 깔끔한 두자리수
        // 다시 나머지를 구하면 마지막 한자리가 빠진, 십의자리에 있는 수를 알 수 있음
        int num = sc.nextInt();
        int units = num % 10; //들어온 숫자를 10으로 나눈 나머지: 1의 자리
        int tens = num / 10; //세자리 수를 두자리 수로 변환
        int numTens = tens % 10; //십의 자리수가 나옴
        int hundreds = tens / 10; //백의 자리 수가 나옴
        int numHundreds = hundreds % 10;
        int sum = units + numHundreds + numTens;

        System.out.printf("%d의 각 자리수는 %d, %d, %d\n", num, numHundreds, numTens, units);
        System.out.printf("각 자리 수의 합은 %d", sum);
    }
}