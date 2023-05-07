package codeup;

import java.util.Scanner;

public class CodeUp1024 {
    public static void main(String[] args) {
        //영어 단어를 문자열로 받아 각 줄마다 한 단어씩 ''안에 표시되도록

        //단어 받기
        Scanner sc = new Scanner(System.in);
        String oneWord = sc.nextLine();

        //한 글지씩, 길이의 마지막까지 반복하여 문자 입력받기
        for (int i = 0; i < oneWord.length(); i++) {
            // for (int i = 0; i <= oneWord.length(); i++) { 는 오류가 나옴 //array처럼 문자열의 순서도 0부터 시작. 그래서 같다가 들어가면 마지막 문자는 없는데 뱉어내라는 말이 됨
            // Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 3
            char oneWordSplit = oneWord.charAt(i);
            //문자 출력하기
            System.out.printf("'%s'\n", oneWordSplit);
        }

    }
}
