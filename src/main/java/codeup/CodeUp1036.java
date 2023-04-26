package codeup;

import java.util.Scanner;

public class CodeUp1036 {
    //영문자 1개 입력받아 아스키 코드 표의 10진수 값으로 출력
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // char로 받아야되누!!!!! ㅇ ㅏㅏㅏ!!! 씨니ㅏㅃㅉ
        char asciiToNum = sc.next().charAt(0);
        sc.close();
        //String을 8진수로 변경
        int asciiToDec = (int) asciiToNum;
        //16진수를 8진수로 출력
        System.out.printf("%d", asciiToDec);

    }
}
