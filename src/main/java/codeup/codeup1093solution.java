package codeup;

import java.util.Scanner;

public class codeup1093solution {
    public static void main(String[] args) {
        //랜덤출석부르기. 입력1. 몇명을 부를까, 입력2. 누구를 부를까
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt(); //입력1. 처음에 넣을 값의 개수? 랜덤 출석 몇 명 불러볼까
        //이 때 10을 입력하고 엔터하면 사이즈로 저장?
        int[] answer = new int[23 +1]; //반 전체 학생의 수 배열 만들기
        //이후에 공백으로 수 배열 10개 입력하면 이제 아래 식에 적용?
        for (int i = 0; i < size; i++) { //0에서부터 내가 입력한 랜덤 출석 부를 횟수까지 반복
            answer[sc.nextInt()]++; //입력2. 배열 중에 내가 입력한 인덱스 값에 위치한 학생번호에 1을 추가하기
        }

        for (int i = 1; i < answer.length ; i++) { //전체 반 학생수배열이 끝날 때까지 i 반복
            System.out.printf("%d ", answer[i]); //i는 answer배열에 있는 각 인덱스의 값.
        }
    }
}
//꼭 배열을 입력받고 난 뒤에는 스플릿을 해야 배열의 구성요소를 각각의 정보로 저장할 수 있을 것같은 느낌