package codeup;

import java.util.Scanner;

public class CodeUp1067 {
    public static void main(String[] args) {
        //정수 입력받기
        Scanner sc = new Scanner(System.in);
        //변수선언 및 초기화
        int num = sc.nextInt();
        //음수일 경우 minus출력
        if (num < 0) {
            System.out.println("minus");
            //그리고 2로 나눈 나머지롤 짝수 else 홀수 판별 및 출력
            if (num % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
            // minus가 아니라면 plus출력
        } else {
            System.out.println("plus");
            //그리고 양수의 짝수 else 홀수 판별 및 출력
            if (num % 2 == 0) {
                System.out.println("even");

            } else {
                System.out.println("odd");
            }

        }

    }
}