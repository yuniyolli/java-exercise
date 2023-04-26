package codeup;

import java.util.Scanner;

public class CodeUp1034 {
    //8진정수 1개 입력받아 10진수로 바꾸기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int octToDec; // 입력값을 8진수로 변경
        String s = sc.next();
        sc.close();
        //String을 8진수로 변경
        int octToDec = Integer.parseInt(s,8);
       //8진수를 10진수로 출력
        System.out.printf("%d", octToDec);

    }
}
