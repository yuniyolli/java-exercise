package codeup;

import java.util.Scanner;

public class CodeUp1078 {
    public static void main(String[] args) {
        //정수 값 받기 및 초기화
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        //짝수 값을 모두 더해서 담아줄 변수 만들기 및 초기화
        int sum = 0;

        //i는 1부터(0은 어차피 0이다.), 내가 입력한 값까지, 1씩 더하며 반복한다
        for (int i = 1; i <= num; i++) {
            //만약에 1부터 num까지 들어가는 자연수가 짝수라면
            if (i % 2 == 0) {
                //이번에는 자연수i는 sum이라는 통에 더해주고 sum의 값을 바꾸어 주었다.
                sum = sum + i;
                //아니면(홀수면) 무시하고 다음 값을 넣기 (꼭 필요한 부분은 아닌듯하다.)
            }
            //else continue;

        }
        //sum 출력하기
        System.out.println(sum);



    }
}