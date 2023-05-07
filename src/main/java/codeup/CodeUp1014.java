package codeup;

import java.util.Scanner;

public class CodeUp1014 {
    public static void main(String[] args) {
        //입력받은 두 단어를 순서를 바꾸어 출력하기
        Scanner sc = new Scanner(System.in);
        String firstChar = sc.next();
        String secondChar = sc.next();

        System.out.printf("%s %s\n",secondChar, firstChar);
    }
}
