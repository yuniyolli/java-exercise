package codeup;

import java.util.Scanner;

public class CodeUp1088 {
    public static void main(String[] args) {
        //숫자 입력받기
        Scanner sc = new Scanner(System.in);

        //입력받은 값 정수로 초기화하기
        int tillNum = sc.nextInt();

        //tillNum까지 반복문만들기
        for (int i = 0; i <= tillNum; i++) {
            //3의 배수일 경우 지나가기 (continue;)
            if(i % 3 == 0) continue;
            //3의 배수를 제외한 i의 값 출력하기
            System.out.println(i);
        }

    }
}
