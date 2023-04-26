package codeup;

import java.util.Scanner;

public class CodeUp1035 {
    //16진수로 입력된 정수 1개를 8진수로 바꾸어 출력
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int octToDec; // 입력값을 8진수로 변경
        String s = sc.next();
        sc.close();
        //String을 8진수로 변경
        int hexToOct = Integer.parseInt(s,16);
        //16진수를 8진수로 출력
        System.out.printf("%o", hexToOct);

    }
}

