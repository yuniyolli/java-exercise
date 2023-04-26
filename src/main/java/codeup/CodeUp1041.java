package codeup;

import java.util.Scanner;

public class CodeUp1041 {
    public static void main(String[] args) {
        //스캐너로 숫자 받기
        Scanner sc = new Scanner(System.in);
    //charAt(순서)로 특정 알파위치의 문자만 가지고 오기
        char alphabet = sc.next().charAt(0);
        //문자를 아스키코드(숫자)로 바꾸고 다음 알파벳을 위해 1더하기
        int alphabetToAscii = (int)alphabet + 1 ;
        //입력한 문자의 아스키코드 +1을 문자로 변수선언하기
        char asciiToAlphabet = (char) alphabetToAscii;
        System.out.println(asciiToAlphabet);

    }
}
