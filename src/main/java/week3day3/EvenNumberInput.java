package week3day3;

import java.util.Scanner;

public class EvenNumberInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input; //초기화 값은 do안에서 설정

        do {
            System.out.println("짝수를 입력하세요: ");
            input = scanner.nextInt(); //질문하고 답 받을 수 있도록 여기서 초기

        } while (input % 2 != 0); //2로 나누었을 때 0이 아닌 경우 반복( 짝수가 아닌 경우 )
        //do 문에 하고싶은 것을 입력 do문을 닫고 while은 문 없이 언제까지 할 것인지 조건만 지정
        System.out.println("올바른 짝수가 입력되었습니다: " + input);

    }
}
