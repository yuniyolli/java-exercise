package codeup;

import java.util.Scanner;

public class CodeUp1037 {
    //정수 입력받아 아스키 문자로 출력하기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // char로 받아야되누!!!!! ㅇ ㅏㅏㅏ!!! 씨니ㅏㅃㅉ
        int i = sc.nextInt();
        sc.close(); //이건또뭐고
        //아스키문자로 변경
        char iToAscii = (char) i;
        //16진수를 8진수로 출력
        System.out.printf("%s", iToAscii);

    }
}


