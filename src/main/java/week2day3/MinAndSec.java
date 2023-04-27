package week2day3;

import java.util.Scanner;

public class MinAndSec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sec = sc.nextInt();
        int min = sec / 60; // 분 구하기
        int remainSec = sec % 60; //남은 초 구하기

        System.out.printf("%d분 %d초", min, remainSec);

    }
}
