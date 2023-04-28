package codeup;

import java.util.Scanner;

public class CodeUp1065 {
    public static void main(String[] args) {
//수 받기_ 띄어쓰기로 받기(nextLine)
        Scanner sc = new Scanner(System.in);
        String numbers = sc.nextLine();
        //수 배열 반들기
        String[] splitNum = numbers.split(" ");
        //문자열 정수형으로 변환하기
        int aint = Integer.parseInt(splitNum[0]);
        int bint = Integer.parseInt(splitNum[1]);
        int cint = Integer.parseInt(splitNum[2]);
//if문으로 바꾸기
    if (aint % 2 == 0) {
        System.out.printf("%d\n", aint);
    }
    if (bint % 2 == 0) {
        System.out.printf("%d\n", bint);
    }
    if (cint % 2 == 0) {
        System.out.printf("%d\n", cint);
    }
    //항상 하나의 if문 끝나면 닫아주기 else, 앞에 조건문이 false가 나오면 뒤에있는 나머지 조건문을 실행하지 않음.
    }
    }